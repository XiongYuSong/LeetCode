package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Xiong YuSong
 * @date 2020/12/22
 */
public class Main0103 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        System.out.println(new Main0103().zigzagLevelOrder(root));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        int count = 1;
        while (count > 0) {
            int currCount = 0;
            List<Integer> currAns = new ArrayList<>();
            boolean flag = ans.size() % 2 == 0;
            while (count > 0) {
                count--;
                TreeNode node = flag ? list.removeFirst() : list.removeLast();
                currAns.add(node.val);
                if (flag){
                    if (node.left != null) {
                        currCount++;
                        list.addLast(node.left);
                    }
                    if (node.right != null) {
                        currCount++;
                        list.addLast(node.right);
                    }
                } else {
                    if (node.right != null) {
                        currCount++;
                        list.addFirst(node.right);
                    }
                    if (node.left != null) {
                        currCount++;
                        list.addFirst(node.left);
                    }
                }
            }
            count = currCount;
            ans.add(currAns);
        }
        return ans;
    }
}
