package hue.edu.xiong.lc0100.lc0150;
/**
 * //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * //
 * // 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * //
 * //
 * //
 * // 示例 1:
 * //
 * // 输入: [3,2,3]
 * //输出: 3
 * //
 * // 示例 2:
 * //
 * // 输入: [2,2,1,1,1,2,2]
 * //输出: 2
 * //
 * // Related Topics 位运算 数组 分治算法
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiong YuSong
 * @date 2020/06/11
 */
public class Main0169 {

    public static void main(String[] args) {
        new Main0169().majorityElement(new int[]{2, 2});
    }

    /**
     * 1.排序，正中间的数就是多数元素
     * 2.第一次遍历使用map将其装着，然后第二次遍历map找出这个数
     * 3.快排过程中，如果当前元素刚好是2/n位上的元素，即返回nums[2/n]元素
     *
     * @param nums
     * @return
     */
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() >= nums.length / 2.0) {
//                return entry.getKey();
//            }
//        }
//        return 0;
//    }
    public int majorityElement(int[] nums) {
        return quickSearch(nums, 0, nums.length - 1);
    }

    private int quickSearch(int[] nums, int left, int right) {
        if (left >= right) {
            return nums[left];
        }
        int l = left;
        int r = right;
        int target = nums[l];
        while (r > l) {
            while (r > l && nums[r] >= target) {
                r--;
            }
            nums[l] = nums[r];
            while (r > l && nums[l] < target) {
                l++;
            }
            nums[r] = nums[l];
        }
        nums[r] = target;
        if (r == nums.length / 2) {
            return target;
        } else if (r > nums.length / 2) {
            return quickSearch(nums, left, r - 1);
        } else {
            return quickSearch(nums, l + 1, right);
        }
    }


}
