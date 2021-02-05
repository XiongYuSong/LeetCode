package hue.edu.xiong.lc0900.lc0900;

/**
 * //给你一个整数数组 nums，请你将该数组升序排列。
 * //
 * //
 * //
 * //
 * //
 * //
 * // 示例 1：
 * //
 * // 输入：nums = [5,2,3,1]
 * //输出：[1,2,3,5]
 * //
 * //
 * // 示例 2：
 * //
 * // 输入：nums = [5,1,1,2,0,0]
 * //输出：[0,0,1,1,2,5]
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // 1 <= nums.length <= 50000
 * // -50000 <= nums[i] <= 50000
 * //
 * //
 */

/**
 * @author Xiong YuSong
 * @date 2020/06/22
 */
public class Main0912 {
    public int[] sortArray(int[] nums) {
        int[] arr = new int[100001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] + 50000] += 1;
        }
        int index = 0;
        for (int i = 0; i < 100001; i++) {
            while (arr[i] != 0) {
                nums[index] = i - 50000;
                arr[i] -= 1;
                index += 1;
            }
        }
        return nums;
    }
}
