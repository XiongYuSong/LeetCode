package hue.edu.xiong.lc0700.lc0700;

import com.sun.org.apache.bcel.internal.generic.IAND;

import java.util.LinkedList;

public class Main0739 {
    // 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，
    // 其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。
    // 如果气温在这之后都不会升高，请在该位置用 0 来代替。
    public int[] dailyTemperatures(int[] temperatures) {
        // 用一个栈存一下以及对应的下标
        int[] ans = new int[temperatures.length];
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(temperatures.length - 1);
        ans[temperatures.length - 1] = 0;
        // 73,74,75,71,69,72,76,73
        for (int i = temperatures.length - 2; i >= 0; i--) {
            Integer j = stack.peek();
            while (temperatures[i] >= temperatures[j]) {
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                j = stack.peek();
            }
            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = j - i;
            }
            stack.push(i);
        }
        return ans;
    }
}
