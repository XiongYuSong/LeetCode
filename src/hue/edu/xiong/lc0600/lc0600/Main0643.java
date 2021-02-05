package hue.edu.xiong.lc0600.lc0600;

/**
 * @author Xiong YuSong
 * @date 2021/02/04
 */
public class Main0643 {
    public double findMaxAverage(int[] nums, int k) {
        int count = 0;

        int currCount = 0;

        for (int i = 0; i < k; i++) {
            currCount += nums[i];
        }
        count = currCount;
        for (int i = k; i < nums.length; i++) {
            currCount = currCount + nums[i] - nums[i - k];
            if (currCount > count)
                count = currCount;
        }

        return 1.0 * count / k;
    }
}
