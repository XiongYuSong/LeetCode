package hue.edu.xiong.lc1200.lc1250;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiong YuSong
 * @date 2020/12/07
 */
public class Main1276 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> list = new ArrayList<>();
        if (tomatoSlices % 2 == 1 || tomatoSlices < cheeseSlices * 2 || tomatoSlices > cheeseSlices * 4) {
            return list;
        }
        int a = (tomatoSlices - cheeseSlices * 2) / 2;
        int b = cheeseSlices - a;
        list.add(a);
        list.add(b);
        return list;
    }
}
