package hue.edu.xiong.lc0600.lc0650;

import java.util.HashSet;
import java.util.Set;

// 开关 1 ：反转当前所有灯的状态（即开变为关，关变为开）
// 开关 2 ：反转编号为偶数的灯的状态（即 2, 4, ...）
// 开关 3 ：反转编号为奇数的灯的状态（即 1, 3, ...）
// 开关 4 ：反转编号为 j = 3k + 1 的灯的状态，其中 k = 0, 1, 2, ...（即 1, 4, 7, 10, ...）

public class Main0672 {
    public static void main(String[] args) {
//        System.out.println(new Main0672().flipLights(3, 3));
    }

    public int flipLights(int n, int presses) {
        Set<Integer> ansSet = new HashSet<>();
        func(ansSet, n, presses);
        return ansSet.size();
    }

    private void func(Set<Integer> ansSet, int n, int presses) {
        if (presses == 0) {
            ansSet.add(n);
            return;
        }
        for (int i = 1; i <= 4; i++) {
            int temp;
            if (i == 1) {
                temp = func1(n);
            } else if (i == 2) {
                temp = func2(n);
            } else if (i == 3) {
                temp = func3(n);
            } else {
                temp = func4(n);
            }
            func(ansSet, temp, presses - 1);
        }
    }

    private int func1(int n) {
        return ~n;
    }

    private int func2(int n) {
        return 0;
    }

    private int func3(int n) {
        return 0;
    }

    private int func4(int n) {
        return 0;
    }
}
