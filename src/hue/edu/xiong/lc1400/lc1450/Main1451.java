package hue.edu.xiong.lc1400.lc1450;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Xiong YuSong
 * @date 2020/12/07
 */
public class Main1451 {
    public static void main(String[] args) {
        System.out.println(new Main1451().arrangeWords("Leetcode is cool"));
    }

    public String arrangeWords(String text) {
        String[] strs = text.split(" ");
        strs[0] = strs[0].substring(0, 1).toLowerCase() + strs[0].substring(1);
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        for (String s : strs) {
            List<String> list = map.getOrDefault(s.length(), new ArrayList<>());
            list.add(s);
            map.put(s.length(), list);
        }

        StringBuilder sb = new StringBuilder();
        for (List<String> list : map.values()) {
            for (String s : list) {
                sb.append(" ").append(s);
            }
        }
        return sb.substring(1, 2).toUpperCase() + sb.substring(2);
    }
}
