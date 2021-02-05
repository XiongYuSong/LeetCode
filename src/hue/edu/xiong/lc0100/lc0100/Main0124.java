package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.TreeNode;

/**
 * @author Xiong YuSong
 * @date 2020/08/27
 */
public class Main0124 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(3);
        System.out.println(new Main0124().maxPathSum(root));
    }

    int maxNum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        fun(root);
        return maxNum;
    }

    private int fun(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            maxNum = root.val > maxNum ? root.val : maxNum;
        }
        int left = fun(root.left);
        int right = fun(root.right);
        int num = root.val;
        if (left > 0) {
            num += left;
        }
        if (right > 0) {
            num += right;
        }
        maxNum = num > maxNum ? num : maxNum;
        if (left < 0 || right < 0){
            return num;
        }
        return left > right ? left + root.val : right + root.val;
    }
}
