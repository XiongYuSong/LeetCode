package hue.edu.xiong.lc0900.lc0900;

import hue.edu.xiong.TreeNode;

import java.util.LinkedList;

public class Main0938 {

    public static void main(String[] args) {

    }

    //递归的解法
    public int rangeSumBST(TreeNode root, int L, int R) {
        int count = 0;//先遍历
        if (root.left != null && root.val > L) {
            //如果当前节点等于L的话，都不会遍历左子树，左子树肯定小于R
            count += rangeSumBST(root.left, L, R);
        }
        count += root.val >= L && root.val <= R ? root.val : 0;
        if (root.right != null && root.val < R) {
            //如果当前节点等于R的话，都不会遍历右子树，右子树肯定大于R
            count += rangeSumBST(root.right, L, R);
        }
        return count;
    }
//    //非递归的解法
//    public int rangeSumBST(TreeNode root, int L, int R) {
//        int count = 0;//先序
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        TreeNode currTreeNode = root;
//        while (currTreeNode != null || stack.isEmpty()) {
//            // 一直找左子树
//            while (currTreeNode != null) {//左
//                stack.push(currTreeNode);
//                currTreeNode = currTreeNode.left;
//            }
//            //当左子树为空，且栈不为空,从栈弹出一个输出，并且制定当前节点为输出节点的右节点
//            if (!stack.isEmpty()) {
//                currTreeNode = stack.pop();
//                count += currTreeNode.val >= L && currTreeNode.val <= R ? currTreeNode.val : 0;
//                currTreeNode = currTreeNode.right;
//            }
//        }
//        return count;
//    }

}
