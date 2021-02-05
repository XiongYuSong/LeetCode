package hue.edu.xiong.lc0300.lc0350;

/**
 * @author Xiong YuSong
 * @date 2020/12/18
 */
public class Main0389 {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            chars[c - 'a']--;
            if (chars[c - 'a'] < 0) {
                return c;
            }
        }
        return ' ';
    }
}
