package hue.edu.xiong.lc0300.lc0300;

import java.util.LinkedList;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/11
 */
public class Main0331 {

    public boolean isValidSerialization(String preorder) {
        String[] strr = preorder.split(",");
        LinkedList<String> stack = new LinkedList<>();
        int index = 0;
        stack.push(strr[index++]);
        while(!stack.isEmpty()){
            String str = stack.pop();
            if(!str.equals("#")){
                if(index >= strr.length||index+1>=strr.length){//属于越界
                    return false;
                }
                stack.push(strr[index+1]);
                stack.push(strr[index]);
                index += 2;
            }
        }
        return index==strr.length?true:false;
    }
}
