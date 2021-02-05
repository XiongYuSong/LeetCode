package hue.edu.xiong.lc0600.lc0600;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Xiong YuSong
 * @date 2020/12/11
 */
public class Main0649 {
    public static void main(String[] args) {
        System.out.println(new Main0649().predictPartyVictory("RDD"));
    }

    public String predictPartyVictory(String senate) {
        char[] chars = senate.toCharArray();
        int length = chars.length;

        int rCount = 0;
        for (char c : chars) {
            if (c == 'R')
                rCount++;
        }
        int dCount = length - rCount;

        int count = 0; /// c 和 r的差值
        int newLength = 0;
        while (rCount > 0 && dCount > 0) {
            for (int index = 0; index <length ; index++) {
                if (rCount == 0 || dCount == 0)
                    break;
                if (chars[index] == 'R') {
                    if (count < 0) {
                        rCount--;
                    } else {
                        chars[newLength++] = chars[index];
                    }
                    count++;
                } else {
                    if (count > 0) {
                        dCount--;
                    } else {
                        chars[newLength++] = chars[index];
                    }
                    count--;
                }
            }
            length = newLength;
            newLength = 0;
        }
        return rCount == 0 ? "Dire" : "Radiant";
    }
}
