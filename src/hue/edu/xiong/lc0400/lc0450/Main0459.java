package hue.edu.xiong.lc0400.lc0450;

/**
 * @author Xiong YuSong
 * @date 2020/08/24
 */
public class Main0459 {
    public boolean repeatedSubstringPattern(String s) {
        String newStr = (s + s).substring(1,2*s.length()-2);
        return newStr.contains(s);
    }
}
