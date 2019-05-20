package hue.edu.xiong;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        Pattern p = Pattern.compile("[" + str1 + "]+"); // 正则表达式
        Matcher m = p.matcher(str2); // 操作的字符串
        boolean b = m.find(); //返回是否匹配的结果,这是部分匹配
        System.out.println(b);

        System.out.println(str1.matches("[" + str2 + "^]+") && str2.matches("[" + str1 + "^]+"));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);
        //居然改不了ubantu下面搜狗输入法的显示框的位置,emmmm,这不是坑爹吗
        Integer a = Integer.valueOf(1);//这里有问题啊啊啊,这个输入法好奇怪啊,zenmezaiyouxiajiao啊啊啊啊aaaa
    }
}
