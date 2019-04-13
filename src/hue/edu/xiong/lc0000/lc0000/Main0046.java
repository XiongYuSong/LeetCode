package hue.edu.xiong.lc0000.lc0000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/13
 */
public class Main0046 {

    public static void main(String[] args) {
        permute(new int[]{1, 2, 3});
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        permute(lists, list, nums, flag, 0);
        return lists;
    }

    /**
     * @param lists 这是返回的列表
     * @param list  保存当前全排列的格式
     * @param nums  全排列源数组
     * @param flag  当前位置是否已经加入list中
     * @param num   递归的层数
     */
    private static void permute(List<List<Integer>> lists, List<Integer> list, int[] nums, boolean[] flag, int num) {
        if (num == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == false) {
                flag[i] = true;
                list.add(nums[i]);
                permute(lists, list, nums, flag, num + 1);
                list.remove(list.size() - 1);
                flag[i] = false;
            }
        }
    }
}
