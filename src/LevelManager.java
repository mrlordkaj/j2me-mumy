/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Thinh
 */
public class LevelManager {
    public boolean[][][] mazeData;
    public int[] doorData, explorerData, gateData;
    public int[][] mummyData, scorpionData, trapData;
    public int tomb, level;
    public int basicScore;

    public LevelManager(int initTomb, int initLevel) {
        tomb = initTomb;
        level = initLevel;
        basicScore = 5 * initTomb * initLevel + 95;
        getData();
    }

    public boolean nextLevel() {
        boolean canUp = true;
        if (level < 15) {
            level++;
        } else if (tomb < 15) {
            level = 1;
            tomb++;
        } else {
            canUp = false;
        }
        if (canUp) {
            basicScore += 5;
            getData();
        }
        return canUp;
    }

    private void getData() {
        switch (tomb) {
            case 1:
                getTomb1Data();
                break;

            case 2:
                getTomb2Data();
                break;

            case 3:
                getTomb3Data();
                break;

            case 4:
                getTomb4Data();
                break;

            case 5:
                getTomb5Data();
                break;

            case 6:
                getTomb6Data();
                break;

            case 7:
                getTomb7Data();
                break;

            case 8:
                getTomb8Data();
                break;

            case 9:
                getTomb9Data();
                break;

            case 10:
                getTomb10Data();
                break;

            case 11:
                getTomb11Data();
                break;

            case 12:
                getTomb12Data();
                break;

            case 13:
                getTomb13Data();
                break;

            case 14:
                getTomb14Data();
                break;

            case 15:
                getTomb15Data();
                break;
        }
    }

    private void getTomb1Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                explorerData = new int[]{1, 0};
                doorData = new int[]{1, 2};
                mummyData = new int[][]{{5, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 3}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 5};
                explorerData = new int[]{4, 2};
                mummyData = new int[][]{{1, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, true}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{4, 1};
                mummyData = new int[][]{{1, 1, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 5};
                explorerData = new int[]{3, 1};
                mummyData = new int[][]{{2, 5, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 4};
                explorerData = new int[]{2, 2};
                mummyData = new int[][]{{0, 0, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{1, 5};
                mummyData = new int[][]{{5, 1, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{4, 0};
                mummyData = new int[][]{{2, 5, 0}};
                scorpionData = new int[][]{{1, 0, 0}};
                trapData = new int[][]{{5, 2}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}};
                doorData = new int[]{0, 4};
                explorerData = new int[]{3, 5};
                mummyData = new int[][]{{4, 2, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 3}};
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{2, 2};
                mummyData = new int[][]{{3, 5, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 3};
                explorerData = new int[]{4, 3};
                mummyData = new int[][]{{1, 3, 0}, {1, 4, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{{5, 4, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {true, true}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{{0, 5, 0}};
                scorpionData = new int[][]{{5, 4, 0}};
                trapData = new int[][]{{3, 0}};
                gateData = new int[]{1, 2, 2, 4};
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 2};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{3, 1, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}}, {{false, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{0, 1};
                mummyData = new int[][]{{5, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 4}};
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {true, true}, {false, false}, {true, true}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {true, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 4};
                explorerData = new int[]{2, 2};
                mummyData = new int[][]{{3, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}};
                gateData = null;
                break;
        }
    }

    private void getTomb2Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 4};
                explorerData = new int[]{0, 5};
                mummyData = new int[][]{{1, 0, 0}};
                scorpionData = new int[][]{{1, 2, 0}};
                trapData = new int[][]{{3, 3}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{1, 2};
                mummyData = new int[][]{{1, 5, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {false, true}, {false, true}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 5};
                explorerData = new int[]{1, 2};
                mummyData = new int[][]{{3, 2, 0}, {4, 0, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 0}};
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, true}, {false, false}, {true, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{3, 0};
                mummyData = new int[][]{{1, 0, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 2}, {0, 5}};
                gateData = null;
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, true}, {false, true}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{0, 5};
                mummyData = new int[][]{{0, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {1, 2}};
                gateData = new int[]{4, 0, 1, 1};
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 1};
                explorerData = new int[]{3, 5};
                mummyData = new int[][]{{0, 1, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, true}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{4, 5};
                mummyData = new int[][]{{5, 0, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {5, 4}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 1};
                explorerData = new int[]{3, 2};
                mummyData = new int[][]{{0, 3, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {2, 1}};
                gateData = new int[]{1, 2, 3, 1};
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{0, 3};
                mummyData = new int[][]{{2, 1, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 1}};
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{true, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 3};
                explorerData = new int[]{3, 4};
                mummyData = new int[][]{{0, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 2}};
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, true}, {true, false}, {false, true}, {false, false}}, {{false, true}, {false, true}, {false, true}, {true, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{1, 0};
                mummyData = new int[][]{{0, 1, 0}, {4, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{3, 3, 1, 3};
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {true, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 3};
                explorerData = new int[]{2, 4};
                mummyData = new int[][]{{0, 1, 1}};
                scorpionData = new int[][]{{0, 2, 1}};
                trapData = new int[][]{{4, 1}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, true}, {true, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{2, 3};
                mummyData = new int[][]{{5, 1, 0}, {4, 5, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{5, 3, 3, 3};
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 5};
                explorerData = new int[]{0, 4};
                mummyData = new int[][]{{5, 2, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 5};
                explorerData = new int[]{5, 5};
                mummyData = new int[][]{{0, 2, 0}};
                scorpionData = new int[][]{{1, 3, 0}};
                trapData = null;
                gateData = new int[]{1, 0, 4, 4};
                break;
        }
    }

    private void getTomb3Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{1, 5};
                mummyData = new int[][]{{4, 2, 1}, {3, 3, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 3}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 4};
                explorerData = new int[]{2, 4};
                mummyData = new int[][]{{5, 2, 0}, {4, 4, 0}};
                scorpionData = new int[][]{{5, 0, 0}};
                trapData = new int[][]{{5, 0}};
                gateData = new int[]{1, 0, 4, 4};
                break;

            case 3:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 4};
                explorerData = new int[]{2, 1};
                mummyData = new int[][]{{0, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 0}};
                gateData = new int[]{4, 1, 3, 5};
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}}, {{false, true}, {true, true}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{3, 3};
                mummyData = new int[][]{{1, 3, 0}, {1, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 3}};
                gateData = null;
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, true}, {true, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{3, 1};
                mummyData = new int[][]{{5, 1, 0}, {3, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 0}};
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}}, {{true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 5};
                explorerData = new int[]{0, 3};
                mummyData = new int[][]{{1, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {3, 4}};
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, true}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 1};
                explorerData = new int[]{4, 1};
                mummyData = new int[][]{{0, 1, 0}, {0, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{2, 1, 2, 2};
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{5, 1};
                mummyData = new int[][]{{3, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{3, 4, 4, 4};
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{{4, 1, 1}, {5, 0, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 0}};
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, true}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {false, true}, {true, false}, {false, true}, {false, false}, {false, true}}, {{true, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{{2, 0, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 0}};
                gateData = new int[]{4, 1, 2, 3};
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {true, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{4, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 1}};
                gateData = new int[]{0, 0, 2, 4};
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{3, 5};
                mummyData = new int[][]{{4, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {1, 2}};
                gateData = new int[]{5, 3, 1, 3};
                break;

            case 13:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{3, 3};
                mummyData = new int[][]{{4, 3, 1}, {4, 5, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 0}};
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 1};
                explorerData = new int[]{5, 5};
                mummyData = new int[][]{{0, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 3}};
                gateData = new int[]{3, 0, 2, 3};
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{true, true}, {true, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, true}}, {{true, false}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 4};
                explorerData = new int[]{0, 4};
                mummyData = new int[][]{{5, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 4}};
                gateData = new int[]{0, 2, 4, 2};
                break;
        }
    }

    private void getTomb4Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, true}, {true, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{3, 4};
                explorerData = new int[]{5, 4};
                mummyData = new int[][]{{2, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 2}};
                gateData = new int[]{3, 2, 0, 3};
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {true, true}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{2, 5};
                mummyData = new int[][]{{0, 0, 0}};
                scorpionData = new int[][]{{0, 4, 0}};
                trapData = new int[][]{{3, 1}};
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, true}, {true, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 2};
                explorerData = new int[]{4, 0};
                mummyData = new int[][]{{2, 4, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 4}};
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{4, 2};
                mummyData = new int[][]{{2, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 2}};
                gateData = null;
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 5};
                explorerData = new int[]{1, 5};
                mummyData = new int[][]{{4, 2, 1}, {3, 3, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 3}};
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 3};
                explorerData = new int[]{4, 5};
                mummyData = new int[][]{{5, 4, 0}};
                scorpionData = new int[][]{{5, 1, 0}};
                trapData = new int[][]{{4, 0}};
                gateData = new int[]{2, 0, 3, 4};
                break;

            case 7:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{true, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{0, 1};
                mummyData = new int[][]{{4, 5, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 1}, {0, 5}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 2};
                explorerData = new int[]{1, 4};
                mummyData = new int[][]{{5, 1, 0}, {4, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 3}};
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 4};
                explorerData = new int[]{2, 5};
                mummyData = new int[][]{{5, 1, 1}};
                scorpionData = new int[][]{{5, 2, 1}};
                trapData = new int[][]{{1, 2}};
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {true, true}, {false, true}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{1, 2};
                mummyData = new int[][]{{3, 0, 1}};
                scorpionData = new int[][]{{4, 2, 1}};
                trapData = new int[][]{{1, 1}};
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, true}, {true, true}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 2};
                explorerData = new int[]{5, 3};
                mummyData = new int[][]{{4, 0, 1}, {4, 1, 1}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{{5, 0, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 1}, {0, 5}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{5, 5};
                mummyData = new int[][]{{0, 2, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 5}};
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 4};
                explorerData = new int[]{4, 5};
                mummyData = new int[][]{{2, 1, 0}, {3, 1, 0}};
                scorpionData = new int[][]{{0, 1, 0}};
                trapData = new int[][]{{0, 0}};
                gateData = new int[]{2, 5, 4, 4};
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, true}, {true, false}, {false, true}, {false, true}, {true, true}, {false, false}, {true, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {true, true}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, true}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 6};
                explorerData = new int[]{0, 5};
                mummyData = new int[][]{{7, 4, 0}, {2, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 4}};
                gateData = null;
                break;
        }
    }

    private void getTomb5Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {true, false}, {false, true}, {true, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{4, 4};
                mummyData = new int[][]{{0, 6, 0}, {2, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 5}};
                gateData = new int[]{5, 7, 0, 2};
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{1, 5};
                mummyData = new int[][]{{4, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 1}};
                gateData = new int[]{5, 5, 3, 6};
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 5};
                explorerData = new int[]{0, 4};
                mummyData = new int[][]{{0, 6, 0}};
                scorpionData = new int[][]{{6, 7, 0}};
                trapData = new int[][]{{4, 7}};
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {true, true}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{4, 6};
                mummyData = new int[][]{{7, 7, 0}, {7, 2, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{6, 0, 5, 5};
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {true, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 5};
                explorerData = new int[]{5, 1};
                mummyData = new int[][]{{0, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{1, 3, 5, 4};
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, true}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, true}, {true, false}, {true, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 5};
                explorerData = new int[]{1, 3};
                mummyData = new int[][]{{5, 2, 0}, {6, 0, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{6, 7, 6, 2};
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, true}, {true, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {true, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {true, true}, {false, true}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 0};
                explorerData = new int[]{6, 4};
                mummyData = new int[][]{{3, 2, 0}};
                scorpionData = new int[][]{{2, 7, 0}};
                trapData = new int[][]{{0, 1}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {true, true}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, true}, {true, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 5};
                explorerData = new int[]{0, 1};
                mummyData = new int[][]{{1, 2, 0}, {6, 6, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 0}};
                gateData = new int[]{7, 4, 4, 0};
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {true, true}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, true}, {true, true}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 1};
                explorerData = new int[]{6, 5};
                mummyData = new int[][]{{1, 6, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {true, true}, {true, false}, {false, true}}, {{true, false}, {true, false}, {false, false}, {true, true}, {false, true}, {true, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 2};
                explorerData = new int[]{0, 6};
                mummyData = new int[][]{{4, 6, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 7}};
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{3, 4};
                mummyData = new int[][]{{3, 7, 0}, {5, 2, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, true}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 2};
                explorerData = new int[]{1, 4};
                mummyData = new int[][]{{2, 6, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 7}, {4, 7}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {true, true}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 4};
                explorerData = new int[]{7, 1};
                mummyData = new int[][]{{4, 6, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{3, 5, 3, 3};
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{true, false}, {true, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, true}, {false, true}, {true, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {true, true}, {false, true}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{6, 6};
                mummyData = new int[][]{{3, 0, 0}, {5, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 5}};
                gateData = new int[]{5, 3, 4, 2};
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{2, 5};
                mummyData = new int[][]{{4, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {7, 1}};
                gateData = null;
                break;
        }
    }

    private void getTomb6Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, true}, {true, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {true, false}, {true, true}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, true}, {true, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 1};
                explorerData = new int[]{4, 6};
                mummyData = new int[][]{{3, 7, 0}, {0, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 5}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 6};
                explorerData = new int[]{2, 7};
                mummyData = new int[][]{{7, 6, 0}};
                scorpionData = new int[][]{{6, 2, 0}};
                trapData = new int[][]{{0, 7}};
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 2};
                explorerData = new int[]{2, 6};
                mummyData = new int[][]{{1, 3, 1}, {2, 1, 1}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, true}, {true, false}, {true, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {true, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{2, 7};
                mummyData = new int[][]{{3, 3, 0}};
                scorpionData = new int[][]{{7, 6, 0}};
                trapData = new int[][]{{6, 3}};
                gateData = null;
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{1, 2};
                mummyData = new int[][]{{0, 6, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 3}};
                gateData = new int[]{2, 6, 2, 6};
                break;

            case 6:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, true}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 7};
                explorerData = new int[]{4, 2};
                mummyData = new int[][]{{3, 1, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{0, 2};
                mummyData = new int[][]{{7, 0, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, true}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{2, 5};
                mummyData = new int[][]{{5, 5, 0}, {3, 5, 0}};
                scorpionData = new int[][]{{4, 4, 0}};
                trapData = new int[][]{{4, 0}};
                gateData = new int[]{6, 2, 2, 3};
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{5, 3};
                mummyData = new int[][]{{3, 7, 0}, {5, 7, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{2, 6, 4, 5};
                break;

            case 10:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, true}, {false, true}, {true, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{0, 7};
                explorerData = new int[]{6, 6};
                mummyData = new int[][]{{4, 5, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 7};
                explorerData = new int[]{5, 2};
                mummyData = new int[][]{{6, 7, 0}};
                scorpionData = new int[][]{{4, 6, 0}};
                trapData = null;
                gateData = new int[]{0, 0, 2, 5};
                break;

            case 12:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, true}, {true, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, true}, {false, true}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{7, 0};
                mummyData = new int[][]{{0, 1, 1}, {0, 2, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 7}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, true}}, {{true, false}, {true, true}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 7};
                explorerData = new int[]{2, 1};
                mummyData = new int[][]{{4, 7, 1}};
                scorpionData = new int[][]{{1, 5, 1}};
                trapData = new int[][]{{0, 6}};
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{2, 3};
                mummyData = new int[][]{{0, 5, 1}, {6, 4, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 2}};
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, true}, {true, true}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{5, 1};
                mummyData = new int[][]{{0, 4, 0}};
                scorpionData = new int[][]{{7, 7, 0}};
                trapData = null;
                gateData = new int[]{1, 4, 3, 5};
                break;
        }
    }

    private void getTomb7Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {true, true}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{2, 5};
                mummyData = new int[][]{{4, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 2}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, true}, {false, true}, {true, false}, {true, true}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{4, 4};
                mummyData = new int[][]{{4, 0, 0}};
                scorpionData = new int[][]{{3, 2, 0}};
                trapData = null;
                gateData = new int[]{4, 3, 1, 5};
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{true, false}, {false, true}, {true, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 2};
                explorerData = new int[]{4, 1};
                mummyData = new int[][]{{5, 4, 0}, {3, 5, 0}};
                scorpionData = new int[][]{{1, 0, 0}};
                trapData = new int[][]{{1, 0}};
                gateData = new int[]{5, 1, 2, 2};
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {true, true}, {false, true}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{1, 0};
                mummyData = new int[][]{{0, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 5:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{1, 2};
                mummyData = new int[][]{{1, 5, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{5, 1};
                mummyData = new int[][]{{3, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{3, 4, 4, 4};
                break;

            case 7:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{3, 2};
                mummyData = new int[][]{{4, 0, 0}, {5, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 3}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{0, 4};
                mummyData = new int[][]{{4, 5, 0}};
                scorpionData = new int[][]{{5, 3, 0}};
                trapData = new int[][]{{3, 4}};
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 1};
                explorerData = new int[]{5, 5};
                mummyData = new int[][]{{0, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 3}};
                gateData = new int[]{3, 0, 2, 3};
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 2};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{3, 1, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{3, 3};
                explorerData = new int[]{1, 3};
                mummyData = new int[][]{{4, 3, 1}};
                scorpionData = new int[][]{{2, 0, 1}};
                trapData = new int[][]{{4, 1}};
                gateData = null;
                break;

            case 12:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{0, 3};
                mummyData = new int[][]{{2, 1, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 1}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 4};
                explorerData = new int[]{3, 5};
                mummyData = new int[][]{{5, 3, 0}, {5, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 3}};
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{3, 0};
                mummyData = new int[][]{{0, 2, 0}, {0, 3, 0}};
                scorpionData = new int[][]{{1, 0, 0}};
                trapData = new int[][]{{4, 5}};
                gateData = new int[]{3, 5, 4, 4};
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {true, true}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 7};
                explorerData = new int[]{5, 1};
                mummyData = new int[][]{{0, 7, 0}, {7, 2, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{2, 1, 3, 7};
                break;
        }
    }

    private void getTomb8Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 2};
                explorerData = new int[]{3, 0};
                mummyData = new int[][]{{7, 7, 0}, {3, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 5}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {true, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {true, true}, {false, false}, {false, false}}, {{true, true}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{7, 2};
                mummyData = new int[][]{{2, 1, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 1}};
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, true}, {true, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 6};
                explorerData = new int[]{4, 4};
                mummyData = new int[][]{{7, 0, 0}, {2, 2, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{3, 5, 3, 5};
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 2};
                explorerData = new int[]{2, 1};
                mummyData = new int[][]{{1, 2, 0}, {5, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 2}};
                gateData = new int[]{1, 6, 6, 2};
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 1};
                explorerData = new int[]{0, 5};
                mummyData = new int[][]{{7, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {1, 1}};
                gateData = new int[]{2, 1, 4, 1};
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {false, true}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{6, 7};
                mummyData = new int[][]{{6, 4, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 1}, {0, 7}};
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {true, true}, {false, false}}, {{false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 7};
                explorerData = new int[]{1, 7};
                mummyData = new int[][]{{6, 6, 0}, {2, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 1}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 7};
                explorerData = new int[]{7, 3};
                mummyData = new int[][]{{6, 7, 1}, {4, 4, 1}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, true}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 4};
                explorerData = new int[]{1, 2};
                mummyData = new int[][]{{1, 6, 1}, {3, 5, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 0}};
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, true}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}}, {{true, false}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 0};
                explorerData = new int[]{7, 0};
                mummyData = new int[][]{{6, 7, 0}, {4, 6, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{7, 0};
                mummyData = new int[][]{{0, 5, 1}, {1, 6, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 2}};
                gateData = null;
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{true, false}, {true, false}, {true, true}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 7};
                explorerData = new int[]{0, 5};
                mummyData = new int[][]{{7, 4, 0}};
                scorpionData = new int[][]{{4, 7, 0}};
                trapData = null;
                gateData = new int[]{5, 7, 3, 4};
                break;

            case 13:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{2, 2};
                mummyData = new int[][]{{1, 6, 1}};
                scorpionData = new int[][]{{5, 7, 1}};
                trapData = null;
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{0, 4};
                mummyData = new int[][]{{4, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}, {7, 4}};
                gateData = new int[]{4, 4, 6, 3};
                break;

            case 15:
                mazeData = new boolean[][][]{{{true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{0, 4};
                mummyData = new int[][]{{7, 3, 1}};
                scorpionData = new int[][]{{4, 2, 1}};
                trapData = new int[][]{{2, 7}};
                gateData = null;
                break;
        }
    }

    private void getTomb9Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, true}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, true}, {true, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {true, true}, {true, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {true, false}, {true, false}, {false, true}, {true, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{1, 0};
                mummyData = new int[][]{{5, 4, 0}, {6, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 3}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{true, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{4, 5};
                mummyData = new int[][]{{7, 3, 1}};
                scorpionData = new int[][]{{3, 4, 1}};
                trapData = null;
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 7};
                explorerData = new int[]{2, 6};
                mummyData = new int[][]{{7, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{2, 2, 2, 5};
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}}, {{true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{1, 3};
                mummyData = new int[][]{{6, 5, 0}};
                scorpionData = new int[][]{{7, 1, 0}};
                trapData = new int[][]{{0, 7}};
                gateData = new int[]{3, 2, 2, 4};
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{7, 0};
                mummyData = new int[][]{{0, 4, 1}, {6, 4, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 5}};
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, true}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, true}, {true, false}, {true, true}, {false, true}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{1, 3};
                mummyData = new int[][]{{2, 0, 0}};
                scorpionData = new int[][]{{7, 4, 0}};
                trapData = new int[][]{{6, 6}};
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, true}, {true, false}, {false, true}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 1};
                explorerData = new int[]{3, 6};
                mummyData = new int[][]{{2, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 1}};
                gateData = new int[]{1, 7, 6, 4};
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {true, true}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {true, true}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{true, true}, {false, false}, {false, true}, {true, true}, {false, false}, {false, true}, {true, false}, {false, true}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{6, 5};
                mummyData = new int[][]{{3, 7, 1}, {6, 7, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 1}};
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 5};
                explorerData = new int[]{5, 7};
                mummyData = new int[][]{{2, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 6}};
                gateData = new int[]{6, 7, 2, 7};
                break;

            case 10:
                mazeData = new boolean[][][]{{{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{6, 1};
                mummyData = new int[][]{{5, 4, 0}, {7, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 5}};
                gateData = new int[]{6, 7, 0, 6};
                break;

            case 11:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 5};
                explorerData = new int[]{1, 0};
                mummyData = new int[][]{{5, 7, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 7}, {6, 1}};
                gateData = null;
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 6};
                explorerData = new int[]{5, 1};
                mummyData = new int[][]{{6, 1, 0}};
                scorpionData = new int[][]{{4, 5, 0}};
                trapData = new int[][]{{5, 4}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{6, 6};
                mummyData = new int[][]{{1, 1, 1}, {1, 3, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 7}};
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, true}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {true, false}, {false, true}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{0, 6};
                mummyData = new int[][]{{0, 1, 0}};
                scorpionData = new int[][]{{1, 4, 0}};
                trapData = new int[][]{{1, 2}};
                gateData = new int[]{3, 7, 6, 5};
                break;

            case 15:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {true, true}, {true, false}, {false, true}, {false, false}}, {{false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{3, 7};
                explorerData = new int[]{2, 1};
                mummyData = new int[][]{{6, 7, 0}, {4, 3, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{5, 1, 4, 6};
                break;
        }
    }

    private void getTomb10Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 9};
                explorerData = new int[]{4, 9};
                mummyData = new int[][]{{6, 2, 0}};
                scorpionData = new int[][]{{8, 8, 0}};
                trapData = new int[][]{{2, 7}};
                gateData = new int[]{3, 6, 8, 0};
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{6, 4};
                mummyData = new int[][]{{8, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 3}};
                gateData = new int[]{8, 5, 6, 4};
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{1, 7};
                explorerData = new int[]{4, 0};
                mummyData = new int[][]{{1, 7, 1}};
                scorpionData = new int[][]{{0, 6, 1}};
                trapData = new int[][]{{6, 9}};
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, true}, {true, false}, {true, true}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}}, {{true, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 6};
                explorerData = new int[]{7, 0};
                mummyData = new int[][]{{6, 7, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{4, 4, 0, 6};
                break;

            case 5:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{3, 1};
                mummyData = new int[][]{{0, 3, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 3}};
                gateData = new int[]{8, 9, 5, 1};
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, true}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, true}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {true, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 4};
                explorerData = new int[]{4, 3};
                mummyData = new int[][]{{1, 0, 0}, {9, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 4}};
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, true}}, {{false, false}, {true, true}, {false, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {true, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, true}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{true, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 1};
                explorerData = new int[]{9, 8};
                mummyData = new int[][]{{2, 1, 1}, {0, 7, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 9}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{3, 1};
                mummyData = new int[][]{{0, 3, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 3}};
                gateData = new int[]{8, 9, 5, 1};
                break;

            case 9:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{1, 8};
                mummyData = new int[][]{{8, 4, 1}};
                scorpionData = new int[][]{{2, 0, 1}};
                trapData = null;
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 6};
                explorerData = new int[]{2, 6};
                mummyData = new int[][]{{0, 2, 0}, {9, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 8}};
                gateData = new int[]{2, 8, 0, 6};
                break;

            case 11:
                mazeData = new boolean[][][]{{{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 9};
                explorerData = new int[]{2, 1};
                mummyData = new int[][]{{4, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 9}};
                gateData = new int[]{4, 6, 4, 5};
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, true}, {false, false}, {true, true}, {false, false}, {true, true}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {true, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {true, true}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{3, 9};
                mummyData = new int[][]{{1, 0, 1}, {6, 4, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 8}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {true, true}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, true}, {true, true}, {false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{6, 2};
                mummyData = new int[][]{{2, 4, 0}, {8, 8, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 7}};
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {true, false}, {false, false}, {false, true}, {true, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {true, false}, {false, true}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 7};
                explorerData = new int[]{8, 2};
                mummyData = new int[][]{{9, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 7}};
                gateData = new int[]{0, 4, 6, 2};
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {true, true}, {false, true}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 8};
                explorerData = new int[]{5, 9};
                mummyData = new int[][]{{0, 0, 0}, {9, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{9, 3}};
                gateData = null;
                break;
        }
    }

    private void getTomb11Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{3, 6};
                mummyData = new int[][]{{7, 6, 0}};
                scorpionData = new int[][]{{1, 3, 0}};
                trapData = null;
                gateData = new int[]{2, 6, 0, 4};
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 5};
                explorerData = new int[]{2, 5};
                mummyData = new int[][]{{5, 1, 1}};
                scorpionData = new int[][]{{7, 2, 1}};
                trapData = new int[][]{{5, 4}};
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, true}, {true, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 7};
                explorerData = new int[]{0, 4};
                mummyData = new int[][]{{5, 3, 0}, {6, 1, 0}};
                scorpionData = new int[][]{{2, 1, 0}};
                trapData = new int[][]{{7, 3}};
                gateData = new int[]{5, 2, 3, 1};
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 3};
                explorerData = new int[]{8, 8};
                mummyData = new int[][]{{6, 8, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 2}};
                gateData = new int[]{1, 1, 8, 1};
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, true}, {true, false}, {true, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, true}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{4, 5};
                mummyData = new int[][]{{5, 9, 1}, {7, 6, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 6}};
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{4, 0};
                mummyData = new int[][]{{0, 0, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 2}, {3, 6}};
                gateData = new int[]{8, 7, 0, 4};
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{6, 5};
                mummyData = new int[][]{{9, 8, 0}};
                scorpionData = new int[][]{{0, 3, 0}};
                trapData = new int[][]{{5, 8}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}}, {{true, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 9};
                explorerData = new int[]{8, 7};
                mummyData = new int[][]{{8, 9, 0}, {3, 8, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 6}};
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {true, false}, {true, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 9};
                explorerData = new int[]{4, 4};
                mummyData = new int[][]{{1, 1, 0}, {9, 6, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 6}};
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{true, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, true}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {true, true}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{5, 6};
                mummyData = new int[][]{{4, 9, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 2}};
                gateData = new int[]{4, 8, 6, 6};
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, true}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{7, 5};
                mummyData = new int[][]{{0, 0, 0}};
                scorpionData = new int[][]{{9, 9, 0}};
                trapData = new int[][]{{5, 8}};
                gateData = null;
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, true}, {true, true}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{8, 9};
                mummyData = new int[][]{{0, 1, 1}, {9, 2, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 9}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, true}, {false, true}, {false, true}, {false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {true, true}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{5, 6};
                mummyData = new int[][]{{4, 2, 0}, {7, 9, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{8, 6}};
                gateData = null;
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 4};
                explorerData = new int[]{8, 2};
                mummyData = new int[][]{{0, 6, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{8, 1}};
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}}, {{true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 4};
                explorerData = new int[]{2, 1};
                mummyData = new int[][]{{6, 7, 0}, {5, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{8, 7}};
                gateData = null;
                break;
        }
    }

    private void getTomb12Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, true}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, true}, {false, false}, {false, true}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 2};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{7, 7, 1}, {5, 7, 1}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{4, 1};
                mummyData = new int[][]{{6, 2, 0}, {7, 7, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{0, 1, 0, 0};
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, true}, {false, true}, {false, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 2};
                explorerData = new int[]{5, 6};
                mummyData = new int[][]{{2, 3, 1}};
                scorpionData = new int[][]{{1, 7, 1}};
                trapData = null;
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {true, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 7}};
                gateData = new int[]{4, 4, 5, 3};
                break;

            case 5:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 2};
                explorerData = new int[]{2, 6};
                mummyData = new int[][]{{2, 7, 1}, {5, 4, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 1}};
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 4};
                explorerData = new int[]{7, 4};
                mummyData = new int[][]{{1, 6, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 6}};
                gateData = new int[]{6, 5, 0, 3};
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, true}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{3, 2};
                mummyData = new int[][]{{6, 7, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 5}, {0, 7}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{2, 2};
                mummyData = new int[][]{{3, 1, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 4}, {0, 0}};
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{7, 0};
                mummyData = new int[][]{{6, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 3}};
                gateData = new int[]{6, 1, 1, 1};
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, true}, {true, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{1, 0};
                explorerData = new int[]{2, 2};
                mummyData = new int[][]{{3, 5, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 3}};
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {true, true}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, true}, {true, false}, {true, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{6, 5};
                mummyData = new int[][]{{6, 6, 0}};
                scorpionData = new int[][]{{6, 0, 0}};
                trapData = new int[][]{{6, 1}};
                gateData = new int[]{7, 6, 2, 3};
                break;

            case 12:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {true, true}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {true, true}, {true, false}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 7};
                explorerData = new int[]{3, 6};
                mummyData = new int[][]{{0, 5, 1}};
                scorpionData = new int[][]{{4, 0, 1}};
                trapData = new int[][]{{6, 1}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 9};
                explorerData = new int[]{0, 6};
                mummyData = new int[][]{{5, 0, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 3}};
                gateData = new int[]{4, 9, 5, 8};
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{5, 0};
                mummyData = new int[][]{{0, 1, 0}, {8, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 5}};
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{3, 4};
                mummyData = new int[][]{{8, 1, 0}, {2, 8, 0}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = new int[]{3, 0, 8, 5};
                break;
        }
    }

    private void getTomb13Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, true}, {false, true}}, {{true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, true}}, {{true, false}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, true}, {true, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 8};
                explorerData = new int[]{7, 4};
                mummyData = new int[][]{{1, 3, 0}, {4, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 1}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{0, 1};
                mummyData = new int[][]{{9, 6, 0}, {3, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 3}};
                gateData = new int[]{1, 5, 6, 2};
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{1, 1};
                explorerData = new int[]{3, 3};
                mummyData = new int[][]{{5, 0, 1}, {2, 9, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{9, 7}};
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 4};
                explorerData = new int[]{8, 5};
                mummyData = new int[][]{{3, 1, 0}, {5, 0, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 9}};
                gateData = null;
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{9, 1};
                mummyData = new int[][]{{8, 6, 0}};
                scorpionData = new int[][]{{3, 9, 0}};
                trapData = new int[][]{{3, 5}};
                gateData = new int[]{6, 7, 8, 5};
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 7};
                explorerData = new int[]{1, 4};
                mummyData = new int[][]{{7, 8, 1}, {3, 6, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{9, 1}};
                gateData = null;
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, true}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, true}, {true, true}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{2, 9};
                mummyData = new int[][]{{3, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 6}, {6, 4}};
                gateData = new int[]{0, 6, 3, 5};
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{5, 0};
                mummyData = new int[][]{{0, 1, 0}, {8, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 5}};
                gateData = null;
                break;

            case 9:
                mazeData = new boolean[][][]{{{false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 5};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{6, 3, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 5}};
                gateData = new int[]{4, 9, 7, 2};
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, true}, {false, true}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, true}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{3, 3};
                explorerData = new int[]{8, 8};
                mummyData = new int[][]{{8, 5, 1}};
                scorpionData = new int[][]{{1, 9, 1}};
                trapData = new int[][]{{6, 8}};
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 9};
                explorerData = new int[]{5, 8};
                mummyData = new int[][]{{4, 1, 0}};
                scorpionData = new int[][]{{1, 0, 0}};
                trapData = new int[][]{{1, 7}};
                gateData = new int[]{4, 3, 7, 7};
                break;

            case 12:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, true}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 1};
                explorerData = new int[]{8, 9};
                mummyData = new int[][]{{5, 8, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 8}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {true, true}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{1, 0};
                mummyData = new int[][]{{6, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{8, 0}};
                gateData = new int[]{9, 8, 4, 8};
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 8};
                explorerData = new int[]{3, 6};
                mummyData = new int[][]{{9, 9, 1}};
                scorpionData = new int[][]{{1, 2, 1}};
                trapData = new int[][]{{7, 0}};
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, true}}, {{true, false}, {true, true}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{8, 7, 0}, {6, 9, 0}};
                scorpionData = new int[][]{{9, 6, 0}};
                trapData = new int[][]{{0, 9}};
                gateData = new int[]{0, 4, 0, 3};
                break;
        }
    }

    private void getTomb14Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 9};
                explorerData = new int[]{1, 5};
                mummyData = new int[][]{{3, 9, 1}};
                scorpionData = new int[][]{{2, 3, 1}};
                trapData = new int[][]{{0, 9}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, true}, {true, false}, {true, false}, {true, true}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{true, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{9, 8};
                mummyData = new int[][]{{9, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 9}};
                gateData = new int[]{8, 0, 7, 4};
                break;

            case 3:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 2};
                explorerData = new int[]{7, 2};
                mummyData = new int[][]{{8, 1, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{3, 0}};
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{9, 1};
                mummyData = new int[][]{{8, 6, 0}};
                scorpionData = new int[][]{{3, 9, 0}};
                trapData = new int[][]{{3, 5}};
                gateData = new int[]{6, 7};
                break;

            case 5:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 0};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{{8, 6, 1}, {9, 1, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 4}};
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{true, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, true}, {true, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 0};
                explorerData = new int[]{5, 6};
                mummyData = new int[][]{{0, 5, 0}, {6, 8, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{6, 5}};
                gateData = new int[]{1, 2, 8, 2};
                break;

            case 7:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, true}, {true, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 9};
                explorerData = new int[]{2, 1};
                mummyData = new int[][]{{4, 7, 0}, {1, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{4, 6}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 7};
                explorerData = new int[]{4, 2};
                mummyData = new int[][]{{3, 5, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{8, 2}};
                gateData = new int[]{0, 8, 5, 6};
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {true, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {true, true}, {false, true}, {false, false}}, {{false, true}, {false, false}, {true, true}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 4};
                explorerData = new int[]{5, 9};
                mummyData = new int[][]{{4, 4, 1}};
                scorpionData = new int[][]{{9, 0, 1}};
                trapData = null;
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {true, true}, {true, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, true}, {false, true}}, {{false, false}, {false, true}, {true, true}, {false, true}, {false, true}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 1};
                explorerData = new int[]{1, 9};
                mummyData = new int[][]{{2, 0, 0}, {8, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 2}};
                gateData = null;
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, true}, {false, true}, {false, true}, {true, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}};
                doorData = new int[]{0, 9};
                explorerData = new int[]{7, 4};
                mummyData = new int[][]{{0, 6, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 9}};
                gateData = new int[]{4, 9, 6, 8};
                break;

            case 12:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{9, 9};
                mummyData = new int[][]{{1, 3, 1}};
                scorpionData = new int[][]{{8, 5, 1}};
                trapData = new int[][]{{6, 5}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, true}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {true, true}, {false, true}}, {{false, false}, {true, true}, {true, true}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{true, true}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, true}, {true, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 9};
                explorerData = new int[]{5, 7};
                mummyData = new int[][]{{8, 2, 0}, {0, 9, 0}};
                scorpionData = new int[][]{{8, 9, 0}};
                trapData = new int[][]{{3, 6}};
                gateData = new int[]{9, 3, 4, 8};
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {true, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 9};
                explorerData = new int[]{9, 5};
                mummyData = new int[][]{{7, 9, 1}, {0, 3, 1}};
                scorpionData = new int[][]{};
                trapData = null;
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}}, {{true, false}, {false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {true, true}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 7};
                explorerData = new int[]{8, 4};
                mummyData = new int[][]{{9, 4, 0}};
                scorpionData = new int[][]{{6, 9, 0}};
                trapData = new int[][]{{8, 7}};
                gateData = null;
                break;
        }
    }

    private void getTomb15Data() {
        switch (level) {
            case 1:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, true}, {true, false}, {true, false}, {true, true}, {true, false}, {true, true}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, true}, {true, true}, {false, false}, {false, true}, {false, true}, {true, false}, {false, false}}, {{false, false}, {false, true}, {true, true}, {true, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 5};
                explorerData = new int[]{0, 0};
                mummyData = new int[][]{{7, 6, 1}, {5, 9, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{5, 0}};
                gateData = null;
                break;

            case 2:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}, {true, false}, {true, false}, {false, false}}, {{true, true}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, true}}, {{true, true}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}}, {{true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 9};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{8, 0, 0}, {3, 8, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 0}};
                gateData = null;
                break;

            case 3:
                mazeData = new boolean[][][]{{{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {true, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{0, 1};
                explorerData = new int[]{9, 8};
                mummyData = new int[][]{{2, 8, 0}};
                scorpionData = new int[][]{{6, 9, 0}};
                trapData = new int[][]{{1, 3}};
                gateData = null;
                break;

            case 4:
                mazeData = new boolean[][][]{{{false, true}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, true}}, {{false, true}, {false, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 8};
                explorerData = new int[]{2, 8};
                mummyData = new int[][]{{3, 2, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 9}, {5, 9}};
                gateData = new int[]{4, 9, 1, 4};
                break;

            case 5:
                mazeData = new boolean[][][]{{{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, false}}, {{true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, true}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 2};
                explorerData = new int[]{8, 0};
                mummyData = new int[][]{{2, 3, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{0, 9}, {2, 7}};
                gateData = null;
                break;

            case 6:
                mazeData = new boolean[][][]{{{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, true}, {false, true}, {true, true}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}, {true, false}, {false, false}, {true, true}, {false, true}}, {{false, false}, {true, false}, {true, true}, {false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {true, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 2};
                explorerData = new int[]{6, 8};
                mummyData = new int[][]{{2, 2, 0}, {4, 7, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 3}};
                gateData = new int[]{0, 7, 6, 4};
                break;

            case 7:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {true, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}}, {{true, true}, {false, false}, {false, true}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{2, 3};
                mummyData = new int[][]{{4, 7, 1}, {8, 1, 1}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 6}};
                gateData = null;
                break;

            case 8:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}}, {{true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{5, 0};
                mummyData = new int[][]{{7, 6, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 2}, {3, 8}};
                gateData = new int[]{6, 1, 8, 0};
                break;

            case 9:
                mazeData = new boolean[][][]{{{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {false, true}, {true, true}, {false, true}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {true, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, false}}, {{false, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 3};
                explorerData = new int[]{1, 8};
                mummyData = new int[][]{{4, 8, 0}};
                scorpionData = new int[][]{{0, 1, 0}};
                trapData = new int[][]{{1, 6}};
                gateData = null;
                break;

            case 10:
                mazeData = new boolean[][][]{{{false, false}, {false, true}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, true}, {true, true}, {false, true}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 6};
                explorerData = new int[]{2, 6};
                mummyData = new int[][]{{0, 2, 0}, {9, 4, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{7, 8}};
                gateData = new int[]{2, 8, 0, 6};
                break;

            case 11:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{true, false}, {false, true}, {true, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}}, {{true, true}, {false, true}, {false, false}, {false, true}, {true, false}, {false, true}, {true, true}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}}, {{true, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, true}, {true, true}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}}, {{false, false}, {true, true}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 6};
                explorerData = new int[]{5, 6};
                mummyData = new int[][]{{4, 9, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{1, 2}};
                gateData = new int[]{4, 8, 6, 6};
                break;

            case 12:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}, {true, false}, {false, false}, {false, true}}, {{false, false}, {false, false}, {true, false}, {false, true}, {false, true}, {false, true}, {false, false}, {true, true}, {false, false}, {false, false}}, {{false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}}, {{false, false}, {false, true}, {true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{false, false}, {true, false}, {true, false}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}}, {{true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{9, 9};
                mummyData = new int[][]{{1, 3, 1}};
                scorpionData = new int[][]{{8, 5, 1}};
                trapData = new int[][]{{6, 5}};
                gateData = null;
                break;

            case 13:
                mazeData = new boolean[][][]{{{false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, true}, {false, true}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {false, false}, {true, true}, {false, false}, {true, false}, {false, true}}, {{true, false}, {true, true}, {false, false}, {false, true}, {false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}}, {{true, true}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}}, {{false, false}, {true, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}, {{true, false}, {true, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{2, 6};
                explorerData = new int[]{1, 1};
                mummyData = new int[][]{{8, 7, 0}, {6, 9, 0}};
                scorpionData = new int[][]{{9, 6, 0}};
                trapData = new int[][]{{1, 9}};
                gateData = new int[]{0, 4, 0, 3};
                break;

            case 14:
                mazeData = new boolean[][][]{{{false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}, {false, true}, {true, true}, {true, false}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, false}, {false, false}}, {{false, true}, {false, true}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, true}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {true, true}, {true, true}, {false, true}}, {{false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, true}, {false, true}, {false, false}}, {{false, false}, {false, true}, {false, false}, {false, true}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}}, {{true, false}, {false, false}, {false, false}, {true, false}, {false, true}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, true}, {false, false}, {true, true}, {false, true}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}};
                doorData = new int[]{1, 3};
                explorerData = new int[]{6, 0};
                mummyData = new int[][]{{7, 5, 1}};
                scorpionData = new int[][]{{4, 3, 1}};
                trapData = new int[][]{{1, 1}};
                gateData = null;
                break;

            case 15:
                mazeData = new boolean[][][]{{{true, false}, {false, false}, {false, false}, {true, false}, {true, false}, {false, false}, {true, false}, {false, true}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {true, false}, {true, false}, {false, false}, {true, true}, {false, false}, {true, true}, {false, false}}, {{false, false}, {true, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, true}}, {{true, true}, {false, false}, {true, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, true}, {false, true}, {false, false}}, {{false, false}, {true, false}, {true, true}, {true, true}, {false, false}, {false, true}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, false}, {false, false}, {false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, true}, {false, true}}, {{false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, true}, {false, false}, {false, true}}, {{false, true}, {true, false}, {false, true}, {false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}}, {{false, true}, {false, false}, {true, false}, {false, true}, {false, true}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}}, {{false, false}, {false, false}, {false, false}, {false, false}, {true, false}, {false, false}, {false, false}, {false, false}, {false, false}, {false, false}}};
                doorData = new int[]{3, 0};
                explorerData = new int[]{2, 5};
                mummyData = new int[][]{{6, 7, 0}, {7, 8, 0}};
                scorpionData = new int[][]{};
                trapData = new int[][]{{2, 3}};
                gateData = null;
                break;
        }
    }
}
