package hue.edu.xiong.lc1000.lc1000;

import java.util.PriorityQueue;

public class Main1043 {

    public static void main(String[] args) {
        System.out.println(new Main1043().maxSumAfterPartitioning(new int[]{1,4,1,5,7,3,6,1,9,9,3}, 4));
    }

    /**
     * 给你一个整数数组 arr，请你将该数组分隔为长度 最多 为 k 的一些（连续）子数组。分隔完成后，每个子数组的中的所有值都会变为该子数组中的最大值。
     * <p>
     * 返回将数组分隔变换后能够得到的元素最大和。本题所用到的测试用例会确保答案是一个 32 位整数。
     * <p>
     * 输入：arr = [1,15,7,9,2,5,10], k = 3
     * 输出：84
     * 解释：数组变为 [15,15,15,9,10,10,10]
     * <p>
     * 输入：arr = [7,1,4,1,5,3,6,1,9,9,3], k = 4
     * 输出：83
     * <p>
     * 输入：arr = [1], k = 1
     * 输出：1
     * <p>
     * 1 <= arr.length <= 500
     * 0 <= arr[i] <= 109
     * 1 <= k <= arr.length
     *
     * @param arr
     * @param k
     * @return
     */
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int ans = 0;
        int maxInt = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            maxInt = Math.max(arr[i], maxInt);
            int j = i + 1;
            if (j == length) {
                ans += (j % k) * maxInt;
                break;
            } else if (j % k == 0) {
                ans += k * maxInt;
                maxInt = 0;
            }
        }
        return ans;
    }
}
