package hue.edu.xiong.lc0000.lc0050;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/23
 */
public class Main0053 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //如果当前值为负数，该序列肯定是减小的，所以以当前数组元素为起点
            sum = Math.max(nums[i], sum + nums[i]);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
