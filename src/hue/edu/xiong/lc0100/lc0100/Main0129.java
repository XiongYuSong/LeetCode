package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.TreeNode;

/**
 * @author Xiong YuSong
 * @date 2020/10/29
 */
public class Main0129 {
    int ans;

    public int sumNumbers(TreeNode root) {
        fun(root , 0);
        return ans;
    }
    public void fun(TreeNode root , int num) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null) {
            ans += num + root.val;
            return;
        }
        fun(root.left, (num + root.val) * 10);
        fun(root.right, (num + root.val) * 10);
    }
}
