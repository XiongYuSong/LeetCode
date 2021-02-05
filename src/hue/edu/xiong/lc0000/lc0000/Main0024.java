package hue.edu.xiong.lc0000.lc0000;

import hue.edu.xiong.ListNode;

/**
 * @author Xiong YuSong
 * @date 2020/07/30
 */
public class Main0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode currNode = head;
        ListNode nextNode = head.next;
        currNode.next = swapPairs(nextNode.next);
        nextNode.next = currNode;
        return nextNode;
    }
}
