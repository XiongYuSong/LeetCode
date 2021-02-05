package hue.edu.xiong.lc0000.lc0000;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Xiong YuSong
 * @date 2020/07/18
 */
public class Main0012 {
    public static void main(String[] args) {
        System.out.println(new Main0012().intToRoman(3999));
    }


    String[] strs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",};
    int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                num -= nums[i];
                ans.append(strs[i]);
            }
        }
        return ans.toString();
    }
}
