package hue.edu.xiong.lc0300.lc0350;

import java.util.*;

/**
 * @author Xiong YuSong
 * @date 2020/12/11
 */
public class Main0380 {
}

class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random rand = new Random();

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int currIndex = map.get(val);
            int lastVal = list.get(list.size() - 1);

            list.set(currIndex, lastVal);
            map.put(lastVal, currIndex);

            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }
        return false;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
