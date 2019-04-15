package hue.edu.xiong.lc0000.lc0000;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/15
 */
public class Main0034 {
    public static void main(String[] args) {
        searchRange(new int[]{5, 7, 7, 8, 8, 10}, 11);
        searchRange(new int[]{1, 2, 5, 6}, 7);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {//查找大于等于target的第一个数
            int mid = left + right >> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums.length == 0 || nums[left] != target) {
            return ans;
        }
        ans[0] = left;
        left = 0;
        right = nums.length - 1;
        while (left < right) {//查找小于等于target的第最后一个数
            int mid = left + right + 1 >> 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        ans[1] = left;
        return ans;
    }
}
