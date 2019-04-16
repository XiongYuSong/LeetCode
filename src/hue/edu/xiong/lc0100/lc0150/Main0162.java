package hue.edu.xiong.lc0100.lc0150;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/16
 */
public class Main0162 {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
