package hue.edu.xiong.lc0000.lc0000;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/13
 */
public class Main0022 {
    public static void main(String[] args) {
        generateParenthesis(1);
        generateParenthesis(2);
        generateParenthesis(3);
        generateParenthesis(4);
        generateParenthesis(5);
        generateParenthesis(6);
        generateParenthesis(7);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis(list, "", n, n);
//        System.out.println(n + "组括号：" + list.size());
        return list;
    }

    /**
     * @param list
     * @param str      当前的字符串
     * @param leftNum  左括号数目
     * @param rightNum 右括号数目，左括号数目大于等于0为合理
     */
    public static void generateParenthesis(List<String> list, String str, int leftNum, int rightNum) {
        if (rightNum == 0 && leftNum == 0) {
            if (leftNum == rightNum) {
                list.add(str);
//                System.out.println(str);
            }
            return;
        }
        if (rightNum > 0 && leftNum < rightNum) {
            generateParenthesis(list, str + ")", leftNum, rightNum - 1);
        }
        if (leftNum > 0) {
            generateParenthesis(list, str + "(", leftNum - 1, rightNum);
        }
    }
}
