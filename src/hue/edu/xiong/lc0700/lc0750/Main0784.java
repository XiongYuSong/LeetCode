package hue.edu.xiong.lc0700.lc0750;

import java.util.ArrayList;
import java.util.List;

public class Main0784 {
    public List<String> letterCasePermutation(String s) {
        List<String> answer = new ArrayList<>();
        char[] chars = s.toCharArray();
        func(answer, chars, 0, chars.length, "");
        return answer;
    }

    private void func(List<String> answer, char[] chars, int i, int k, String str) {
        if (i == k) {
            answer.add(str);
            return;
        }
        char aChar = chars[i];
        func(answer, chars, i + 1, k, str + aChar);
        if (aChar >= 65 && aChar <= 90) {
            aChar += 32;
            func(answer, chars, i + 1, k, str + aChar);
        } else if (aChar >= 97 && aChar <= 122) {
            aChar -= 32;
            func(answer, chars, i + 1, k, str + aChar);
        }
    }
}
