package hue.edu.xiong.lc0300.lc0300;

/**
 * @author Xiong YuSong
 * @date 2020/12/29
 */
public class Main0330 {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length, index = 0;
        while (x <= n) {
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                x *= 2;
                patches++;
            }
        }
        return patches;
    }
}
