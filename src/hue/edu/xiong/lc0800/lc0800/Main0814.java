package hue.edu.xiong.lc0800.lc0800;

import hue.edu.xiong.TreeNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/13
 */
public class Main0814 {
    public static void main(String[] args) {

    }

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val != 1) {
            return null;
        }
        return root;
    }
}
