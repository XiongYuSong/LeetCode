package hue.edu.xiong.lc1200.lc1200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Xiong YuSong
 * @date 2020/10/28
 */
public class Main1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int elem : arr)
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        return map.size() == new HashSet<>(map.values()).size();
    }
}
