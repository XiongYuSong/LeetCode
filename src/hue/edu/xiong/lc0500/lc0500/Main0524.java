package hue.edu.xiong.lc0500.lc0500;

import java.util.*;

/**
 * @Author Xiong YuSong
 * @Date 2019/6/23
 */
public class Main0524 {
    public String findLongestWord(String s, List<String> d) {
        String ans = "";
        for (String str : d) {
            if(str.length() <ans.length())
                continue;
            if(str.length() == ans.length() && str.compareTo(ans) > 0)
                continue;
            if(isfindLongestWord(s,str)) ans=str;
        }
        return ans;
    }
    public boolean isfindLongestWord(String s, String str) {//判断当前字符串是否满足题意
        int start = -1;
        for (char c : str.toCharArray()) {
            int index;
            if ((index = s.indexOf(c, start + 1)) == -1)
                return false;
            start = index;
        }
        return true;
    }
}
