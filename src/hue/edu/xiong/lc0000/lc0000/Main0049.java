package hue.edu.xiong.lc0000.lc0000;

import java.util.*;

/**
 * @author Xiong YuSong
 * @date 2020/12/14
 */
public class Main0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            String key = fun(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    private String fun(char[] array) {
        int[] nums = new int[26];
        for (char ch : array) {
            nums[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                continue;
            sb.append(nums[i]);
            sb.append(i + 'a');
        }
        return sb.toString();
    }
}
