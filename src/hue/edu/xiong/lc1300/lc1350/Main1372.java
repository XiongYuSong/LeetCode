package hue.edu.xiong.lc1300.lc1350;

import hue.edu.xiong.TreeNode;

/**
 * @author Xiong YuSong
 * @date 2020/12/08
 */
public class Main1372 {
    int ans = 0;

    public int longestZigZag(TreeNode root) {
        fun(root, false, 0);
        return ans;
    }

    private void fun(TreeNode root, boolean isLeft, int num) {
        if (root == null) {
            ans = Math.max(ans, num);
            return;
        }
        fun(root.left, false, isLeft ? num + 1 : 0);
        fun(root.right, true, isLeft ? 0 : num + 1);
    }
}
