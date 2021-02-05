package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.Node;

import java.util.LinkedList;

/**
 * @author Xiong YuSong
 * @date 2020/09/28
 */
public class Main0117 {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);

        root.left = left;
        root.right = right;

        left.left = new Node(4);
        left.right = new Node(5);

        right.right = new Node(7);

        System.out.println(new Main0117().connect(root));
    }
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        int currCount = 1;
        int nextCount = 0;
        Node preNode = null;
        while (currCount > 0) {
            Node node = list.removeFirst();

            if (node.left != null) {
                list.add(node.left);
                nextCount++;
            }
            if (node.right != null) {
                list.add(node.right);
                nextCount++;
            }

            currCount--;

            if (preNode != null) {
                preNode.next = node;
            }
            preNode = node;
            if (currCount == 0){
                currCount = nextCount;
                nextCount = 0;
                preNode = null;
            }
        }
        return root;
    }
}
