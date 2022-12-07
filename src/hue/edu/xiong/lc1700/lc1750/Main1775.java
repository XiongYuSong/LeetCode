package hue.edu.xiong.lc1700.lc1750;

import java.util.Arrays;

public class Main1775 {
    public static void main(String[] args) {
        System.out.println(new Main1775().minOperations(new int[]{5,6,4,3,1,2}, new int[]{6,3,3,1,4,5,3,4,1,3,4}));;
    }

    public int minOperations(int[] nums1, int[] nums2) {
        int num1Length = nums1 == null ? 0 : nums1.length;
        int num2Length = nums2 == null ? 0 : nums2.length;
        if (num1Length == 0 && num2Length == 0) {
            return 0;
        }
        int min = Math.min(num1Length, num2Length);
        int max = Math.max(num1Length, num2Length);
        if (min * 6 < max) {
            return -1;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        long sum1 = Arrays.stream(nums1).sum();
        long sum2 = Arrays.stream(nums2).sum();
        if (sum1 > sum2) {
            return fun(nums2, nums1, sum1 - sum2);
        } else if (sum2 > sum1) {
            return fun(nums1, nums2, sum2 - sum1);
        } else {
            return 0;
        }
    }

    /**
     * @param diffNum 差值
     * @return
     */
    private int fun(int[] minArray, int[] maxArray, long diffNum) {
        int ansCount = 0;
        int minArrayIndex = 0;
        int maxArrayIndex = maxArray.length - 1;
        int currNum = 1;
        while (diffNum > 0) {
            for (; minArrayIndex < minArray.length; minArrayIndex++) {
                int num = minArray[minArrayIndex];
                if (num != currNum) {
                    break;
                }
                diffNum -= 6 - num;
                ansCount++;
                if (diffNum <= 0) {
                    return ansCount;
                }
            }

            for (; maxArrayIndex >= 0; maxArrayIndex--) {
                int num = maxArray[maxArrayIndex];
                if (num != 7 - currNum) {
                    break;
                }
                diffNum -= num - 1;
                ansCount++;
                if (diffNum <= 0) {
                    return ansCount;
                }
            }
            currNum ++;
        }
        return ansCount;
    }
}
