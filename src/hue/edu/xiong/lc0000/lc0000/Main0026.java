package hue.edu.xiong.lc0000.lc0000;

/**
 * @author Xiong YuSong
 * @date 2020/08/21
 */
public class Main0026 {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
