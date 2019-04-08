package hue.edu.xiong.lc0600.lc0650;

import hue.edu.xiong.TreeNode;

public class Main0654 {
    public static void main(String[] args) {
        new Main0654().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int left, int right) {
        if (right < left) {
            return null;
        }
        int index = right;
        //找出当前范围最大值的索引,没有重复元素
        for (int i = left; i < right; i++) {
            if (nums[index] < nums[i]) {
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left = constructMaximumBinaryTree(nums, left, index - 1);
        treeNode.right = constructMaximumBinaryTree(nums, index + 1, right);
        return treeNode;
    }
}
