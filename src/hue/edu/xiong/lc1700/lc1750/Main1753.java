package hue.edu.xiong.lc1700.lc1750;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main1753 {

    public int maximumScore(int a, int b, int c) {
        List<Integer> collect = Arrays.asList(a, b, c).stream().sorted().collect(Collectors.toList());
        a = collect.get(0);
        b = collect.get(1);
        c = collect.get(2);
        int i = a + b - c;
        if (i > 0) {
            return c + i / 2;
        } else {
            return a + b;
        }
    }
}
