/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Thinh
 */
public class StringHelper {

    //wrap
    private static Vector wrap(String text, Font font, int width) {
        Vector result = new Vector();
        if (text == null) {
            return result;
        }

        boolean hasMore = true;

        // The current index of the cursor
        int current = 0;

        // The next line break index
        int lineBreak = -1;

        // The space after line break
        int nextSpace = -1;

        while (hasMore) {
            //Find the line break
            while (true) {
                lineBreak = nextSpace;
                if (lineBreak == text.length() - 1) {
                    // We have reached the last line
                    hasMore = false;
                    break;
                } else {
                    nextSpace = text.indexOf(' ', lineBreak + 1);
                    if (nextSpace == -1) {
                        nextSpace = text.length() - 1;
                    }
                    int linewidth = font.substringWidth(text, current, nextSpace - current);
                    // If too long, break out of the find loop
                    if (linewidth > width) {
                        break;
                    }
                }
            }
            String line = text.substring(current, lineBreak + 1);
            result.addElement(line);
            current = lineBreak + 1;
        }
        return result;
    }

    public static int drawWrapString(Graphics g, String str, int x, int y, int width, int anchor) {
        Font font = g.getFont();
        Vector lines = wrap(str, font, width);
        for (int i = 0; i < lines.size(); i++) {
            int liney = y + (i * font.getHeight());
            g.drawString((String) lines.elementAt(i), x, liney, anchor);
        }
        return y + (lines.size() * font.getHeight());
    }

//    static public void drawMultilineString(Graphics g, String str, int x, int y, int anchor) {
//        int lineHeight = g.getFont().getHeight();
//        String[] lines = split(new StringBuffer(str), "/n");
//        for (int i = 0; i < lines.length; i++) {
//            int liney = y + (i * lineHeight);
//            g.drawString(lines[i], x, liney, anchor);
//        }
//    }
    public static void drawScoreBoard(Graphics g, StringBuffer str, int x, int y) {
        String[] lines = split(str, ";");
        int lineHeight = g.getFont().getHeight();
        for (int i = 0; i < lines.length; i++) {
            String[] details = split(new StringBuffer(lines[i]), "#");
            g.drawString((i + 1) + ". " + details[0], x, y + (i * lineHeight), Graphics.TOP | Graphics.LEFT);
            g.drawString(details[1], 240 - x, y + (i * lineHeight), Graphics.TOP | Graphics.RIGHT);
        }
    }

    //split
    public static String[] split(StringBuffer sb, String splitter) {
        String[] strs = new String[sb.length()];
        int splitterLength = splitter.length();
        int initialIndex = 0;
        int indexOfSplitter = indexOf(sb, splitter, initialIndex);
        int count = 0;
        if (-1 == indexOfSplitter) {
            return new String[]{sb.toString()};
        }
        while (-1 != indexOfSplitter) {
            char[] chars = new char[indexOfSplitter - initialIndex];
            sb.getChars(initialIndex, indexOfSplitter, chars, 0);
            initialIndex = indexOfSplitter + splitterLength;
            indexOfSplitter = indexOf(sb, splitter, indexOfSplitter + 1);
            strs[count] = new String(chars);
            count++;
        }
        // get the remaining chars.
        if (initialIndex + splitterLength <= sb.length()) {
            char[] chars = new char[sb.length() - initialIndex];
            sb.getChars(initialIndex, sb.length(), chars, 0);
            strs[count] = new String(chars);
            count++;
        }
        String[] result = new String[count];
//        for (int i = 0; i < count; i++) {
//            result[i] = strs[i];
//        }
        System.arraycopy(strs, 0, result, 0, count);
        return result;
    }

    public static int indexOf(StringBuffer sb, String str, int start) {
        int index = -1;
        if ((start >= sb.length() || start < -1) || str.length() <= 0) {
            return index;
        }
        char[] tofind = str.toCharArray();
        outer:
        for (; start < sb.length(); start++) {
            char c = sb.charAt(start);
            if (c == tofind[0]) {
                if (1 == tofind.length) {
                    return start;
                }
                inner:
                for (int i = 1; i < tofind.length; i++) { // start on the 2nd character
                    char find = tofind[i];
                    int currentSourceIndex = start + i;
                    if (currentSourceIndex < sb.length()) {
                        char source = sb.charAt(start + i);
                        if (find == source) {
                            if (i == tofind.length - 1) {
                                return start;
                            }
                            continue inner;
                        } else {
                            start++;
                            continue outer;
                        }
                    } else {
                        return -1;
                    }

                }
            }
        }
        return index;
    }

    public static String showScore(int score) {
        StringBuffer rs = new StringBuffer();
        int prefixLength = 6 - Integer.toString(score).length();
        while (prefixLength > 0) {
            rs.append("0");
            prefixLength--;
        }
        rs.append(score);
        return rs.toString();
    }
    
    public static String replace( String str, String pattern, String replace ) {
        int s = 0;
        int e = 0;
        StringBuffer result = new StringBuffer();

        while ( (e = str.indexOf( pattern, s ) ) >= 0 ) 
        {
            result.append(str.substring( s, e ) );
            result.append( replace );
            s = e+pattern.length();
        }
        result.append( str.substring( s ) );
        return result.toString();
    }
}
