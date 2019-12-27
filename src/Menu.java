/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import helpers.ImageHelper;
import helpers.StringHelper;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 *
 * @author Thinh
 */
public class Menu {
    public static final int[][] MENUITEM_POSITION = new int[][] {
        {5, 230, 120, 30},
        {125, 230, 120, 30},
        {5, 270, 120, 30},
        {125, 270, 120, 30}
    };
    public static final int COMMAND_NONE = 0;
    public static final int COMMAND_START = 1;
    public static final int COMMAND_GUIDER = 2;
    public static final int COMMAND_LEADER = 3;
    public static final int COMMAND_QUIT = 4;
    public static final int COMMAND_INSTRUCTION = 5;
    public static final int COMMAND_TUTORIAL = 6;
    public static final int COMMAND_ABOUT = 7;
    public static final int COMMAND_MAINMENU = 8;
    public static final int COMMAND_RESTART = 9;
    public static final int COMMAND_UNDO = 10;
    public static final int COMMAND_RESUME = 11;
    public static final int COMMAND_ABANDON = 12;
    public static final int COMMAND_TUTORIALBEFOREPLAY = 13;
    private static final int STATE_OPENING = 0;
    private static final int STATE_OPENED = 1;
    private static final int STATE_CLOSING = 2;
    private static final int STATE_CLOSED = 3;
    
    private int state = STATE_OPENING;
    public int marginTop = Main.DIMENSION_HEIGHT;
    private Image menuFrontImage, menuBackImage, confirmDlgImage;
    public MenuItem[] menuItem;
    private int currentCommand = COMMAND_NONE, currentMenuId = 0;
    private MenuAction parent;

    public Menu(MenuItem[] _menuItem, Image _menuBackImage, MenuAction _parent) {
        parent = _parent;
        menuItem = _menuItem;
        menuBackImage = _menuBackImage;
        prepareResource();
        parent.startMenuTimer();
    }

    private void prepareResource() {
        menuFrontImage = ImageHelper.loadImage("/images/menufront.png");
    }

    public void update() {
        if (state == STATE_OPENING) {
            if (marginTop > 60) {
                marginTop -= 13;
            } else {
                state = STATE_OPENED;
                selectMenuItem(0);
                parent.stopMenuTimer();
            }
        } else if (state == STATE_CLOSING) {
            if (marginTop < Main.DIMENSION_HEIGHT) {
                marginTop += 13;
            } else {
                state = STATE_CLOSED;
                parent.stopMenuTimer();
                execCommand();
            }
        }
    }

    public void render(Graphics g) {
        g.fillRect(0, 0, Main.DIMENSION_WIDTH, Main.DIMENSION_HEIGHT);
        g.drawImage(menuBackImage, 0, 0, Graphics.TOP | Graphics.LEFT);
        g.drawImage(menuFrontImage, 0, marginTop, Graphics.TOP | Graphics.LEFT);
        g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_SMALL));
        if (state == STATE_OPENED) {
            for(int i = 0; i < 4; i++) {
                int cx = MENUITEM_POSITION[i][0] + (MENUITEM_POSITION[i][2] / 2);
                int cy = MENUITEM_POSITION[i][1] + (MENUITEM_POSITION[i][3] / 2);
                if(menuItem[i].selected) {
                    g.setColor(255, 0, 0);
                }
                else {
                    g.setColor(0, 0, 0);
                }
                g.drawString(menuItem[i].title.toString(), cx, cy, Graphics.HCENTER | Graphics.BASELINE);
            }
            if(confirmDlgImage != null) {
                g.drawImage(confirmDlgImage, Main.DIMENSION_WIDTH / 2, Main.DIMENSION_HEIGHT / 2 + 10, Graphics.HCENTER | Graphics.VCENTER);
            }
        }
    }
    
    public void pointerPressed(int x, int y) {
        if (state != STATE_OPENED) {
            return;
        }
        if (confirmDlgImage == null) {
            for (int i = 0; i < 4; i++) {
                if (x >= MENUITEM_POSITION[i][0] && x <= MENUITEM_POSITION[i][0] + MENUITEM_POSITION[i][2]) {
                    if (y >= MENUITEM_POSITION[i][1] && y <= MENUITEM_POSITION[i][1] + MENUITEM_POSITION[i][3]) {
                        currentCommand = menuItem[i].command;
                        requestCommand();
                        return;
                    }
                }
            }
        } else {
            //yes
            if (x >= 34 && x <= 64) {
                if (y >= 180 && y <= 210) {
                    confirmDlgImage = null;
                    state = STATE_CLOSING;
                    parent.startMenuTimer();
                }
            }
            //no
            else if (x >= 176 && x <= 206) {
                if (y >= 180 && y <= 210) {
                    cancelCommand();
                }
            }
        }
    }
    
    public void keyPressed(int keyCode, int actionCode) {
        if (state != STATE_OPENED) {
            return;
        }
        if (confirmDlgImage == null) {
            switch (actionCode) {
                case 1: //UP
                    if (currentMenuId == 2) {
                        selectMenuItem(0);
                    } else if (currentMenuId == 3) {
                        selectMenuItem(1);
                    }
                    break;

                case 2: //LEFT
                    if (currentMenuId == 1) {
                        selectMenuItem(0);
                    } else if (currentMenuId == 3) {
                        selectMenuItem(2);
                    }
                    break;

                case 5: //RIGHT
                    if (currentMenuId == 0) {
                        selectMenuItem(1);
                    } else if (currentMenuId == 2) {
                        selectMenuItem(3);
                    }
                    break;

                case 6: //DOWN
                    if (currentMenuId == 0) {
                        selectMenuItem(2);
                    } else if (currentMenuId == 1) {
                        selectMenuItem(3);
                    }
                    break;

                case 8: //FIRE
                    requestCommand();
                    break;
            }
        } else {
            switch (keyCode) {
                case -5: //yes
                case -6:
                    confirmDlgImage = null;
                    state = STATE_CLOSING;
                    parent.startMenuTimer();
                    break;

                case -7: //no
                    cancelCommand();
                    break;
            }
        }
    }

    private void requestCommand() {
        switch (currentCommand) {
            case COMMAND_START:
                int initTomb, initLevel;
                try {
                    RecordStore rs = RecordStore.openRecordStore(Main.RMS, false);
                    initTomb = Integer.parseInt(new String(rs.getRecord(1)));
                    initLevel = Integer.parseInt(new String(rs.getRecord(2)));
                    rs.closeRecordStore();
                } catch (RecordStoreException ex) {
                    initTomb = 1;
                    initLevel = 1;
                }
                if(initTomb == 1 && initLevel == 1) {
                    openConfirmDlg("Do you want to play the Tutorial first?");
                    currentCommand = COMMAND_TUTORIALBEFOREPLAY;
                } else {
                    state = STATE_CLOSING;
                    parent.startMenuTimer();
                }
                break;
                
            case COMMAND_ABANDON:
                openConfirmDlg("Abandon and submits your scores to the Leaderboard?");
                break;

            case COMMAND_QUIT:
                openConfirmDlg("Are you sure you want to exit the Mummy Maze?");
                break;
                
            default:
                state = STATE_CLOSING;
                parent.startMenuTimer();
                break;
        }
    }
    
    private void openConfirmDlg(String content) {
        confirmDlgImage = Image.createImage(174, 87);
        Graphics g = confirmDlgImage.getGraphics();
        g.drawImage(ImageHelper.loadImage("/images/confirmdialog.png"),
                0, 0, Graphics.TOP | Graphics.LEFT);
        g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL));
        StringHelper.drawWrapString(g, content, 17, 14, 140, Graphics.TOP | Graphics.LEFT);
    }

    private void execCommand() {
        switch (currentCommand) {
            case COMMAND_START:
                ((MainMenu) parent).gotoGame();
                break;

            case COMMAND_GUIDER:
                ((MainMenu) parent).createGuiderMenu();
                break;

            case COMMAND_LEADER:
                ((MainMenu) parent).gotoLeaderBoard();
                break;

            case COMMAND_QUIT:
                ((MainMenu) parent).quitGame();
                break;

            case COMMAND_MAINMENU:
//                if(parent.getClass().getName().equals("MainMenu")) {
//                    ((MainMenu) parent).createMainMenu();
//                } else {
//                    ((Game) parent).mainMenu();
//                }
                try {
                    ((MainMenu) parent).createMainMenu();
                } catch (Exception ex) {
                    ((Game) parent).mainMenu();
                }
                break;
                
            case COMMAND_RESUME:
                ((Game) parent).resume();
                break;
                
            case COMMAND_RESTART:
                ((Game) parent).restart();
                break;
                
            case COMMAND_UNDO:
                ((Game) parent).undo();
                break;
                
            case COMMAND_INSTRUCTION:
                ((MainMenu) parent).gotoInstruction();
                break;
                
            case COMMAND_ABOUT:
                ((MainMenu) parent).gotoAbout();
                break;
                
            case COMMAND_TUTORIAL:
                ((MainMenu) parent).gotoTutorial();
                break;
                
            case COMMAND_TUTORIALBEFOREPLAY:
                ((MainMenu) parent).gotoTutorialThenPlay();
                break;
                
            case COMMAND_ABANDON:
                ((Game) parent).abandon();
                break;
        }
    }
    
    private void cancelCommand() {
        confirmDlgImage = null;
        if(currentCommand == COMMAND_TUTORIALBEFOREPLAY) {
            currentCommand = COMMAND_START;
            state = STATE_CLOSING;
            parent.startMenuTimer();
        }
    }
    
    private void selectMenuItem(int menuId) {
        for (int i = 0; i < 4; i++) {
            if (i == menuId) {
                currentCommand = menuItem[i].command;
                currentMenuId = i;
                menuItem[i].selected = true;
            } else {
                menuItem[i].selected = false;
            }
        }
    }
}
