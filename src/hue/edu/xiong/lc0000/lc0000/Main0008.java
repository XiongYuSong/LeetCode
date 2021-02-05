package hue.edu.xiong.lc0000.lc0000;

import com.sun.deploy.util.StringUtils;

/**
 * @author Xiong YuSong
 * @date 2020/07/21
 */
public class Main0008 {
    public static void main(String[] args) {
        System.out.println(new Main0008().myAtoi("0-1"));
    }

    public int myAtoi(String str) {
        int ans = 0;
        int flag = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+' || c == '-') {
                if (i != 0 || flag != 0) {
                    break;
                } else {
                    if (ans != 0) {
                        break;
                    } else {
                        flag = c == '+' ? 1 : -1;
                        continue;
                    }
                }
            }
            if (c < '0' || c > '9') {
                break;
            }
            if (ans > (Integer.MAX_VALUE - (c - '0')) / 10) {
                return flag != -1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + (c - '0');
        }
        return flag != -1 ? ans : ans * -1;
    }
}
