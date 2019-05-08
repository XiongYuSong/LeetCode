package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/8
 */
public class Main0145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        fun(ans,root);
        return ans;
    }
    private void fun(List<Integer> ans,TreeNode root){
        if(root == null){
            return;
        }
        fun(ans,root.left);
        fun(ans,root.right);
        ans.add(root.val);
    }


    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     if(root != null){
    //         LinkedList<TreeNode> stack = new LinkedList<>();
    //         stack.push(root);
    //         while(!stack.isEmpty()){
    //             TreeNode currNode = stack.peek();
    //             if(currNode.left == null && currNode.right == null){
    //                 ans.add(currNode.val);
    //                 stack.pop();
    //                 continue;
    //             }
    //             if(currNode.right != null){
    //                 stack.push(currNode.right);
    //                 currNode.right = null;
    //             }
    //             if(currNode.left != null){
    //                 stack.push(currNode.left);
    //                 currNode.left = null;
    //             }
    //         }
    //     }
    //     return ans;
    // }
}
