package hue.edu.xiong.lc0100.lc0150;

/**
 * @Author Xiong YuSong
 * @Date 2019/6/22
 */
public class Main0167 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if ((numbers[l] + numbers[r]) < target) {
                l++;
            } else if ((numbers[l] + numbers[r]) > target) {
                r--;
            } else {
                ans[0] = l + 1;
                ans[1] = r + 1;
                break;
            }
        }
        return ans;
    }
}
