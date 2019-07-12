package hue.edu.xiong.lc0400.lc0450;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main0451 {

    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        List<Character>[] lists = new List[chars.length + 1];
        for (Character character : map.keySet()) {
            Integer i = map.get(character);
            if (lists[i] == null) lists[i] = new ArrayList<>();
            lists[i].add(character);
        }
        for (int i = chars.length; i > 0; i--) {
            if (lists[i] == null) continue;
            for (int j = 0; j < lists[i].size(); j++) {
                Character character = lists[i].get(j);
                for (int k = 0; k < i; k++) {
                    sb.append(character);
                }
            }
        }
        return sb.toString();
    }
}
