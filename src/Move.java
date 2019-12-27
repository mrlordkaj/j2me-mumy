/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Vector;

/**
 *
 * @author Thinh
 */
public class Move {

    public int[] explorer;
    public Vector mummy = new Vector();
    public Vector scorpion = new Vector();
    public boolean gate = false;
    //explorer: 2 position int
    //mummy array: 2 position int (if killed = false);
    //scorpion array: 2 position int (if killed = false);
    //gate: 1 state boolean (true - dong; false - mo)
}
