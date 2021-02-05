package hue.edu.xiong.lc0000.lc0000;

/**
 * @author Xiong YuSong
 * @date 2020/08/25
 */
public class Main0028 {
    public static void main(String[] args) {
        System.out.println(new Main0028().strStr("aaa", "aaaa"));
    }

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.length() - i < needle.length()) {
                return -1;
            }
            int index = 0;
            while (haystack.charAt(i + index) == needle.charAt(index)) {
                if (index == needle.length() - 1) {
                    return i;
                }
                index++;
            }
        }
        return -1;
    }
}
