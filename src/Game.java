/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.ImageHelper;
import helpers.MathHelper;
import helpers.StringHelper;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 *
 * @author Thinh
 */
public class Game extends GameCanvas implements MenuAction {

    public static final int STATE_PLAY = 0;
    public static final int STATE_DONE = 1;
    public static final int STATE_MENU = 2;
    public static final int STATE_END = 3;
    public static final int MAZE_SIZE = 240;
    private Image controlPanelImage, floorImage, wallImage, backgroundImage;
    private Sprite gateSprite, keySprite;
    public Sprite characterSprite, fightSprite;
    private boolean loaded = false;
    public Explorer explorer;
    public Mummy[] mummy;
    public Scorpion[] scorpion;
    public int cellDimension;
    public int escapeDirection;
    public int time = 0, fps = 0;
    public int[] escapeCell = new int[2];
    public int[] gate = null;
    private Vector undoData = new Vector();
    public int state;
    public int eTop = 0, eLeft = 0;
    private Main parent;
    public LevelManager lvlMan;
    public int score, addScore, bonusScore;
    private Timer timer;
    private Menu menu;
    public boolean isTutorial = false;
    public boolean returnMainMenu = false;

    public Game(Main mainMidlet) {
        super(false);
        parent = mainMidlet;
        setFullScreenMode(true);
    }

    private void startTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                update();
                repaint();
            }
        }, 0, 40);
    }
    
    protected void hideNotify() {
        try {
            quickMenu();
        } catch (Exception ex) {
        }
    }

    private void update() {
        if (state == STATE_END) {
            return;
        }
        if (state != STATE_DONE) {
            for (int i = 0; i < mummy.length; i++) {
                if (mummy[i].state != Enemy.STATE_DIE) {
                    mummy[i].update();
                }
            }
            for (int i = 0; i < scorpion.length; i++) {
                if (scorpion[i].state != Enemy.STATE_DIE) {
                    scorpion[i].update();
                }
            }
            //check player control
            if (explorer.state == Explorer.STATE_WAIT) {
                int opponentTurn = mummy.length + scorpion.length;
                for (int i = 0; i < mummy.length; i++) {
                    if (mummy[i].state == Enemy.STATE_DIE || mummy[i].numMove == 0) {
                        opponentTurn--;
                    }
                    if (mummy[i].state == Enemy.STATE_FIGHT) {
                        opponentTurn++;
                    }
                }
                for (int i = 0; i < scorpion.length; i++) {
                    if (scorpion[i].state == Enemy.STATE_DIE || scorpion[i].numMove == 0) {
                        opponentTurn--;
                    }
                    if (scorpion[i].state == Enemy.STATE_FIGHT) {
                        opponentTurn++;
                    }
                }
                if (opponentTurn == 0) {
                    if (isTutorial) {
                        explorer.state = Explorer.STATE_STAY;
                        if (((TutorialManager) lvlMan).key.isEmpty()) {
                            explorer.checkEscape();
                        }
                        return;
                    }
                    if (!explorer.checkEscape()) {
                        explorer.state = Explorer.STATE_STAY;
                    } else {
                        bonusScore = lvlMan.basicScore;
                        if (time > 20) {
                            bonusScore -= ((int) ((time - 15) / 2)) * 5;
                        }
                        if (bonusScore < 0) {
                            bonusScore = 0;
                        }
                        score += lvlMan.basicScore + bonusScore;
                    }
                }
            } else if (explorer.state != Explorer.STATE_STAY) {
                explorer.update();
            }
            //open, close gate
            if (lvlMan.gateData != null) {
                if (gate[1] == 1 && gate[0] > 0) {
                    gate[0]--;
                }
                if (gate[1] == 0 && gate[0] < 7) {
                    gate[0]++;
                }
            }
        }

        //time
        if (fps < 25) {
            fps++;
        } else {
            fps = 0;
            time++;
        }

        if (addScore < score - 5) {
            addScore += 5;
        } else {
            addScore = score;
        }
    }

    public void paint(Graphics g) {
        if (state != STATE_END) {
            if (state == STATE_MENU) { //draw menu
                menu.render(g);
            } else if (loaded) { //draw game graphics
                drawGameGraphic(g);
            } else {
                g.fillRect(0, 0, Main.DIMENSION_WIDTH, Main.DIMENSION_HEIGHT);
            }
        } else {
            g.drawImage(backgroundImage, 0, 0, Graphics.TOP | Graphics.LEFT);
        }
    }

    private void drawGameGraphic(Graphics g) {
        if (state != STATE_DONE) {
            //draw floor
            g.drawImage(floorImage, eLeft, eTop, Graphics.TOP | Graphics.LEFT);

            //draw key and gate
            if (lvlMan.gateData != null) {
                //key
                keySprite.setPosition(MathHelper.round(cellDimension * (lvlMan.gateData[1] + 0.2)) + eLeft,
                        MathHelper.round(cellDimension * (lvlMan.gateData[0] + 0.2)) + eTop);
                keySprite.nextFrame();
                keySprite.paint(g);
                //gate
                gateSprite.setPosition(MathHelper.round((cellDimension * lvlMan.gateData[3]) - (3 * 1.2)) + eLeft,
                        MathHelper.round(cellDimension * (lvlMan.gateData[2] + 0.75)) + eTop);
                gateSprite.setFrame(gate[0]);
                gateSprite.paint(g);
            }

            //draw mummies
            for (int i = 0; i < mummy.length; i++) {
                mummy[i].render(g);
            }

            //draw scorpions
            for (int i = 0; i < scorpion.length; i++) {
                scorpion[i].render(g);
            }

            //draw explorer
            explorer.render(g);

            //draw walls
            g.drawImage(wallImage, eLeft, eTop, Graphics.TOP | Graphics.LEFT);
        } else {
            g.drawImage(backgroundImage, 0, 0, Graphics.TOP | Graphics.LEFT);
            if (fps < 12) {
                g.setColor(255, 255, 255);
                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM));
                g.drawString("PRESS ANY KEY", MAZE_SIZE / 2, MAZE_SIZE - 20, Graphics.HCENTER | Graphics.BASELINE);
            }
        }

        if (isTutorial) {
            g.drawImage(controlPanelImage, 0, MAZE_SIZE - (MAZE_SIZE) / 6, Graphics.TOP | Graphics.LEFT);
        } else {
            //draw control panel
            g.drawImage(controlPanelImage, 0, MAZE_SIZE, Graphics.LEFT | Graphics.TOP);

            //draw score on control panel
            g.setColor(255, 255, 0);
            g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
            g.drawString(StringHelper.showScore(addScore), Main.DIMENSION_WIDTH - 36, Main.DIMENSION_HEIGHT - 30, Graphics.HCENTER | Graphics.BASELINE);
        }
    }
    
    protected void pointerPressed(int x, int y) {
        if (isTutorial && state == STATE_PLAY) {
            if (explorer.state != Explorer.STATE_STAY) {
                return;
            }
            if(((TutorialManager) lvlMan).key.firstElement().toString().equals("-7")) {
                if (x >= Main.DIMENSION_WIDTH - 60 && x <= Main.DIMENSION_WIDTH) {
                    if (y >= Main.DIMENSION_HEIGHT - 30 && y <= Main.DIMENSION_HEIGHT) {
                        ((TutorialManager) lvlMan).key.removeElementAt(0);
                        ((TutorialManager) lvlMan).desc.removeElementAt(0);
                        if (((TutorialManager) lvlMan).key.isEmpty()) {
                            if(!explorer.checkEscape()) {
                                done();
                            }
                        } else {
                            prepareControlPanel();
                        }
                    }
                }
            }
            return;
        }
        
        switch (state) {
            case STATE_PLAY:
                //menu
                if (x >= 0 && x <= 60) {
                    if (y >= Main.DIMENSION_HEIGHT - 30 && y <= Main.DIMENSION_HEIGHT) {
                        quickMenu();
                    }
                }
                //undo
                else if (x >= Main.DIMENSION_WIDTH - 60 && x <= Main.DIMENSION_WIDTH) {
                    if (y >= Main.DIMENSION_HEIGHT - 30 && y <= Main.DIMENSION_HEIGHT) {
                        execUndo();
                    }
                }
                break;

            case STATE_DONE:
                if (x >= 0 && x <= MAZE_SIZE) {
                    if (y >= 0 && y <= MAZE_SIZE) {
                        nextLevel();
                    }
                }
                break;

            case STATE_MENU:
                menu.pointerPressed(x, y);
                repaint();
                break;

            case STATE_END:
                abandon();
                break;
        }
    }

    protected void keyPressed(int keyCode) {
        int actionCode = getGameAction(keyCode);
        if (isTutorial && state == STATE_PLAY) {
            if (explorer.state != Explorer.STATE_STAY) {
                return;
            }
            if (Integer.toString(actionCode).equals(((TutorialManager) lvlMan).key.firstElement().toString())) {
                ((TutorialManager) lvlMan).key.removeElementAt(0);
                ((TutorialManager) lvlMan).desc.removeElementAt(0);
                switch (actionCode) {
                    case 1: //UP
                        explorer.moveUp();
                        break;

                    case 5: //RIGHT
                        explorer.moveRight();
                        break;

                    case 6: //DOWN
                        explorer.moveDown();
                        break;

                    case 2: //LEFT
                        explorer.moveLeft();
                        break;

                    case 8: //FIRE
                        explorer.stand();
                        break;
                }
                prepareControlPanel();
                return;
            }
            if (keyCode == -7 && Integer.toString(keyCode).equals(((TutorialManager) lvlMan).key.firstElement().toString())) {
                ((TutorialManager) lvlMan).key.removeElementAt(0);
                ((TutorialManager) lvlMan).desc.removeElementAt(0);
                if (((TutorialManager) lvlMan).key.isEmpty()) {
                    if(!explorer.checkEscape()) {
                        done();
                    }
                } else {
                    prepareControlPanel();
                }
            }
            return;
        }
        
        switch (state) {
            case STATE_PLAY:
                if (explorer.state != Explorer.STATE_STAY) {
                    return;
                }
                switch (actionCode) {
                    case 1: //UP
                        explorer.moveUp();
                        break;

                    case 5: //RIGHT
                        explorer.moveRight();
                        break;

                    case 6: //DOWN
                        explorer.moveDown();
                        break;

                    case 2: //LEFT
                        explorer.moveLeft();
                        break;

                    case 8: //FIRE
                        explorer.stand();
                        break;
                }

                switch (keyCode) {
                    case -7: //SOFTRIGHT
                        execUndo();
                        break;

                    case -6: //SOFTLEFT
                    case 114:
                        quickMenu();
                        break;
                }
                break;

            case STATE_DONE:
                nextLevel();
                break;

            case STATE_MENU:
                menu.keyPressed(keyCode, actionCode);
                repaint();
                break;

            case STATE_END:
                abandon();
                break;
        }
    }

    private void prepareMazeFloor() {
        floorImage = Image.createImage(MAZE_SIZE, MAZE_SIZE);
        Graphics g = floorImage.getGraphics();

        //draw floor
        g.drawImage(ImageHelper.loadImage("/images/floor" + lvlMan.mazeData.length + ".png"),
                0, 0, Graphics.TOP | Graphics.LEFT);

        //draw traps
        if(lvlMan.trapData != null) {
            for (int i = 0; i < lvlMan.trapData.length; i++) {
                g.drawImage(ImageHelper.loadImage("/images/trap" + lvlMan.mazeData.length + ".png"),
                        cellDimension * lvlMan.trapData[i][1],
                        cellDimension * lvlMan.trapData[i][0],
                        Graphics.TOP | Graphics.LEFT);
            }
        }

        //draw exit door
        g.drawImage(ImageHelper.loadImage("/images/exitdoor" + escapeDirection + lvlMan.mazeData.length + ".png"),
                cellDimension * escapeCell[1],
                cellDimension * escapeCell[0],
                Graphics.TOP | Graphics.LEFT);
    }

    private void prepareWall() {
        wallImage = Image.createImage(MAZE_SIZE, MAZE_SIZE);
        Graphics g = wallImage.getGraphics();

        //draw walls
        Image[] wall = new Image[]{
            ImageHelper.loadImage("/images/wall0" + lvlMan.mazeData.length + ".png"),
            ImageHelper.loadImage("/images/wall1" + lvlMan.mazeData.length + ".png"),
            ImageHelper.loadImage("/images/wall2" + lvlMan.mazeData.length + ".png"),
            ImageHelper.loadImage("/images/wall3" + lvlMan.mazeData.length + ".png")
        };
        for (int i = 0; i < lvlMan.mazeData.length; i++) {
            for (int j = 0; j < lvlMan.mazeData.length; j++) {
                if (lvlMan.mazeData[i][j][0] && lvlMan.mazeData[i][j][1]) { //0 - left; 1 - bottom;
                    g.drawImage(wall[3],
                            MathHelper.round((cellDimension * j) - (3 * 1.2)),
                            MathHelper.round((cellDimension * i) - ((cellDimension * 15) / 60)),
                            Graphics.LEFT | Graphics.TOP);
                } else if (lvlMan.mazeData[i][j][0]) {
                    if (i < lvlMan.mazeData.length - 1) {
                        g.drawImage(wall[0],
                                MathHelper.round((cellDimension * j) - (3 * 1.2)),
                                MathHelper.round((cellDimension * i) - ((cellDimension * 15) / 60)),
                                Graphics.LEFT | Graphics.TOP);
                    } else {
                        g.drawImage(wall[1],
                                MathHelper.round((cellDimension * j) - (3 * 1.2)),
                                MathHelper.round((cellDimension * i) - ((cellDimension * 15) / 60)),
                                Graphics.LEFT | Graphics.TOP);
                    }
                } else if (lvlMan.mazeData[i][j][1]) {
                    g.drawImage(wall[2],
                            MathHelper.round((cellDimension * j) - (3 * 1.2)),
                            MathHelper.round((cellDimension * i) - ((cellDimension * 15) / 60)),
                            Graphics.LEFT | Graphics.TOP);
                }
            }
        }
        wall = null;
        g = null;
        int[] rgb = new int[MAZE_SIZE * MAZE_SIZE];
        wallImage.getRGB(rgb, 0, MAZE_SIZE, 0, 0, MAZE_SIZE, MAZE_SIZE);
        for (int i = 0; i < rgb.length; ++i) {
            if (rgb[i] == 0xffffffff) {
                rgb[i] &= 0x00ffffff;
            }
        }
        wallImage = Image.createRGBImage(rgb, MAZE_SIZE, MAZE_SIZE, true);
    }

    private void prepareControlPanel() {
        if(!isTutorial) {
            controlPanelImage = Image.createImage(MAZE_SIZE, 80);
            Graphics g = controlPanelImage.getGraphics();
            g.drawImage(ImageHelper.loadImage("/images/controlpanel.png"), 0, 0, Graphics.TOP | Graphics.LEFT);
            g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
            g.setColor(255, 255, 0);
            g.drawString(lvlMan.tomb + "-" + lvlMan.level, 36, 50, Graphics.HCENTER | Graphics.BASELINE);
        } else {
            if (!((TutorialManager) lvlMan).key.isEmpty()) {
                controlPanelImage = Image.createImage(MAZE_SIZE, 120);
                Graphics g = controlPanelImage.getGraphics();
                g.setColor(0, 0, 0);
                g.fillRect(0, 0, controlPanelImage.getWidth(), controlPanelImage.getHeight());
                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
                g.setColor(255, 255, 255);
                StringHelper.drawWrapString(g, ((TutorialManager) lvlMan).desc.firstElement().toString(),
                        10, 10, 220, Graphics.TOP | Graphics.LEFT);
                g.setColor(255, 255, 0);
                if (((TutorialManager) lvlMan).key.firstElement().toString().equals("-7")) {
                    g.drawString("CONTINUE", Main.DIMENSION_WIDTH - 10, Main.DIMENSION_HEIGHT - 240 + 36, Graphics.BOTTOM | Graphics.RIGHT);
                } else {
                    StringBuffer keyName = new StringBuffer();
                    switch (Integer.parseInt(((TutorialManager) lvlMan).key.firstElement().toString())) {
                        case 1:
                            keyName.append("[UP/2]");
                            break;

                        case 2:
                            keyName.append("[LEFT/4]");
                            break;

                        case 5:
                            keyName.append("[RIGHT/6]");
                            break;

                        case 6:
                            keyName.append("[DOWN/8]");
                            break;

                        case 8:
                            keyName.append("[FIRE/5/SPACE]");
                            break;
                    }
                    g.drawString(keyName.toString(), Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT - 240 + 36, Graphics.HCENTER | Graphics.BOTTOM);
                }
            }
        }
    }

    private void prepareResource() {
        backgroundImage = null;
        prepareWall();
        prepareMazeFloor();
        prepareControlPanel();
        loadDynamicResource();
        loaded = true;
    }

    private void updateResource(int oldMazeSize) {
        loaded = false;
        backgroundImage = null;
        prepareWall();
        prepareMazeFloor();
        prepareControlPanel();
        if (oldMazeSize != lvlMan.mazeData.length) {
            loadDynamicResource();
        }
        loaded = true;
    }

    private void loadDynamicResource() {
        characterSprite = new Sprite(
                ImageHelper.loadImage("/images/character" + lvlMan.mazeData.length + ".png"),
                cellDimension, cellDimension);
        fightSprite = new Sprite(
                ImageHelper.loadImage("/images/fight" + lvlMan.mazeData.length + ".png"),
                cellDimension, cellDimension);
        gateSprite = new Sprite(
                ImageHelper.loadImage("/images/gate" + lvlMan.mazeData.length + ".png"),
                MathHelper.round(cellDimension * 1.2), MathHelper.round(cellDimension * 0.3));
        keySprite = new Sprite(
                ImageHelper.loadImage("/images/key" + lvlMan.mazeData.length + ".png"),
                MathHelper.round(cellDimension * 0.6), MathHelper.round(cellDimension * 0.6));
    }

    private void initDoor() {
        //0 tren - 1 phai - 2 duoi - 3 trai
        escapeDirection = lvlMan.doorData[0];
        int doorPos = lvlMan.doorData[1];
        lvlMan.doorData = null;

        //ve hinh cua ra
        switch (escapeDirection) {
            case 0:
                escapeCell[0] = 0;
                escapeCell[1] = doorPos;
                break;

            case 1:
                escapeCell[0] = doorPos;
                escapeCell[1] = lvlMan.mazeData.length - 1;
                break;

            case 2:
                escapeCell[0] = lvlMan.mazeData.length - 1;
                escapeCell[1] = doorPos;
                break;

            default:
                escapeCell[0] = doorPos;
                escapeCell[1] = 0;
                break;
        }
    }

    private void initMummy() {
        //0 - row; 1 - column; 2 - type;
        mummy = new Mummy[lvlMan.mummyData.length];
        for (int i = 0; i < lvlMan.mummyData.length; i++) {
            int[] position = new int[]{lvlMan.mummyData[i][0], lvlMan.mummyData[i][1]};
            mummy[i] = new Mummy(i, lvlMan.mummyData[i][2], position, this);
        }
        lvlMan.mummyData = null;
    }

    private void initScorpion() {
        //0 - row; 1 - column; 2 - type;
        scorpion = new Scorpion[lvlMan.scorpionData.length];
        for (int i = 0; i < lvlMan.scorpionData.length; i++) {
            int[] position = new int[]{lvlMan.scorpionData[i][0], lvlMan.scorpionData[i][1]};
            scorpion[i] = new Scorpion(i, lvlMan.scorpionData[i][2], position, this);
        }
        lvlMan.scorpionData = null;
    }

    public void switchEnemyTurn() {
        explorer.state = Explorer.STATE_WAIT;
        for (int i = 0; i < mummy.length; i++) {
            if (mummy[i].state != Enemy.STATE_DIE) {
                mummy[i].numMove = 2;
            }
        }
        for (int i = 0; i < scorpion.length; i++) {
            if (scorpion[i].state != Enemy.STATE_DIE) {
                scorpion[i].numMove = 1;
            }
        }
    }

    public void updateHistory() {
        Move recent = new Move();

        recent.explorer = new int[]{explorer.position[0], explorer.position[1]};

        Vector rData = new Vector();
        for (int i = 0; i < mummy.length; i++) {
            if (mummy[i].state != Enemy.STATE_DIE) {
                rData.addElement(new int[]{mummy[i].position[0], mummy[i].position[1]});
            } else {
                rData.addElement(null);
            }
        }
        recent.mummy = rData;

        rData = new Vector();
        for (int i = 0; i < scorpion.length; i++) {
            if (scorpion[i].state != Enemy.STATE_DIE) {
                rData.addElement(new int[]{scorpion[i].position[0], scorpion[i].position[1]});
            } else {
                rData.addElement(null);
            }
        }
        recent.scorpion = rData;

        if (lvlMan.gateData != null) {
            if (gate[1] == 0) {
                recent.gate = false;
            } else {
                recent.gate = true;
            }
        }

        undoData.addElement(recent);
    }

    public void execUndo() {
        if (undoData.size() > 0) {
            Move uData = (Move) undoData.lastElement();

            explorer.position = uData.explorer;
            explorer.x = explorer.position[1] * cellDimension;
            explorer.y = explorer.position[0] * cellDimension;
            explorer.state = Explorer.STATE_STAY;
            explorer.timeLine = 0;

            for (int i = 0; i < uData.mummy.size(); i++) {
                int[] temp = (int[]) uData.mummy.elementAt(i);
                if (temp != null) {
                    mummy[i].state = Enemy.STATE_STAY;
                    mummy[i].position = new int[]{temp[0], temp[1]};
                    mummy[i].x = temp[1] * cellDimension;
                    mummy[i].y = temp[0] * cellDimension;
                } else {
                    mummy[i].state = Enemy.STATE_DIE;
                }
                mummy[i].timeLine = 0;
                mummy[i].numMove = 0;
            }

            for (int i = 0; i < uData.scorpion.size(); i++) {
                int[] temp = (int[]) uData.scorpion.elementAt(i);
                if (temp != null) {
                    scorpion[i].state = Enemy.STATE_STAY;
                    scorpion[i].position = new int[]{temp[0], temp[1]};
                    scorpion[i].x = temp[1] * cellDimension;
                    scorpion[i].y = temp[0] * cellDimension;
                } else {
                    scorpion[i].state = Enemy.STATE_DIE;
                }
                scorpion[i].timeLine = 0;
                scorpion[i].numMove = 0;
            }

            if (lvlMan.gateData != null) {
                if (uData.gate) {
                    gate[0] = 0;
                    gate[1] = 1;
                } else {
                    gate[0] = 7;
                    gate[1] = 0;
                }
            }

            undoData.removeElementAt(undoData.size() - 1);
        }
    }

    public void nextLevel() {
        undoData = new Vector();
        if (lvlMan.tomb == 15 && lvlMan.level == 15) {
            end();
            lvlMan = null;
        } else {
            int oldMazeSize = lvlMan.mazeData.length;
            lvlMan.nextLevel();

            if (!isTutorial) {
                try {
                    RecordStore rs = RecordStore.openRecordStore(Main.RMS, false);
                    byte[] writer = Integer.toString(lvlMan.tomb).getBytes();
                    rs.setRecord(1, writer, 0, writer.length);
                    writer = Integer.toString(lvlMan.level).getBytes();
                    rs.setRecord(2, writer, 0, writer.length);
                    writer = Integer.toString(score).getBytes();
                    rs.setRecord(3, writer, 0, writer.length);
                    rs.closeRecordStore();
                } catch (RecordStoreException ex) {
                }
            }

            beginLevel();
            updateResource(oldMazeSize);
            //change state to play
            state = STATE_PLAY;
        }
    }

    private void beginLevel() {
        //create maze data
        cellDimension = MAZE_SIZE / lvlMan.mazeData.length;

        //create key and gate data
        if (lvlMan.gateData != null) {
            gate = new int[2];
            gate[0] = 0; //frame hien tai cua sprite
            gate[1] = 1; //tinh trang: 1 - dong; 0 - mo
        } else {
            gate = null;
        }


        //create exit door, mummies and scorpions data
        initDoor();
        initMummy();
        initScorpion();

        //create explorer
        explorer = new Explorer(this);
        lvlMan.explorerData = null;

        //reset
        time = 0;
        fps = 0;
    }

    public void startTutorial() {
        isTutorial = true;
        lvlMan = new TutorialManager();
        beginLevel();
        prepareResource();
        //change state to play
        state = STATE_PLAY;
        startTimer();
    }

    public void start() {
        isTutorial = false;
        int initTomb, initLevel;
        try {
            RecordStore rs = RecordStore.openRecordStore(Main.RMS, false);
            initTomb = Integer.parseInt(new String(rs.getRecord(1)));
            initLevel = Integer.parseInt(new String(rs.getRecord(2)));
            score = addScore = Integer.parseInt(new String(rs.getRecord(3)));
            rs.closeRecordStore();
        } catch (RecordStoreException ex) {
            initTomb = 1;
            initLevel = 1;
            score = addScore = 0;
        }
        lvlMan = new LevelManager(initTomb, initLevel);
        beginLevel();
        prepareResource();

        //change state to play
        state = STATE_PLAY;
        startTimer();
    }

    public void restart() {
        timer.cancel();
        menu = null;
        while (undoData.size() > 1) {
            undoData.removeElementAt(undoData.size() - 1);
        }
        execUndo();
        state = STATE_PLAY;
        startTimer();
    }

    public void undo() {
        timer.cancel();
        menu = null;
        execUndo();
        state = STATE_PLAY;
        startTimer();
    }

    public void done() {
        floorImage = null;
        wallImage = null;
        backgroundImage = Image.createImage(MAZE_SIZE, MAZE_SIZE);
        Graphics g = backgroundImage.getGraphics();
        if (!isTutorial) {
            if (lvlMan.level == 15) {
                g.drawImage(ImageHelper.loadImage("/images/endtomb.png"), 0, 0, Graphics.TOP | Graphics.LEFT);
                Sprite niceTreasures = new Sprite(
                        ImageHelper.loadImage("/images/nicetreasures.png"),
                        67, 64);
                niceTreasures.setPosition(100, 30);
                niceTreasures.setFrame(lvlMan.tomb - 1);
                niceTreasures.paint(g);
            } else {
                g.drawImage(ImageHelper.loadImage("/images/nextlevel.png"), 0, 0, Graphics.TOP | Graphics.LEFT);
                g.setColor(255, 255, 255);
                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
                g.drawString(lvlMan.tomb + " - " + lvlMan.level, 150, 50, Graphics.TOP | Graphics.LEFT);
                g.drawString(MathHelper.showTime(time), 150, 80, Graphics.TOP | Graphics.LEFT);
                g.drawString(Integer.toString(lvlMan.basicScore), 150, 110, Graphics.TOP | Graphics.LEFT);
                g.drawString(Integer.toString(bonusScore), 150, 140, Graphics.TOP | Graphics.LEFT);
                g.drawString(Integer.toString(score), 150, 170, Graphics.TOP | Graphics.LEFT);
            }
            state = Game.STATE_DONE;
        } else {
            if (lvlMan.level == 5) {
                timer.cancel();
                timer = null;
                if (returnMainMenu) {
                    parent.gotoGuiderMenu();
                } else {
                    start();
                }
            } else {
                nextLevel();
            }
        }
    }

    private void end() {
        backgroundImage = ImageHelper.loadImage("/images/endgame.png");
        state = STATE_END;
        characterSprite = null;
        fightSprite = null;
        gateSprite = null;
        keySprite = null;
    }

    public void lose() {
        state = STATE_MENU;
        Image temp = Image.createImage(Main.DIMENSION_WIDTH, Main.DIMENSION_HEIGHT);
        Graphics g = temp.getGraphics();
        drawGameGraphic(g);
        menu = new Menu(new MenuItem[]{
                    new MenuItem("Undo Move", Menu.COMMAND_UNDO),
                    new MenuItem("Reset Maze", Menu.COMMAND_RESTART),
                    new MenuItem("Abandon Hope", Menu.COMMAND_ABANDON),
                    new MenuItem("Main Menu", Menu.COMMAND_MAINMENU)
                }, temp, this);
    }

    public void quickMenu() {
        state = STATE_MENU;
        Image temp = Image.createImage(Main.DIMENSION_WIDTH, Main.DIMENSION_HEIGHT);
        Graphics g = temp.getGraphics();
        drawGameGraphic(g);
        menu = new Menu(new MenuItem[]{
                    new MenuItem("Resume Game", Menu.COMMAND_RESUME),
                    new MenuItem("Undo Move", Menu.COMMAND_UNDO),
                    new MenuItem("Reset Maze", Menu.COMMAND_RESTART),
                    new MenuItem("Main Menu", Menu.COMMAND_MAINMENU)
                }, temp, this);
    }

    public void abandon() {
        try {
            RecordStore rs = RecordStore.openRecordStore(Main.RMS, false);
            byte[] writer = "1".getBytes();
            rs.setRecord(1, writer, 0, writer.length);
            rs.setRecord(2, writer, 0, writer.length);
            writer = "0".getBytes();
            rs.setRecord(3, writer, 0, writer.length);
            rs.closeRecordStore();
        } catch (RecordStoreException ex) {
        }
        clean();
        if (score > 1000) {
            parent.submitScore(score);
        } else {
            parent.gotoMainMenu();
        }
    }

    private void clean() {
        explorer = null;
        scorpion = null;
        mummy = null;
        lvlMan = null;
    }

    public void mainMenu() {
        System.out.println("main menu");
        parent.gotoMainMenu();
    }

    public void resume() {
        menu = null;
        state = STATE_PLAY;
        startTimer();
    }

    public void startMenuTimer() {
        timer.cancel();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                menu.update();
                repaint();
            }
        }, 0, 40);
    }

    public void stopMenuTimer() {
        timer.cancel();
    }

    public void dispose() {
        if(timer != null) {
            timer.cancel();
            timer = null;
        }
        controlPanelImage = null;
        floorImage = null;
        wallImage = null;
        backgroundImage = null;
        gateSprite = null;
        keySprite = null;
        characterSprite = null;
        fightSprite = null;
        explorer = null;
        scorpion = null;
        escapeCell = null;
        gate = null;
        undoData = null;
        lvlMan = null;
        menu = null;
    }
}
