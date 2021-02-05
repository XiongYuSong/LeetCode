package hue.edu.xiong.lc0700.lc0750;

import java.util.*;

/**
 * @author Xiong YuSong
 * @date 2020/10/22
 */
public class Main0763 {
    public static void main(String[] args) {
        System.out.println(new Main0763().partitionLabels("ababcbacadefegdehijhklij"));
    }

    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        // 做映射表，记录每个字母最后出现的位置
        int[] ma = new int[26];
        int index = 0;
        for (char ch : s.toCharArray()) {
            ma[ch - 'a'] = index++;
        }
        index = 0;
        for (char ch : s.toCharArray()) {
            end = Math.max(end, ma[ch - 'a']);
            if (index == end) {
                list.add(end - start + 1);
                start = end + 1;
                end = start;
            }
            index++;
        }
        return list;
    }
}
