/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.Random;

/**
 *
 * @author Thinh
 */
public class MathHelper {

    public static int round(double a) {
        if (a - (int) a >= 0.5) {
            return (int) a + 1;
        } else {
            return (int) a;
        }
    }

    public static String showTime(int seconds) {
        StringBuffer rs = new StringBuffer(8);
        int hours = (int) (seconds / 3600);
        seconds -= hours * 3600;
        int minutes = (int) (seconds / 60);
        seconds -= minutes * 60;
        if (hours < 10) {
            rs.append("0");
        }
        rs.append(hours);
        rs.append(":");
        if (minutes < 10) {
            rs.append("0");
        }
        rs.append(minutes);
        rs.append(":");
        if (seconds < 10) {
            rs.append("0");
        }
        rs.append(seconds);
        return rs.toString();
    }

    public static String RandomDeviceId() {
        char[] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuffer sb = new StringBuffer(32);
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}
