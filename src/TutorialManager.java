/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;

/**
 *
 * @author Thinh
 */
public class TutorialManager extends LevelManager {

    public Vector desc;
    public Vector key;

    public TutorialManager() {
        super(0, 1);
        getData();
    }

    public boolean nextLevel() {
        boolean canUp = true;
        if (level < 5) {
            level++;
        } else {
            canUp = false;
        }
        if (canUp) {
            getData();
        }
        return canUp;
    }

    private void getData() {
        key = new Vector();
        desc = new Vector();
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, true}, {false, true}, {true, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{4, 3};
                mummyData = new int[][]{{2, 0, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                key.addElement("-7");
                desc.addElement("The goal of Mummy Maze is to get your Explorer to the exit of each maze without being caught by the Mummy.");
                key.addElement("1");
                desc.addElement("Move your explorer with the arrow keys. Move the explorer North now.");
                key.addElement("-7");
                desc.addElement("Notice that the Mummy moved after you! In the darkness of the pyramid, he can move twice as fast as you. Carefull!");
                key.addElement("1");
                desc.addElement("You have to use the maze walls to trap and confuse the Mummy if you want to escape. Move North again now.");
                key.addElement("-7");
                desc.addElement("Notice the Mummy couldn't move! It always tries to take a direct path to you. But the wall to your left blocked it.");
                key.addElement("1");
                desc.addElement("Now proceed all the way North then West to the exit of the maze. Watch the Mummy's movement as it tries to get to you.");
                key.addElement("1");
                desc.addElement("Now proceed all the way North then West to the exit of the maze. Watch the Mummy's movement as it tries to get to you.");
                key.addElement("2");
                desc.addElement("Now proceed all the way North then West to the exit of the maze. Watch the Mummy's movement as it tries to get to you.");
                key.addElement("2");
                desc.addElement("Now proceed all the way North then West to the exit of the maze. Watch the Mummy's movement as it tries to get to you.");
                key.addElement("2");
                desc.addElement("Luckily for you, the Mummy is still trapped by walls. Remember, it's not very smart, and always takes a straight line route to you.");
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{3, 3};
                mummyData = new int[][]{{1, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                key.addElement("-7");
                desc.addElement("Very good! You escaped the maze! Each pyramid has 15 chambers. The final one contains an ancient treasure!");
                key.addElement("-7");
                desc.addElement("If you solve the 15th maze, you'll grab the treasure and head to the next pyramid! Each pyramid is harder than the last.");
                key.addElement("-7");
                desc.addElement("Now let's try a slightly trickier maze. Here you'll learn that sometimes the best move is no move at all.");
                key.addElement("-7");
                desc.addElement("This maze doesn't offer very much cover. Any move you make will bring the Mummy straight to you with no escape.");
                key.addElement("-7");
                desc.addElement("The solution is not to move at all, but to pass your turn instead. The Mummy then moves as normal.");
                key.addElement("8");
                desc.addElement("You can wait by pressing the FIRE key. Go ahead and pass your turn now.");
                key.addElement("2");
                desc.addElement("The Mummy has trapped himself in the nook to your North. Now head West to the wall, then North to escape the maze.");
                key.addElement("2");
                desc.addElement("The Mummy has trapped himself in the nook to your North. Now head West to the wall, then North to escape the maze.");
                key.addElement("2");
                desc.addElement("The Mummy has trapped himself in the nook to your North. Now head West to the wall, then North to escape the maze.");
                key.addElement("1");
                desc.addElement("The Mummy has trapped himself in the nook to your North. Now head West to the wall, then North to escape the maze.");
                key.addElement("1");
                desc.addElement("The Mummy has trapped himself in the nook to your North. Now head West to the wall, then North to escape the maze.");
                key.addElement("1");
                desc.addElement("Yikes! This could be close!");
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{3, 4};
                mummyData = new int[][]{{1, 1, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                key.addElement("-7");
                desc.addElement("Whew! You made it! Remember as you paly that you can pass your turn and just let the Mummy move.");
                key.addElement("-7");
                desc.addElement("For the third and final part of the tutorial, we'll see how you can use the Mummy's bizarre brain to your advantage.");
                key.addElement("-7");
                desc.addElement("The Mummy will always try to move closer to you horizontally before he moves in the vertical direction.");
                key.addElement("-7");
                desc.addElement("Here, for instance, you can see that if the Mummy moved South two squares, you'd be trapped for sure.");
                key.addElement("2");
                desc.addElement("But he's not that bright. Move West now and see what the Mummy does.");
                key.addElement("8");
                desc.addElement("Now, be careful! If you move West again, the Mummy will get you for sure. But if you wait instead, he'll trap himself. Wait now...");
                key.addElement("2");
                desc.addElement("Good job! Now, as before, head West to the wall then dash North to the exit!");
                key.addElement("2");
                desc.addElement("Good job! Now, as before, head West to the wall then dash North to the exit!");
                key.addElement("2");
                desc.addElement("Good job! Now, as before, head West to the wall then dash North to the exit!");
                key.addElement("1");
                desc.addElement("Good job! Now, as before, head West to the wall then dash North to the exit!");
                key.addElement("1");
                desc.addElement("Good job! Now, as before, head West to the wall then dash North to the exit!");
                key.addElement("1");
                desc.addElement("Good job! Now, as before, head West to the wall then dash North to the exit!");
                key.addElement("-7");
                desc.addElement("Another close call! As you play, you'll get better judging the distance between and the Mummy.");
                key.addElement("-7");
                desc.addElement("A few final things to remember... You can use the Reset Maze and Undo Move button at any time.");
                key.addElement("-7");
                desc.addElement("Undo Move takes back your last action. Clicking it multiple times will step you back to the start of the level.");
                key.addElement("-7");
                desc.addElement("Reset Maze does just that, restarting the maze with you and the Mummy in your original position.");
                key.addElement("-7");
                desc.addElement("Your score in each maze is determined by the maze's defficult, and the amount of time you take to solve it.");
                key.addElement("-7");
                desc.addElement("Yes, this is all basic rules, now we'll learn more for know about some advanced features.");
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{3, 2};
                mummyData = new int[][]{{0, 3, 0}, {2, 3, 0}};
                scorpionData = new int[][]{{3, 5, 0}};
                trapData = null;
                gateData = new int[]{4, 3, 3, 5};
                key.addElement("-7");
                desc.addElement("Sometimes you'll encouter TWO mummies in the same maze!");
                key.addElement("-7");
                desc.addElement("Remember that the Undead don't play well with others... try to lure them into a collision, only one will emerge unscathed.");
                key.addElement("5");
                desc.addElement("Move right now to see what happens when mummies collide.");
                key.addElement("-7");
                desc.addElement("Sometimes a locked gate will bar your progress. When you see such a gate, look for a key nearby.");
                key.addElement("-7");
                desc.addElement("Stepping on it will open or close the gate. Remember that the gates can be trigged by either you or the mummy.");
                key.addElement("6");
                desc.addElement("Step onto the key now and release the scorpion!");
                key.addElement("-7");
                desc.addElement("The scorpions behave just like the mummies do, except that they only move one square per turn.");
                key.addElement("-7");
                desc.addElement("They're still deadly if they catch you, though!");
                key.addElement("2");
                desc.addElement("Now move all the way to the West wall then North to exit the chamber and proceed to the next part of the tutorial.");
                key.addElement("2");
                desc.addElement("Now move all the way to the West wall then North to exit the chamber and proceed to the next part of the tutorial.");
                key.addElement("2");
                desc.addElement("Now move all the way to the West wall then North to exit the chamber and proceed to the next part of the tutorial.");
                key.addElement("1");
                desc.addElement("Now move all the way to the West wall then North to exit the chamber and proceed to the next part of the tutorial.");
                key.addElement("1");
                desc.addElement("Now move all the way to the West wall then North to exit the chamber and proceed to the next part of the tutorial.");
                key.addElement("1");
                desc.addElement("Now move all the way to the West wall then North to exit the chamber and proceed to the next part of the tutorial.");
                key.addElement("1");
                desc.addElement("Now move all the way to the West wall then North to exit the chamber and proceed to the next part of the tutorial.");
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{2, 2};
                mummyData = new int[][]{{2, 4, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 4}, {0, 5}};
                gateData = null;
                key.addElement("-7");
                desc.addElement("Remember how white mummies always move horizontally first, then vertically?");
                key.addElement("6");
                desc.addElement("The red mummy does the opposite, moving vertically first, the horizontally. Move South now to lure him into the niche.");
                key.addElement("-7");
                desc.addElement("There are only a few things left to learn about the devious mummy tombs!");
                key.addElement("-7");
                desc.addElement("Those skull tiles in the Northeast corner are traps left by the pharaohs guard their pyramids.");
                key.addElement("-7");
                desc.addElement("Stepping on one of these skull tiles will spell instant doom for your explorer!");
                key.addElement("-7");
                desc.addElement("But remember, mummies and scorpions can cross over them without harm.");
                key.addElement("-7");
                desc.addElement("That's it! You've finished the tutorial! Let's PLAY IT NOW!");
                break;
        }
    }
}
