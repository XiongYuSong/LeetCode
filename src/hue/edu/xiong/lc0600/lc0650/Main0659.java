package hue.edu.xiong.lc0600.lc0650;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.*;

/**
 * @author Xiong YuSong
 * @date 2020/12/04
 */
public class Main0659 {
    public static void main(String[] args) {
        System.out.println(new Main0659().isPossible(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10, 11}));
    }

    public boolean isPossible(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int preNum = nums[0];
        for (int num : nums) {
            if (num != preNum && num != preNum + 1)
                if (check(map))
                    map.clear();
                else
                    return false;
            preNum = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        String a = "";
        a.toUpperCase();
        return check(map);
    }

    private boolean check(LinkedHashMap<Integer, Integer> map) {
        while (map.size() > 0) {
            int preNum = 0;
            int count = 0;
            while (true) {
                if (map.size() == 0)
                    return count >= 3;
                int key = count == 0 ? map.keySet().iterator().next() : preNum + 1;
                int value = map.getOrDefault(key, 0);
                if (value == 0)
                    break;
                int preNumValue = map.getOrDefault(preNum, 0);
                if (value < preNumValue + 1) {
                    if (count >= 3)
                        break;
                    else
                        return false;

                }
                value--;
                if (value == 0)
                    map.remove(key);
                else
                    map.put(key, value);
                count++;
                preNum = key;
            }
        }
        return true;
    }
}
