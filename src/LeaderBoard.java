/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import InneractiveSDK.IADView;
import helpers.ImageHelper;
import helpers.NetworkHelper;
import helpers.StringHelper;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

/**
 *
 * @author Thinh
 */
public class LeaderBoard extends GameCanvas {

    private static final int SCROLL_NONE = 0;
    private static final int SCROLL_UP = 1;
    private static final int SCROLL_DOWN = 2;
    private Main parent;
    private Image background, frontground;
    private StringBuffer content = new StringBuffer();
    private boolean err = false;
    private int marginTop = 0, stepY = 0;
    private int scrollState = SCROLL_NONE;
    private Timer timer;
    private Vector ads;
    private boolean loaded = false, preload = false;

    public LeaderBoard(Main mainMidlet) {
        super(false);
        parent = mainMidlet;
        setFullScreenMode(true);
        startTimer();
    }
    
    private void startTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                if(!preload) {
                    preload = true;
                    prepareResource();
                    try {
                        ads = IADView.getBannerAdData(parent, "Openitvn_MummyMazeDeluxe_Nokia");
                        loadScoreBoard();
                    } catch (Exception ex) {
                        ads = null;
                    }
                }
                update();
                repaint();
            }
        }, 0, 60);
    }

    private void update() {
        int lineHeight = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL).getHeight();
        if (scrollState == SCROLL_UP && marginTop < 0) {
            marginTop += lineHeight;
        } else if (scrollState == SCROLL_DOWN && marginTop > -lineHeight * 92) {
            marginTop -= lineHeight;
        } else {
            scrollState = SCROLL_NONE;
        }
    }

    public void paint(Graphics g) {
        if (!loaded) {
            g.setColor(0, 0, 0);
            g.fillRect(0, 0, Main.DIMENSION_WIDTH, Main.DIMENSION_HEIGHT);
            return;
        }
        g.drawImage(background, Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT / 2 - 2, Graphics.HCENTER | Graphics.VCENTER);
        g.setColor(255, 255, 255);
        g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
        if (content.length() > 0) {
            StringHelper.drawScoreBoard(g, content, 44, 84 + marginTop);
        } else {
            if (!err) {
                g.drawString("fetching data...", Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT / 2, Graphics.BASELINE | Graphics.HCENTER);
            } else {
                g.drawString("connection failed!", Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT / 2, Graphics.BASELINE | Graphics.HCENTER);
            }
        }
        g.drawImage(frontground, 0, 0, Graphics.TOP | Graphics.LEFT);
        try {
            g.drawImage((Image) ads.elementAt(0), Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT - 40, Graphics.TOP | Graphics.HCENTER);
        } catch (Exception ex) {
        }
    }

    protected void pointerPressed(int x, int y) {
        //close
        if (x >= 186 && x <= 216) {
            if (y >= 230 && y <= 260) {
                parent.gotoMainMenu();
                return;
            }
        }

        if (x >= 0 && x <= Main.DIMENSION_WIDTH) {
            if (y >= 260 && y <= Main.DIMENSION_HEIGHT) {
                try {
                    parent.platformRequest((String) ads.elementAt(1));
                } catch (ConnectionNotFoundException ex) {
                } catch (Exception ex) {
                }
            } else {
                stepY = y - marginTop;
            }
        }
    }

    protected void pointerReleased(int x, int y) {
        int lineHeight = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL).getHeight();
        if (marginTop > 0) {
            marginTop = 0;
        } else if (marginTop < -lineHeight * 92) {
            marginTop = -lineHeight * 92;
        }
    }

    protected void pointerDragged(int x, int y) {
        marginTop = y - stepY;
    }

    protected void keyPressed(int keyCode) {
        if (keyCode == -7) {
            parent.gotoMainMenu();
            return;
        }
        int actionCode = getGameAction(keyCode);
        switch (actionCode) {
            case 1: //UP
                scrollState = SCROLL_UP;
                break;

            case 6: //DOWN
                scrollState = SCROLL_DOWN;
                break;

            case 8:
                try {
                    parent.platformRequest((String) ads.elementAt(1));
                } catch (ConnectionNotFoundException ex) {
                } catch (Exception ex) {
                }
                break;
        }
    }

    protected void keyReleased(int keyCode) {
        scrollState = SCROLL_NONE;
    }

    private void prepareResource() {
        background = ImageHelper.loadImage("/images/leaderboardbackground.png");
        frontground = ImageHelper.loadImage("/images/leaderboard.png");
        loaded = true;
    }

    private void loadScoreBoard() {
        try {
            content = NetworkHelper.getContentViaHttp("http://m.openitvn.net/java.php?id=" + Main.SERVER_ID + "&passkey=" + Main.SERVER_PASSKEY + "&record=100");
            repaint();
        } catch (IOException ex) {
            err = true;
        } catch (Exception ex) {
            err = true;
        }
    }

    public void dispose() {
        loaded = false;
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        background = null;
        frontground = null;
        content = null;
        if (ads != null && !ads.isEmpty()) {
            ads.removeAllElements();
            ads = null;
        }
    }
}
