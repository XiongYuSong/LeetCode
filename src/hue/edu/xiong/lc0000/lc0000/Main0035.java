package hue.edu.xiong.lc0000.lc0000;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/15
 */
public class Main0035 {

    public static void main(String[] args) {
        searchInsert(new int[]{1, 2, 5, 6}, 7);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + right >> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
//        if(nums[left] < target){
//            return left+1;
//        }else{
        return left;
//        }
    }
}
