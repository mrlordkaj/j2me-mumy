/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Thinh
 */
public class Mummy extends Enemy {

    public Mummy(int initIndex, int initType, int[] initPosition, Game maze) {
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
                    int curFrame = (timeLine < 32) ? timeLine : type + 66;
                    parent.fightSprite.setPosition(posX, posY);
                    parent.fightSprite.setFrame(curFrame);
                    parent.fightSprite.paint(g);
                    break;

                default:
                    parent.characterSprite.setPosition(posX, posY);
                    parent.characterSprite.setFrame(type * 20 + 20 + spriteRow * 5 + spriteCol);
                    parent.characterSprite.paint(g);
                    break;
            }
        }
    }

    protected void checkCollision() {
        //kiem tra xem co bat duoc nha tham hiem khong
        if (position[0] == parent.explorer.position[0] && position[1] == parent.explorer.position[1]) {
            parent.explorer.state = Explorer.STATE_DIE;
            state = Enemy.STATE_CATCH;
        }
        //kiem tra xem co gap xac uop khac khong
        for (int i = index + 1; i < parent.mummy.length; i++) {
            if (parent.mummy[i].state == Enemy.STATE_STAY && parent.mummy[i].position[0] == position[0] && parent.mummy[i].position[1] == position[1]) {
                state = Enemy.STATE_FIGHT;
                parent.mummy[i].numMove = 0;
                parent.mummy[i].state = Enemy.STATE_DIE;
                break;
            }
        }
        //kiem tra xem co gap bo cap khong
        for (int i = 0; i < parent.scorpion.length; i++) {
            if (parent.scorpion[i].state == Enemy.STATE_STAY && parent.scorpion[i].position[0] == position[0] && parent.scorpion[i].position[1] == position[1]) {
                state = Enemy.STATE_FIGHT;
                parent.scorpion[i].state = Enemy.STATE_DIE;
                break;
            }
        }
        //kiem tra xem co bi xac uop khac giet khong
        int checker = index - 1;
        while (checker >= 0) {
            if (parent.mummy[checker].state != Enemy.STATE_DIE && parent.mummy[checker].position[0] == position[0] && parent.mummy[checker].position[1] == position[1]) {
                parent.mummy[checker].state = Enemy.STATE_FIGHT;
                numMove = 0;
                state = Enemy.STATE_DIE;
                break;
            }
            checker--;
        }
    }
}
