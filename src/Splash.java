/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//import InneractiveSDK.IADView;
import helpers.ImageHelper;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

/**
 *
 * @author Thinh
 */
public class Splash extends GameCanvas {

    private static final int SCREEN_NONE = 0;
    private static final int SCREEN_POPCAP = 1;
    private static final int SCREEN_OPENITVN = 2;
//    private static final int SCREEN_ADS = 3;
    private static final int SCREEN_SPLASH = 3;
    private boolean showSplashText = false;
    private Image background;
    private int screenId = SCREEN_NONE;
    private Main parent;
    private Timer timer;
    private boolean loaded = false;

    public Splash(Main mainMidlet) {
        super(false);
        parent = mainMidlet;
        setFullScreenMode(true);
        startIntroTimer();
    }
    
    public void paint(Graphics g) {
        if (/*screenId != SCREEN_ADS && */loaded) {
            g.drawImage(background, 0, 0, Graphics.TOP | Graphics.LEFT);
            if (showSplashText) {
                g.setColor(255, 255, 255);
                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_SMALL));
                g.drawString("Press any key", Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT - 42, Graphics.HCENTER | Graphics.BASELINE);
            }
        }
    }

    protected void showNotify() {
        repaint();
    }
    
    protected void pointerPressed(int x, int y) {
        if (screenId == SCREEN_SPLASH) {
            timer.cancel();
            parent.gotoMainMenu();
        }
    }
    
    protected void keyPressed(int keyCode) {
        if (screenId == SCREEN_SPLASH) {
            timer.cancel();
            parent.gotoMainMenu();
        }
    }

    private void startIntroTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                nextFrame();
                repaint();
            }
        }, 0, 2000);
    }

    private void startWaitTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                showSplashText = !showSplashText;
                repaint();
            }
        }, 0, 500);
    }

    private void nextFrame() {
        loaded = false;
        screenId++;
        background = null;
        switch (screenId) {
            case SCREEN_POPCAP:
                background = ImageHelper.loadImage("/images/popcaplogo.png");
                break;

            case SCREEN_OPENITVN:
                background = ImageHelper.loadImage("/images/openitvnlogo.png");
                break;
                
//            case SCREEN_ADS:
//                IADView.displayInterstitialAd(parent, "Openitvn_MummyMazeDeluxe_Nokia");
//                break;

            case SCREEN_SPLASH:
                background = ImageHelper.loadImage("/images/splash.png");
                timer.cancel();
                startWaitTimer();
                break;
        }
        loaded = true;
    }
    
    public void dispose() {
        if(timer != null) {
            timer.cancel();
            timer = null;
        }
        background = null;
    }
}
