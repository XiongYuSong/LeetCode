package hue.edu.xiong.lc0800.lc0800;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * @author Xiong YuSong
 * @date 2020/12/07
 */
public class Main0846 {
    public static void main(String[] args) {
        System.out.println(new Main0846().isNStraightHand(new int[]{2,1}, 2));
    }

    public boolean isNStraightHand(int[] hand, int W) {
        if (hand == null || hand.length % W != 0)
            return false;
        Arrays.sort(hand);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : hand)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int currentKey = map.keySet().iterator().next();
        int count = 0;
        while (map.size() > 0) {
            int value = map.getOrDefault(currentKey, 0);
            if (value == 0)
                return false;
            value--;
            if (value == 0)
                map.remove(currentKey);
            else
                map.put(currentKey, value);
            count++;
            currentKey++;
            if (count == W) {
                count = 0;
                if (map.size() == 0)
                    return true;
                currentKey = map.keySet().iterator().next();
            }
        }
        return true;
    }
}
