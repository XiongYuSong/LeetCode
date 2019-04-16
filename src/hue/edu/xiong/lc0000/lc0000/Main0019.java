package hue.edu.xiong.lc0000.lc0000;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/16
 */
public class Main0019 {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = new ListNode(0);
        node1.next = head;
        head = node1;
        ListNode node2 = node1;
        //因为保证n一定有效
        for (int i = 0; i < n; i++) {
            node1 = node1.next;
        }
        while (node1.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node2.next = node2.next.next;
        return head.next;
    }
}
