package hue.edu.xiong.lc0600.lc0650;

/**
 * @Author Xiong YuSong
 * @Date 2019/6/23
 */
public class Main0680 {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return fun(s, l + 1, r) || fun(s, l, r - 1);
            }
        }
        return true;
    }

    public boolean fun(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
