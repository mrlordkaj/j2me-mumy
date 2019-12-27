/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Thinh
 */
public class Explorer {
    
    public static final int STATE_STAY = 0;
    public static final int STATE_UP = 1;
    public static final int STATE_RIGHT = 2;
    public static final int STATE_DOWN = 3;
    public static final int STATE_LEFT = 4;
    public static final int STATE_WAIT = 5;
    public static final int STATE_DIE = 6;
    public static final int STATE_TRAPPED = 7;
    public static final int STATE_ESCAPED = 8;

    public int[] position;
    private Game parent;
    public int x, y, step, desX, desY;
    private int spriteCol = 0, spriteRow = 2;
    public int timeLine = 0;
    public int state = STATE_STAY;

    public Explorer(Game parent) {
        this.parent = parent;
        position = parent.lvlMan.explorerData;
        x = position[1] * parent.cellDimension;
        y = position[0] * parent.cellDimension;
        step = (int) (parent.cellDimension / 8);
    }

    public void update() {
        switch (state) {
            case Explorer.STATE_UP:
                spriteRow = 0;
                if (timeLine < 8) {
                    y -= step;
                    if (timeLine < 4) {
                        spriteCol++;
                    } else {
                        spriteCol--;
                    }
                    timeLine++;
                } else {
                    position[0]--;
                    timeLine = 0;
                    y = desY;
                    checkUseKey();
                    if (!checkTrapped() && !checkCollision()) {
                        parent.switchEnemyTurn();
                    }
                }
                break;

            case Explorer.STATE_RIGHT:
                spriteRow = 1;
                if (timeLine < 8) {
                    x += step;
                    if (timeLine < 4) {
                        spriteCol++;
                    } else {
                        spriteCol--;
                    }
                    timeLine++;
                } else {
                    position[1]++;
                    timeLine = 0;
                    x = desX;
                    checkUseKey();
                    if (!checkTrapped() && !checkCollision()) {
                        parent.switchEnemyTurn();
                    }
                }
                break;

            case Explorer.STATE_DOWN:
                spriteRow = 2;
                if (timeLine < 8) {
                    y += step;
                    if (timeLine < 4) {
                        spriteCol++;
                    } else {
                        spriteCol--;
                    }
                    timeLine++;
                } else {
                    position[0]++;
                    timeLine = 0;
                    y = desY;
                    checkUseKey();
                    if (!checkTrapped() && !checkCollision()) {
                        parent.switchEnemyTurn();
                    }
                }
                break;

            case Explorer.STATE_LEFT:
                spriteRow = 3;
                if (timeLine < 8) {
                    x -= step;
                    if (timeLine < 4) {
                        spriteCol++;
                    } else {
                        spriteCol--;
                    }
                    timeLine++;
                } else {
                    position[1]--;
                    timeLine = 0;
                    x = desX;
                    checkUseKey();
                    if (!checkTrapped() && !checkCollision()) {
                        parent.switchEnemyTurn();
                    }
                }
                break;

            case Explorer.STATE_ESCAPED:
                spriteRow = parent.escapeDirection;
                if (timeLine < 8) {
                    if (parent.escapeDirection == 0) {
                        y -= step;
                    } else if (parent.escapeDirection == 1) {
                        x += step;
                    } else if (parent.escapeDirection == 2) {
                        y += step;
                    } else if (parent.escapeDirection == 3) {
                        x -= step;
                    }
                    if (timeLine < 4) {
                        spriteCol++;
                    } else {
                        spriteCol--;
                    }
                    timeLine++;
                } else {
                    timeLine = 0;
                    parent.done();
                }
                break;

            case Explorer.STATE_TRAPPED:
                if (timeLine < 64) {
                    timeLine++;
                } else if (timeLine < 78) {
                    if (timeLine % 2 == 0) {
                        parent.eLeft = parent.eTop = 1;
                    } else {
                        parent.eLeft = parent.eTop = -1;
                    }
                    timeLine++;
                } else if (timeLine < 90) {
                    parent.eLeft = parent.eTop = 0;
                    timeLine++;
                } else {
                    parent.lose();
                }
                break;
        }
    }

    public void render(Graphics g) {
        if (state != Explorer.STATE_DIE && state != Explorer.STATE_TRAPPED) {
            parent.characterSprite.setPosition(x + parent.eLeft, y + parent.eTop);
            parent.characterSprite.setFrame(spriteRow * 5 + spriteCol);
            parent.characterSprite.paint(g);
        }

        if (state == Explorer.STATE_TRAPPED) {
            parent.fightSprite.setPosition(x + parent.eLeft, y + parent.eTop);
            int curFrame = (timeLine < 13) ? timeLine + 32 : 45;
            parent.fightSprite.setFrame(curFrame);
            parent.fightSprite.paint(g);
        }
    }

    public boolean checkEscape() {
        if (state != Explorer.STATE_DIE && position[0] == parent.escapeCell[0] && position[1] == parent.escapeCell[1]) {
            state = Explorer.STATE_ESCAPED;
            return true;
        }
        return false;
    }

    public boolean checkTrapped() {
        if(parent.lvlMan.trapData == null) {
            return false;
        }
        for (int i = 0; i < parent.lvlMan.trapData.length; i++) {
            if (position[0] == parent.lvlMan.trapData[i][0] && position[1] == parent.lvlMan.trapData[i][1]) {
                timeLine = 0;
                state = Explorer.STATE_TRAPPED;
                return true;
            }
        }
        return false;
    }

    public void stand() {
        parent.updateHistory();
        parent.switchEnemyTurn();
    }

    public void moveUp() {
        if (position[0] > 0) {
            int row = position[0] - 1;
            int col = position[1];
            if (parent.gate != null) {
                if (parent.lvlMan.gateData[2] == row && parent.lvlMan.gateData[3] == col && parent.gate[1] == 1) {
                    return;
                }
            }
            if (!parent.lvlMan.mazeData[row][col][1]) {
                parent.updateHistory();
                desY = (position[0] - 1) * parent.cellDimension;
                state = Explorer.STATE_UP;
            }
        }
    }

    public void moveRight() {
        if (position[1] < parent.lvlMan.mazeData.length - 1) {
            int row = position[0];
            int col = position[1];
            if (!parent.lvlMan.mazeData[row][col][0]) {
                parent.updateHistory();
                desX = (position[1] + 1) * parent.cellDimension;
                state = Explorer.STATE_RIGHT;
            }
        }
    }

    public void moveDown() {
        if (position[0] < parent.lvlMan.mazeData.length - 1) {
            int row = position[0];
            int col = position[1];
            if (parent.lvlMan.gateData != null) {
                if (parent.lvlMan.gateData[2] == row && parent.lvlMan.gateData[3] == col && parent.gate[1] == 1) {
                    return;
                }
            }
            if (!parent.lvlMan.mazeData[row][col][1]) {
                parent.updateHistory();
                desY = (position[0] + 1) * parent.cellDimension;
                state = Explorer.STATE_DOWN;
            }
        }
    }

    public void moveLeft() {
        if (position[1] > 0) {
            int row = position[0];
            int col = position[1] - 1;
            if (!parent.lvlMan.mazeData[row][col][0]) {
                parent.updateHistory();
                desX = (position[1] - 1) * parent.cellDimension;
                state = Explorer.STATE_LEFT;
            }
        }
    }

    private boolean checkCollision() {
        //kiem tra nha tham hiem co bi xac uop bat khong
        for (int i = 0; i < parent.mummy.length; i++) {
            if (parent.mummy[i].state != Enemy.STATE_DIE && parent.mummy[i].position[0] == position[0] && parent.mummy[i].position[1] == position[1]) {
                state = Explorer.STATE_DIE;
                parent.mummy[i].timeLine = 1;
                parent.mummy[i].state = Enemy.STATE_CATCH;
                return true;
            }
        }
        //kiem tra nha tham hiem co bi bo cap bat khong
        for (int i = 0; i < parent.scorpion.length; i++) {
            if (parent.scorpion[i].state != Enemy.STATE_DIE && parent.scorpion[i].position[0] == position[0] && parent.scorpion[i].position[1] == position[1]) {
                state = Explorer.STATE_DIE;
                parent.scorpion[i].timeLine = 1;
                parent.scorpion[i].state = Enemy.STATE_CATCH;
                return true;
            }
        }
        return false;
    }

    private void checkUseKey() {
        if (parent.lvlMan.gateData != null && parent.lvlMan.gateData[0] == position[0] && parent.lvlMan.gateData[1] == position[1]) {
            parent.gate[1] = 1 - parent.gate[1];
        }
    }
    
    public void dispose() {
        position = null;
    }
}
