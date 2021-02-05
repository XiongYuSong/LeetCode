package hue.edu.xiong.lc1200.lc1200;

import hue.edu.xiong.Main;

/**
 * @author Xiong YuSong
 * @date 2021/02/05
 */
public class Main1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int length = Math.min(s.length(), t.length());
        int[] temp = new int[length];
        int ans = 0;
        int currCount = 0;
        int leftIndex = 0;
        for (int i = 0; i < length; i++) {
            temp[i] = Math.abs(s.charAt(i) - t.charAt(i));
            currCount += temp[i];
            if (currCount <= maxCost) {
                ans = Math.max(ans, i - leftIndex + 1);
            } else {
                do {
                    currCount -= temp[leftIndex++];
                } while (currCount > maxCost);
            }
        }
        return ans;
    }
}
