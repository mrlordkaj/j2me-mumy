/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.ImageHelper;
import helpers.NetworkHelper;
import helpers.StringHelper;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 *
 * @author Thinh
 */
public class SubmitScore extends GameCanvas implements CommandListener {

    private Main parent;
    private Image background;
    private TextBox txtName;
    private StringBuffer playerName;
    private StringBuffer deviceId;
    private Command okCommand = new Command("OK", Command.OK, 1);
    private int score = 0;
    private boolean wait = true, sent = false, err = false;
    private boolean loaded = false, preload = false;
    private Timer timer;

    public SubmitScore(Main _parent, int _score) {
        super(false);
        setFullScreenMode(true);
        parent = _parent;
        score = _score;
        startTimer();
    }
    
    private void startTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                if(!preload) {
                    preload = true;
                    prepareResource();
                }
                if(!wait && !sent) {
                    sent = true;
                    try {
                        RecordStore rs = RecordStore.openRecordStore(Main.RMS, false);
                        byte[] writer = playerName.toString().getBytes();
                        rs.setRecord(4, writer, 0, writer.length);
                        rs.closeRecordStore();
                    } catch (RecordStoreException ex) {
                    }

                    try {
                        StringBuffer content = NetworkHelper.getContentViaHttp("http://m.openitvn.net/java.php?id=" + Main.SERVER_ID + "&passkey=" + Main.SERVER_PASSKEY + "&name=" + StringHelper.replace(playerName.toString(), " ", "%20") + "&score=" + score + "&deviceid=" + deviceId);
                        parent.gotoLeaderBoard();
                    } catch (IOException ex) {
                        err = true;
                    }
                }
                repaint();
            }
        }, 0, 40);
    }

    private void prepareResource() {
        background = ImageHelper.loadImage("/images/submitscore.png");
        try {
            RecordStore rs = RecordStore.openRecordStore(Main.RMS, false);
            playerName = new StringBuffer(new String(rs.getRecord(4)));
            deviceId = new StringBuffer(new String(rs.getRecord(5)));
            rs.closeRecordStore();
        } catch (RecordStoreException ex) {
            sent = true;
            err = true;
        }
        loaded = true;
    }

    public void paint(Graphics g) {
        if (!sent) {
            if(loaded) {
                g.drawImage(background, 0, 0, Graphics.TOP | Graphics.LEFT);
                g.drawString(StringHelper.showScore(score), Main.DIMENSION_WIDTH / 2, 130, Graphics.HCENTER | Graphics.BASELINE);
                g.drawString(playerName.toString(), Main.DIMENSION_WIDTH / 2, 210, Graphics.HCENTER | Graphics.BASELINE);
            }
        } else {
            System.out.println("sent");
            g.setColor(0, 0, 0);
            g.fillRect(0, 0, Main.DIMENSION_WIDTH, Main.DIMENSION_HEIGHT);
            g.setColor(255, 255, 255);
            if (!err) {
                g.drawString("sending data...", Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT / 2, Graphics.HCENTER | Graphics.BASELINE);
            } else {
                g.drawString("error occurred!", Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT / 2, Graphics.HCENTER | Graphics.BASELINE);
            }
        }
    }
    
    protected void pointerPressed(int x, int y) {
        if(sent) {
            if (err) {
                parent.gotoMainMenu();
            }
            return;
        }
        
        //change name
        if (x >= 90 && x <= 150) {
            if (y >= 160 && y <= 210) {
                StringBuffer pName = new StringBuffer();
                if (!playerName.toString().equals("Player")) {
                    pName.append(playerName);
                }
                txtName = new TextBox("Enter your name:", pName.toString(), 14, 0);
                txtName.addCommand(okCommand);
                txtName.setCommandListener(this);
                Display.getDisplay(parent).setCurrent(txtName);
                return;
            }
        }

        if (y >= 230 && y <= 260) {
            //ok
            if (x >= 24 && x <= 54) {
                wait = false;
            }
            //cancel
            else if (x >= 186 && x <= 216) {
                parent.gotoMainMenu();
            }
        }
    }

    protected void keyPressed(int keyCode) {
        if(sent) {
            if (err) {
                parent.gotoMainMenu();
            }
            return;
        }
        
        if (getGameAction(keyCode) == 8) { //change name
            StringBuffer pName = new StringBuffer();
            if (!playerName.toString().equals("Player")) {
                pName.append(playerName);
            }
            txtName = new TextBox("Enter your name:", pName.toString(), 14, 0);
            txtName.addCommand(okCommand);
            txtName.setCommandListener(this);
            Display.getDisplay(parent).setCurrent(txtName);
        }
        
        switch (keyCode) {
            case -6: //ok
                wait = false;
                return;

            case -7: //cancel
                parent.gotoMainMenu();
                break;
        }
    }

    public void commandAction(Command c, Displayable d) {
        if (c.getCommandType() == Command.OK) {
            if (txtName.getString().equals("")) {
                playerName = new StringBuffer("Player");
            } else {
                playerName = new StringBuffer(txtName.getString());
            }
            Display.getDisplay(parent).setCurrent(this);
        }
    }

    public void dispose() {
        loaded = false;
        sent = false;
        wait = true;
        if(timer != null) {
            timer.cancel();
            timer = null;
        }
        background = null;
        txtName = null;
        playerName = null;
        deviceId = null;
    }
}
