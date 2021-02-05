package hue.edu.xiong.lc0000.lc0000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Xiong YuSong
 * @date 2020/07/20
 */
public class Main0015 {
    public static void main(String[] args) {
        System.out.println(new Main0015().threeSum(new int[]{0, -5, 3, -4, 1, 3, -4, -2, -2, -2, 0, 3, 0, 1, -4, -2, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            while (i > 0 && i < nums.length && nums[i - 1] == nums[i]) {
                i++;
            }
            if (nums[i] == 0) {
                if (nums[i + 1] > 0) {
                    break;
                }
                if (nums[i + 2] > 0) {
                    break;
                }
                ans.add(Arrays.asList(0, 0, 0));
                break;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int target = nums[i] + nums[l] + nums[r];
                if (target == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while (l < r && nums[l - 1] == nums[l]) {
                        l++;
                    }
                    r--;
                    while (l < r && nums[r + 1] == nums[r]) {
                        r--;
                    }
                } else if (target > 0) {
                    r--;
                    while (l < r && nums[r + 1] == nums[r]) {
                        r--;
                    }
                } else {
                    l++;
                    while (l < r && nums[l - 1] == nums[l]) {
                        l++;
                    }
                }
            }
        }
        return ans;
    }
}
