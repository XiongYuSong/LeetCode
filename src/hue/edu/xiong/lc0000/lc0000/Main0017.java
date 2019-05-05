package hue.edu.xiong.lc0000.lc0000;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/5
 */
public class Main0017 {

    public static String[] arr = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits != null && digits.length() > 0){
            fun(list,digits,0,"");
        }
        return list;
    }
    public void fun(List<String> list,String digits,int num,String str){
        if(num == digits.length()){
            list.add(str);
            return;
        }
        for(int i = 0;i<arr[digits.charAt(num) - '0'].length();i++){
            fun(list,digits,num+1,str+arr[digits.charAt(num) - '0'].charAt(i));
        }
    }
}
