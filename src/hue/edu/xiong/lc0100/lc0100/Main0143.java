package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/30
 */
public class Main0143 {

    //1.找到链表中间节点
    //2.倒转后面节点
    //3.合并两个链表
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode listNode = new ListNode(-1);
        listNode.next = head;
        ListNode node1 = listNode;
        ListNode node2 = listNode;
        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
            if (node2.next != null) {
                node2 = node2.next;
            }
        }
        ListNode newHead = node1.next;
        node1.next = null;
        //head和newHead为两个头结点
        //2.倒转后面链表
        newHead = reverseList(newHead);
        //3.合并两个链表
        node1 = head;
        node2 = newHead;
        while (node2 != null) {
            ListNode currNode = node2;
            node2 = node2.next;
            currNode.next = node1.next;
            node1.next = currNode;
            if (node2 != null) {
                node1 = node1.next;
                node1 = node1.next;
            }
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
