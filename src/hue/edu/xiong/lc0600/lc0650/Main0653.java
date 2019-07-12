package hue.edu.xiong.lc0600.lc0650;

import hue.edu.xiong.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/11
 */
public class Main0653 {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        fun(list,root);
        int left = 0;
        int right = list.size()-1;
        while(left < right){
            if(list.get(left) + list.get(right) == k){
                return true;
            } else if(list.get(left) + list.get(right) > k){
                right--;
            }else {
                left++;
            }
        }
        return false;
    }
    private void fun(List<Integer> list,TreeNode root){
        if(root == null) return;
        fun(list,root.left);
        list.add(root.val);
        fun(list,root.right);
    }
}
