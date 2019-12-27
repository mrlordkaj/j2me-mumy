/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Thinh
 */
public class MenuItem {

    public StringBuffer title;
    public int command = Menu.COMMAND_NONE;
    public boolean selected = false;

    public MenuItem(String title, int command) {
        this.title = new StringBuffer(title);
        this.command = command;
    }
}
