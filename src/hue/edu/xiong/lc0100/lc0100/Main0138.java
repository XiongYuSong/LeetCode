package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.Node;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/3
 */
public class Main0138 {
    public static void main(String[] args) {
        Node node1 = new Node(1, null, null);
        Node node2 = new Node(2, null, null);
        node1.next = node2;
        node1.random = node2;
        node2.random = node2;
        copyRandomList(node1);
    }

    public static Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node currNode = head;
        //第一步，复制一个完全相同的节点放到每个节点的后面
        while (currNode != null) {
            Node node = new Node(currNode.val, null, null);
            node.next = currNode.next;
            currNode.next = node;
            currNode = currNode.next.next;
        }
        //第二步，将随机random复制到指定位置
        currNode = head;
        while (currNode != null) {
            if (currNode.random != null) {
                //这里很巧妙，复制节点的random(currNode.next.random)是当前节点的random节点的复制节点(currNode.random.next)
                currNode.next.random = currNode.random.next;
            }
            currNode = currNode.next.next;
        }
        //第三步，分离链表，原来链表不要了
        Node newHead = head.next;

        Node currNewNode = newHead;
        currNode = head;

        while (currNewNode.next != null) {
            currNode.next = currNode.next.next;
            currNode = currNode.next;
            currNewNode.next = currNewNode.next.next;
            currNewNode = currNewNode.next;
        }
        currNode.next = null;

        return newHead;
    }
}
