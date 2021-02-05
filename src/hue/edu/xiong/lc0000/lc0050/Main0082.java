package hue.edu.xiong.lc0000.lc0050;

import hue.edu.xiong.ListNode;

/**
 * @author Xiong YuSong
 * @date 2020/12/07
 */
public class Main0082 {
    public static void main(String[] args) {
        ListNode head0 = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        head0.next = head1;
        head1.next = head2;
        head2.next = head3;
        System.out.println(new Main0082().deleteDuplicates(head0));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode currNode = newHead;
        newHead.next = head;

        ListNode nextNode = head;
        int value;
        while (nextNode != null) {
            value = nextNode.val;
            while (nextNode.next != null && nextNode.next.val == value) {
                nextNode = nextNode.next;
            }
            if (currNode.next == nextNode) {
                currNode = nextNode;
            } else {
                currNode.next = nextNode.next;
            }
            nextNode = nextNode.next;
        }
        return newHead.next;
    }

}
