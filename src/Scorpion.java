/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Thinh
 */
public class Scorpion extends Enemy {

    public Scorpion(int initIndex, int initType, int[] initPosition, Game maze) {
        super(initIndex, initType, initPosition, maze);
    }

    protected void render(Graphics g) {
        if (state != Enemy.STATE_DIE) {
            int posX = x + parent.eLeft;
            int posY = y + parent.eTop;
            switch (state) {
                case Enemy.STATE_FIGHT:
                    parent.fightSprite.setPosition(posX, posY);
                    parent.fightSprite.setFrame(timeLine);
                    parent.fightSprite.paint(g);
                    break;

                case Enemy.STATE_CATCH:
                    //int curFrame = (timeLine < 32) ? timeLine : timeLine - 32 + 46;
                    int curFrame = (timeLine < 32) ? timeLine : timeLine + 14;
                    parent.fightSprite.setPosition(posX, posY);
                    parent.fightSprite.setFrame(curFrame);
                    parent.fightSprite.paint(g);
                    break;

                default:
                    parent.characterSprite.setPosition(posX, posY);
                    parent.characterSprite.setFrame(type * 20 + 60 + spriteRow * 5 + spriteCol);
                    parent.characterSprite.paint(g);
                    break;
            }
        }
    }

    public void checkCollision() {
        //kiem tra xem nha tham hiem co bi bo cap can khong
        if (position[0] == parent.explorer.position[0] && position[1] == parent.explorer.position[1]) {
            parent.explorer.state = Explorer.STATE_DIE;
            state = Enemy.STATE_CATCH;
        }
        //kiem tra xem co gap bo cap khac khong
        for (int i = index + 1; i < parent.scorpion.length; i++) {
            if (parent.scorpion[i].state == Enemy.STATE_STAY && parent.scorpion[i].position[0] == position[0] && parent.scorpion[i].position[1] == position[1]) {
                state = Enemy.STATE_FIGHT;
                parent.scorpion[i].state = Enemy.STATE_DIE;
                //_parent.scorpion[i].BeKilled(1, index);
                break;
            }
        }
        //kiem tra xem co bi bo cap khac giet khong
        int checker = index - 1;
        while (checker >= 0) {
            if (parent.scorpion[checker].state != Enemy.STATE_DIE && parent.scorpion[checker].position[0] == position[0] && parent.scorpion[checker].position[1] == position[1]) {
                parent.scorpion[checker].state = Enemy.STATE_FIGHT;
                state = Enemy.STATE_DIE;
                break;
            }
            checker--;
        }
        //kiem tra xem co bi xac uop giet khong
        for (int i = 0; i < parent.mummy.length; i++) {
            if (parent.mummy[i].state != Enemy.STATE_DIE && parent.mummy[i].position[0] == position[0] && parent.mummy[i].position[1] == position[1]) {
                parent.mummy[i].state = Enemy.STATE_FIGHT;
                state = Enemy.STATE_DIE;
                break;
            }
        }
    }
}
