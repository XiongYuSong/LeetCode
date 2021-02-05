package hue.edu.xiong.lc0000.lc0000;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Xiong YuSong
 * @date 2020/09/27
 */
public class Main0031 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        new Main0031().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }


//    public void nextPermutation(int[] nums) {
//        if (nums == null || nums.length <= 1) {
//            return;
//        }
//        for (int i = nums.length - 1; i > 0; i--) {
//            if (nums[i] > nums[i - 1]) {
//                for (int j = nums.length - 1; j >= i; j--) {//找到大于i的第一个数
//
//                }
//            }
//        }
//        arrReverse(nums);
//    }

    private void reverse(int[] nums ,int index) {
        int left = index;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left++, right--);
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
