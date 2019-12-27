/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import helpers.ImageHelper;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

/**
 *
 * @author Thinh
 */
public class MainMenu extends GameCanvas implements MenuAction {

    private Main parent;
    private Timer timer;
    private Image gameTitleImage, aboutImage;
    public Menu menu;

    public MainMenu(Main mainMidlet) {
        super(false);
        parent = mainMidlet;
        setFullScreenMode(true);
        prepareResource();
    }
    
    public void paint(Graphics g) {
        if(aboutImage != null) {
            g.drawImage(aboutImage, 0, 0, Graphics.TOP | Graphics.LEFT);
            return;
        }
        if(menu != null) {
            menu.render(g);
            g.drawImage(gameTitleImage, 2, 25 - menu.marginTop / 2, Graphics.TOP | Graphics.LEFT);
        }
    }
    
    protected void pointerPressed(int x, int y) {
        if(aboutImage == null) {
            menu.pointerPressed(x, y);
        } else {
            aboutImage = null;
            createGuiderMenu();
        }
        repaint();
    }
    
    protected void keyPressed(int keyCode) {
        if(aboutImage == null) {
            menu.keyPressed(keyCode, getGameAction(keyCode));
        } else {
            aboutImage = null;
            createGuiderMenu();
        }
        repaint();
    }
    
    private void prepareResource() {
        gameTitleImage = ImageHelper.loadImage("/images/gametitle.png");
    }
    
    public void createMainMenu() {
        menu = new Menu(new MenuItem[] {
            new MenuItem("Start Game", Menu.COMMAND_START),
            new MenuItem("Instruction", Menu.COMMAND_GUIDER),
            new MenuItem("Leaderboard", Menu.COMMAND_LEADER),
            new MenuItem("Exit Game", Menu.COMMAND_QUIT)
        }, ImageHelper.loadImage("/images/menuback.png"), this);
    }
    
    public void createGuiderMenu() {
        menu = new Menu(new MenuItem[] {
            new MenuItem("Tutorial", Menu.COMMAND_TUTORIAL),
            new MenuItem("Help", Menu.COMMAND_INSTRUCTION),
            new MenuItem("About", Menu.COMMAND_ABOUT),
            new MenuItem("Main Menu", Menu.COMMAND_MAINMENU)
        }, ImageHelper.loadImage("/images/menuback.png"), this);
    }

    public void startMenuTimer() {
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
        timer = null;
    }
    
    public void gotoLeaderBoard() {
        parent.gotoLeaderBoard();
    }
    
    public void quitGame() {
        parent.notifyDestroyed();
    }
    
    public void gotoGame() {
        parent.gotoGame();
    }
    
    public void gotoInstruction() {
        try {
            parent.platformRequest("http://m.openitvn.net/mummymaze/");
            createGuiderMenu();
        }
        catch (ConnectionNotFoundException ex) {
        }
    }
    
    public void gotoAbout() {
        aboutImage = ImageHelper.loadImage("/images/about.png");
        repaint();
    }
    
    public void gotoTutorial() {
        parent.gotoTutorial(true);
    }
    
    public void gotoTutorialThenPlay() {
        parent.gotoTutorial(false);
    }
    
    public void dispose() {
        if(timer != null) {
            timer.cancel();
            timer = null;
        }
        menu = null;
    }
}
