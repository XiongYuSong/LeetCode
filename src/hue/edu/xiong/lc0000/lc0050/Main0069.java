package hue.edu.xiong.lc0000.lc0050;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/16
 */
public class Main0069 {

    public static void main(String[] args) {

    }

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left < right) {//平方小于等于x的最大的一个数
            int mid = left + right + 1 >> 1;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}
