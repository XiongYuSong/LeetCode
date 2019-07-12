package hue.edu.xiong.lc0400.lc0450;

import java.util.Arrays;

public class Main0455 {
    public static void main(String[] args) {
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                ans++;
            } else {
                j++;
            }
        }
        return ans;
    }
}
