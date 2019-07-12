package hue.edu.xiong.lc0300.lc0300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main0347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] lists = new ArrayList[nums.length + 1];
        for (Integer key : map.keySet()) {
            Integer i = map.get(key);
            if (lists[i] == null) lists[i] = new ArrayList<>();
            lists[i].add(key);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = nums.length; i >= 0; i--) {
            if (lists[i] != null) {
                k -= lists[i].size();
                ans.addAll(lists[i]);
                if (k <= 0) break;
            }
        }
        return ans;
    }
}
