package hue.edu.xiong.lc0000.lc0050;

public class Main0075 {
//    public void sortColors(int[] nums) {
//        int m1 = 0, m2 = 0, m0 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) m0++;
//            if (nums[i] == 1) m1++;
//            if (nums[i] == 2) m2++;
//        }
//        for (int i = 0; i < m0; i++) {
//            nums[i] = 0;
//        }
//        for (int i = m0; i < m0 + m1; i++) {
//            nums[i] = 1;
//        }
//        for (int i = m0 + m1; i < m0 + m1 + m2; i++) {
//            nums[i] = 2;
//        }
//    }

    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        for (int i = 0; i <= r; i++) {
            if (nums[i] == 0) {
                swap(nums, i, l++);
            } else if (nums[i] == 2) {
                swap(nums, i--, r--);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
