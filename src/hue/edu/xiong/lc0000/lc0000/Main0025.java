package hue.edu.xiong.lc0000.lc0000;

import hue.edu.xiong.ListNode;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Main0025 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode listNode = new Main0025().reverseKGroup(node1, 2);
        System.out.println();
    }

    public static LinkedList<ListNode> stack = new LinkedList<>();
//    [1,2,3,4,5]

//    [3,2,5,4,1]
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode topNode = new ListNode(0);
        topNode.next = head;
        int count = 0;

        ListNode currHeadNode = topNode;
        while (currHeadNode.next != null) {
            ListNode currNode = currHeadNode;
            while (count < k) {
                if (currNode.next == null) {
                    return topNode.next;
                }
                currNode = currNode.next;
                count++;
            }
            ListNode lastHeadNode = currHeadNode.next;
            reverseNodeList(currHeadNode, currNode);
            currHeadNode = lastHeadNode;
            count = 0;
        }
        return topNode.next;
    }

    // 头结点是第一个节点
    public void reverseNodeList(ListNode headNode, ListNode lastNode) {
        ListNode lastHeadNode = lastNode.next;
        lastNode.next = null;

        ListNode firstNode = headNode.next;
        while (firstNode != null) {
            stack.push(firstNode);
            firstNode = firstNode.next;
        }
        while (!stack.isEmpty()) {
            ListNode pop = stack.pop();
            headNode.next = pop;
            headNode = headNode.next;
        }
        headNode.next = lastHeadNode;
    }
}
