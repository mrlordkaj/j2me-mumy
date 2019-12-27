/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.MathHelper;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 * @author Thinh
 */
public class Main extends MIDlet {

    public static final String RMS = "mummymaze";
    public static final int SERVER_ID = 2;
    public static final String SERVER_PASSKEY = "3646e0d17c026f9aa86b695eb4dcc5d2";
    public static final int DIMENSION_WIDTH = 240;
    public static final int DIMENSION_HEIGHT = 320;
    private Splash splash;
    private MainMenu mainMenu;
    private LeaderBoard leaderBoard;
    private Game game;
    private SubmitScore submitScore;
    private Timer timer;

    public void startApp() {
        try {
            RecordStore rs = RecordStore.openRecordStore(RMS, true);
            if (rs.getNumRecords() != 5) {
                rs.closeRecordStore();
                RecordStore.deleteRecordStore(RMS);

                rs = RecordStore.openRecordStore(RMS, true);
                byte[] writer = "1".getBytes();
                rs.addRecord(writer, 0, writer.length);
                rs.addRecord(writer, 0, writer.length);
                writer = "0".getBytes();
                rs.addRecord(writer, 0, writer.length);
                writer = "Player".getBytes();
                rs.addRecord(writer, 0, writer.length);
                writer = MathHelper.RandomDeviceId().getBytes();
                rs.addRecord(writer, 0, writer.length);
                rs.closeRecordStore();
            }
        } catch (RecordStoreException ex) {
        }
        
//        submitScore = new SubmitScore(this, 1200);
//        Display.getDisplay(this).setCurrent(submitScore);

        splash = new Splash(this);
        Display.getDisplay(this).setCurrent(splash);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                Runtime.getRuntime().gc();
            }
        }, 0, 500);
    }

    public void pauseApp() {
        System.out.println("pause");
    }

    public void destroyApp(boolean unconditional) {
    }

    public void gotoMainMenu() {
        if (splash != null) {
            splash.dispose();
            splash = null;
        }
        if (leaderBoard != null) {
            leaderBoard.dispose();
            leaderBoard = null;
        }
        if (game != null) {
            game.dispose();
            game = null;
        }

        mainMenu = new MainMenu(this);
        Display.getDisplay(this).setCurrent(mainMenu);
        mainMenu.createMainMenu();
    }

    public void gotoGuiderMenu() {
        if (game != null) {
            game.dispose();
            game = null;
        }
        
        mainMenu = new MainMenu(this);
        Display.getDisplay(this).setCurrent(mainMenu);
        mainMenu.createGuiderMenu();
    }

    public void gotoLeaderBoard() {
        if (mainMenu != null) {
            mainMenu.dispose();
            mainMenu = null;
        }
        if (submitScore != null) {
            submitScore.dispose();
            submitScore = null;
        }

        leaderBoard = new LeaderBoard(this);
        Display.getDisplay(this).setCurrent(leaderBoard);
    }

    public void gotoGame() {
        if (mainMenu != null) {
            mainMenu.dispose();
            mainMenu = null;
        }
        
        game = new Game(this);
        Display.getDisplay(this).setCurrent(game);
        game.start();
    }

    public void gotoTutorial(boolean returnMainMenu) {
        if (mainMenu != null) {
            mainMenu.dispose();
            mainMenu = null;
        }
        if (leaderBoard != null) {
            leaderBoard.dispose();
            leaderBoard = null;
        }

        game = new Game(this);
        Display.getDisplay(this).setCurrent(game);
        game.returnMainMenu = returnMainMenu;
        game.startTutorial();
    }

    public void submitScore(int score) {
        if (game != null) {
            game.dispose();
            game = null;
        }

        submitScore = new SubmitScore(this, score);
        Display.getDisplay(this).setCurrent(submitScore);
    }
}
