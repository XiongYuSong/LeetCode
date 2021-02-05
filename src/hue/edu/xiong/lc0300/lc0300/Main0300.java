package hue.edu.xiong.lc0300.lc0300;

/**
 * //给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * //
 * // 示例:
 * //
 * // 输入: [10,9,2,5,3,7,101,18]
 * //输出: 4
 * //解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * //
 * // 说明:
 * //
 * //
 * // 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * // 你算法的时间复杂度应该为 O(n2) 。
 * //
 * //
 * // 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 * // Related Topics 二分查找 动态规划
 */

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/23
 */
public class Main0300 {
//    public int lengthOfLIS(int[] nums) {
//        int[] dp = new int[nums.length];
//        int maxLength = 0;
//        for (int i = 0; i < nums.length; i++) {
//            dp[i] = 1;
//            for (int j = 0; j < i; j++) {
//                if (nums[j] < nums[i]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//            maxLength = Math.max(maxLength, dp[i]);
//        }
//        return maxLength;
//    }

    public static void main(String[] args) {
        System.out.println(new Main0300().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    public int lengthOfLIS(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int[] result = new int[nums.length];
        result[0] = nums[0];
        int resLength = 0;
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result[resLength]) {
                result[++resLength] = nums[i];
                ans++;
            } else {
                //找到大于等于该数的第一个数的索引
                int index = func(result, 0, resLength, nums[i]);
                result[index] = nums[i];
            }
        }
        return ans;
    }

    private int func(int[] nums, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
