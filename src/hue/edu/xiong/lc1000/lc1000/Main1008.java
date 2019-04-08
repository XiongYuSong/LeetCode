package hue.edu.xiong.lc1000.lc1000;

import hue.edu.xiong.TreeNode;

import java.util.LinkedList;

public class Main1008 {
    public static void main(String[] args) {
        System.out.println(bstFromPreorder(new int[]{15, 13, 12, 18}));
    }

    /**
     * 没有重复的值
     *
     * @param preorder
     * @return
     */
    public static TreeNode bstFromPreorder(int[] preorder) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode currNode = null;
        stack.push(root);
        for (int index = 1; index < preorder.length; index++) {
            currNode = stack.peek();
            if (preorder[index] < currNode.val) {
                currNode.left = new TreeNode(preorder[index]);
                stack.push(currNode.left);
            } else {
                // 如果小于，出栈当前节点
                // 如果队列为空的话，表示当前节点为根节点，则当前节点赋值直接右子树赋值
                // 如果不为空，且判断当前栈顶的最后一个节点是否大于当前的准备插入二叉树的节点，是则当前节点赋值直接右子树赋值,反之出栈继续判断
                currNode = stack.pop();
                while (!stack.isEmpty() && preorder[index] > stack.peek().val) {
                    currNode = stack.pop();
                }
                currNode.right = new TreeNode(preorder[index]);
                stack.push(currNode.right);
            }
        }
        return root;
    }


}
