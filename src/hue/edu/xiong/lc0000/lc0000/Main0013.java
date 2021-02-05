package hue.edu.xiong.lc0000.lc0000;

/**
 * @author Xiong YuSong
 * @date 2020/07/18
 */
public class Main0013 {
    public static void main(String[] args) {
        System.out.println(new Main0013().romanToInt("IV"));
    }

    public int romanToInt(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        switch (chars[0]) {
            case 'M':
                ans += 1000;
                break;
            case 'D':
                ans += 500;
                break;
            case 'C':
                ans += 100;
                break;
            case 'L':
                ans += 50;
                break;
            case 'X':
                ans += 10;
                break;
            case 'V':
                ans += 5;
                break;
            case 'I':
                ans += 1;
                break;
        }
        for (int i = 1; i < chars.length; i++) {
            switch (chars[i]) {
                case 'M':
                    ans += chars[i - 1] == 'C' ? 800 : 1000;
                    break;
                case 'D':
                    ans += chars[i - 1] == 'C' ? 300 : 500;
                    break;
                case 'C':
                    ans += chars[i - 1] == 'X' ? 80 : 100;
                    break;
                case 'L':
                    ans += chars[i - 1] == 'X' ? 30 : 50;
                    break;
                case 'X':
                    ans += chars[i - 1] == 'I' ? 8 : 10;
                    break;
                case 'V':
                    ans += chars[i - 1] == 'I' ? 3 : 5;
                    break;
                case 'I':
                    ans += 1;
                    break;
            }

        }

        return ans;
    }
}
