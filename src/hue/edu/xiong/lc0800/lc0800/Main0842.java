package hue.edu.xiong.lc0800.lc0800;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiong YuSong
 * @date 2020/12/08
 */
public class Main0842 {

    public static void main(String[] args) {
        System.out.println(new Main0842().splitIntoFibonacci("11235813"));
    }

    public List<Integer> splitIntoFibonacci(String s) {
        List<Integer> ans = new ArrayList<>();
        fun(ans, 0, s);
        return ans;
    }

    private boolean fun(List<Integer> list, int num, String s) {
        if (num == s.length())
            return list.size() >= 3;

        int length = list.size();
        int sum = length >= 2 ? list.get(length - 1) + list.get(length - 2) : 0;

        if (s.charAt(num) == '0') {
            if (length < 2 || sum == 0) {
                list.add(0);
                if (fun(list, num + 1, s))
                    return true;
                else
                    list.remove(length);
            }
            return false;
        }

        long currLong = 0;
        for (; num < s.length(); num++) {
            currLong = currLong * 10 + s.charAt(num) - '0';
//            long val = Long.valueOf(s.substring(num, index));
            if (currLong > Integer.MAX_VALUE)
                return false;
            int value = (int) currLong;

            if (length >= 2 && sum < value)
                return false;

            if (length < 2 || sum == value) {
                list.add(value);
                if (fun(list, num + 1, s))
                    return true;
                else
                    list.remove(length);
            }
        }
        return false;
    }

}
