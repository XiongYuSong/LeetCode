package hue.edu.xiong.lc0500.lc0500;

import hue.edu.xiong.TreeNode;

public class Main0530 {

    int num1 = -1;
    int ans = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        getMinimumDifference(root.left);
        if (num1 == -1) {//代表无初值
            num1 = root.val;
        } else {
            ans = (ans < (root.val - num1)) ? ans : root.val - num1;
            num1 = root.val;
        }
        getMinimumDifference(root.right);
    }
}
