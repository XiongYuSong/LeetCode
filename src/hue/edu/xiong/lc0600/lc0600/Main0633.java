package hue.edu.xiong.lc0600.lc0600;

/**
 * @Author Xiong YuSong
 * @Date 2019/6/22
 */
public class Main0633 {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;
        int l = 0, r = (int) Math.sqrt(c);
        while (l <= r) {
            int target = l * l + r * r;
            if (target < c) l++;
            else if (target > c) r--;
            else return true;
        }
        return false;
    }
}
