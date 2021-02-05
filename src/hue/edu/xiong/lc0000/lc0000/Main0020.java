package hue.edu.xiong.lc0000.lc0000;

import com.sun.tools.javac.util.StringUtils;

import java.util.LinkedList;

/**
 * @author Xiong YuSong
 * @date 2020/07/30
 */
public class Main0020 {
    public static void main(String[] args) {
        System.out.println(new Main0020().isValid("}{"));
    }

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        LinkedList<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                queue.push(c);
            } else {
                if (queue.isEmpty()) return false;
                if (c == ')') {
                    if (queue.pop() == '(') continue;
                } else if (c == ']') {
                    if (queue.pop() == '[') continue;
                } else {
                    if (queue.pop() == '{') continue;
                }
                return false;
            }
        }
        return queue.isEmpty();
    }
}
