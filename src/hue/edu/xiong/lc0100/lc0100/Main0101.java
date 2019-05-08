package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.TreeNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/8
 */
public class Main0101 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return fun(root.left,root.right);
    }
    private boolean fun(TreeNode leftNode,TreeNode rightNode){
        if(leftNode == null && rightNode == null){
            return true;
        }
        if(leftNode == null || rightNode ==null){
            return false;
        }
        if(leftNode.val == rightNode.val && fun(leftNode.right,rightNode.left) && fun(leftNode.left,rightNode.right)){
            return true;
        }
        return false;
    }
}
