package hue.edu.xiong.lc0700.lc0700;

import hue.edu.xiong.TreeNode;

/**
 * @author Xiong YuSong
 * @date 2020/09/30
 */
public class Main0701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null){
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left,val);
        } else {
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}
