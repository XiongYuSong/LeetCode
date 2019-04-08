package hue.edu.xiong.lc0000.lc0050;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main0078 {
    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3});
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> item = null;
        String str = null;
        int pow = (int) Math.pow(2, nums.length);
        for (int i = 0; i < pow; i++) {
            str = Integer.toBinaryString(i + pow);
            item = new ArrayList<>();
            for (int j = 1; j <= nums.length; j++) {
                if (str.charAt(j) == '1') {
                    item.add(nums[j - 1]);
                }
            }
            ans.add(item);
        }
        return ans;
    }

}
