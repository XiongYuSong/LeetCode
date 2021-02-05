package hue.edu.xiong.lc0400.lc0450;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author Xiong YuSong
 * @date 2020/09/01
 */
public class Main0486 {

    public static void main(String[] args) {
        System.out.println(new Main0486().PredictTheWinner(new int[]{2, 4, 55, 6, 8}));
    }

    public boolean PredictTheWinner(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            dp[i] = nums[i];
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[length - 1] >= 0;
    }

//    public boolean PredictTheWinner(int[] nums) {
//        if (nums.length % 2 == 0) {
//            return true;
//        }
//        return fun(0, nums.length - 1, nums, 1) >= 0;
//    }
//
//    /**
//     * @param left  左边界
//     * @param right 右边界
//     * @param nums  总数组
//     * @param turn  层数：偶数层就a玩家选择
//     * @return total a玩家得分（扣除B玩家）
//     */
//    private int fun(int left, int right, int[] nums, int turn) {
//        if (left == right) {
//            //只有可能奇数进来，因为偶数都已经返回true了
//            //奇数进来只有可能是a进来找数了
//            return nums[left] * turn;
//        }
//        //选择左边的所有数
//        int leftNum = fun(left + 1, right, nums, -turn) + nums[left] * turn;
//        //选择右边的所有数
//        int rightNum = fun(left, right - 1, nums, -turn) + nums[right] * turn;
//        return Math.max(leftNum * turn, rightNum * turn) * turn;//取反再取反看上去没有问题，但是如果是当前是B操作，分越低B选择就越好
//    }
}
