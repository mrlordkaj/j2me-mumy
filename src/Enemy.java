/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Thinh
 */
public abstract class Enemy {
    
    public static final int STATE_STAY = 0;
    public static final int STATE_UP = 1;
    public static final int STATE_RIGHT = 2;
    public static final int STATE_DOWN = 3;
    public static final int STATE_LEFT = 4;
    public static final int STATE_DIE = 5;
    public static final int STATE_FIGHT = 6;
    public static final int STATE_CATCH = 7;

    public int index;
    public int[] position;
    public Game parent;
    public int type;
    public int numMove = 0;
    public int x, y, step, desX, desY;
    public int spriteCol = 0, spriteRow = 2;
    public int timeLine = 0;
    public int state = Enemy.STATE_STAY;

    public Enemy(int initIndex, int initType, int[] initPosition, Game maze) {
        parent = maze;
        index = initIndex;
        type = initType;
        position = initPosition;
        x = position[1] * parent.cellDimension;
        y = position[0] * parent.cellDimension;
        step = (int) (parent.cellDimension / 8);
    }

    public void update() {
        switch (state) {
            case Enemy.STATE_UP:
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
                    state = Enemy.STATE_STAY;
                    checkCollision();
                    numMove--;
                }
                break;

            case Enemy.STATE_RIGHT:
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
                    state = Enemy.STATE_STAY;
                    checkCollision();
                    numMove--;
                }
                break;

            case Enemy.STATE_DOWN:
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
                    state = Enemy.STATE_STAY;
                    checkCollision();
                    numMove--;
                }
                break;

            case Enemy.STATE_LEFT:
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
                    state = Enemy.STATE_STAY;
                    checkCollision();
                    numMove--;
                }
                break;

            case Enemy.STATE_FIGHT:
                if (timeLine < 31) {
                    timeLine++;
                } else {
                    state = Enemy.STATE_STAY;
                    timeLine = 0;
                }
                break;

            case Enemy.STATE_CATCH:
                if (timeLine < 51) {
                    timeLine++;
                } else {
                    parent.lose();
                }
                break;
        }

        //kiem tra xem con di chuyen duoc khong
        if (state == Enemy.STATE_STAY && numMove > 0) {
            takeMove();
        }
    }

    protected abstract void render(Graphics g);

    protected void takeMove() {
        int[] explorerPosition = parent.explorer.position;
        if (type == 0) {	//neu la xac uop trang
            //thu di chuyen ngang truoc
            if (explorerPosition[1] < position[1]) {
                if (testMoveLeft()) {
                    return;
                }
            } else if (explorerPosition[1] > position[1]) {
                if (testMoveRight()) {
                    return;
                }
            }
            //neu khong di chuyen ngang duoc thi thu chuyen sang doc
            if (explorerPosition[0] < position[0]) {
                if (testMoveUp()) {
                    return;
                }
            } else if (explorerPosition[0] > position[0]) {
                if (testMoveDown()) {
                    return;
                }
            }
            //neu khong di chuyen duoc them thi bo han
            numMove = 0;
        } else { //neu la xac uop do
            //thu di chuyen doc truoc
            if (explorerPosition[0] < position[0]) {
                if (testMoveUp()) {
                    return;
                }
            } else if (explorerPosition[0] > position[0]) {
                if (testMoveDown()) {
                    return;
                }
            }
            //neu khong di chuyen doc duoc thi thu chuyen sang ngang
            if (explorerPosition[1] < position[1]) {
                if (testMoveLeft()) {
                    return;
                }
            } else if (explorerPosition[1] > position[1]) {
                if (testMoveRight()) {
                    return;
                }
            }
            //neu khong di chuyen duoc them thi bo han
            numMove = 0;
        }
    }

    protected boolean testMoveUp() {
        int row = position[0] - 1;
        int col = position[1];
        if (parent.lvlMan.gateData != null) {
            if (parent.lvlMan.gateData[2] == row && parent.lvlMan.gateData[3] == col && parent.gate[1] == 1) {
                return false;
            }
        }
        if (!parent.lvlMan.mazeData[row][col][1]) {
            desY = (position[0] - 1) * parent.cellDimension;
            state = Enemy.STATE_UP;
            return true;
        }
        return false;
    }

    protected boolean testMoveRight() {
        int row = position[0];
        int col = position[1];
        if (!parent.lvlMan.mazeData[row][col][0]) {
            desX = (position[1] + 1) * parent.cellDimension;
            state = Enemy.STATE_RIGHT;
            return true;
        }
        return false;
    }

    protected boolean testMoveDown() {
        int row = position[0];
        int col = position[1];
        if (parent.lvlMan.gateData != null) {
            if (parent.lvlMan.gateData[2] == row && parent.lvlMan.gateData[3] == col && parent.gate[1] == 1) {
                return false;
            }
        }
        if (!parent.lvlMan.mazeData[row][col][1]) {
            desY = (position[0] + 1) * parent.cellDimension;
            state = Enemy.STATE_DOWN;
            return true;
        }
        return false;
    }

    protected boolean testMoveLeft() {
        int row = position[0];
        int col = position[1] - 1;
        if (!parent.lvlMan.mazeData[row][col][0]) {
            desX = (position[1] - 1) * parent.cellDimension;
            state = Enemy.STATE_LEFT;
            return true;
        }
        return false;
    }

    protected void checkUseKey() {
        if (parent.lvlMan.gateData != null && parent.lvlMan.gateData[0] == position[0] && parent.lvlMan.gateData[1] == position[1]) {
            parent.gate[1] = 1 - parent.gate[1];
        }
    }

    protected abstract void checkCollision();
}
