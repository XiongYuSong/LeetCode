package hue.edu.xiong.lc0000.lc0000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/7
 */
public class Main0040 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        Arrays.sort(candidates);
        fun(ans, item, candidates, 0, target);
        return ans;
    }

    private void fun(List<List<Integer>> ans, List<Integer> item, int[] candidates, int num, int target) {
        //每一层都有出现或者不出现当前数字的选择
        if (num == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(item));
            }
            return;
        }

        //判断当前数值的数有几个
        int count = 1;
        for (int i = num + 1; i < candidates.length; i++) {
            if (candidates[i] == candidates[num]) {
                count++;
            } else {
                break;
            }
        }
        fun(ans, item, candidates, num + count, target);
        int i = 0;
        for (; i < count; i++) {
            if (target - candidates[num] * (i + 1) < 0) {
                break;
            }
            item.add(candidates[num]);
            fun(ans, item, candidates, num + count, target - candidates[num] * (i + 1));
        }
        for (i--; i >= 0; i--) {
            item.remove(item.size() - 1);
        }
    }
}
