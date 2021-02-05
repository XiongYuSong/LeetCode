package hue.edu.xiong.lc0300.lc0300;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Xiong YuSong
 * @date 2020/11/02
 */
public class Main0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num: nums1) {
            set1.add(num);
        }
        for (int num: nums2) {
            set2.add(num);
        }
        set1.retainAll(set2);
        int i = 0;
        int[] res = new int[set1.size()];
        for (Integer num : set1) {
            res[i++] = num;
        }
        return res;
    }
}
