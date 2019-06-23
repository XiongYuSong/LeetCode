package hue.edu.xiong.lc0300.lc0300;

/**
 * @Author Xiong YuSong
 * @Date 2019/6/22
 */
public class Main0345 {
    public String reverseVowels(String s) {
        int l = 0, r = s.length() - 1;
        char[] arr = s.toCharArray();
        while (l < r) {
            while (l < r && !check(arr[l])) l++;
            while (l < r && !check(arr[r])) r--;
            if (l < r) {
                char ch = arr[r];
                arr[r] = arr[l];
                arr[l] = ch;
                l++;
                r--;
            }
        }
        return new String(arr);
    }

    public boolean check(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
}
