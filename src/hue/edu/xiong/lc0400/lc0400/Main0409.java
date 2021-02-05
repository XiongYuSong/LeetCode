package hue.edu.xiong.lc0400.lc0400;

/**
 * //给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * //
 * // 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * //
 * // 注意:
 * //假设字符串的长度不会超过 1010。
 * //
 * // 示例 1:
 * //
 * //
 * //输入:
 * //"abccccdd"
 * //
 * //输出:
 * //7
 * //
 * //解释:
 * //我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * //
 * // Related Topics 哈希表
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiong YuSong
 * @date 2020/06/16
 */
public class Main0409 {
    public static void main(String[] args) {
        System.out.println(new Main0409().longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (arr[c] == 0) {
                arr[c] = 1;
            } else {
                arr[c] = 0;
                count++;
            }
        }
        return (count * 2 != s.length()) ? count * 2 + 1 : count * 2;
    }
}
