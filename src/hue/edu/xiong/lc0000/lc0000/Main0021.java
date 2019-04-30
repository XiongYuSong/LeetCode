package hue.edu.xiong.lc0000.lc0000;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/30
 */
public class Main0021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);
        ListNode currNode = listNode;
        while (l1 != null && l2 != null) {
            if (l2.val > l1.val) {
                currNode.next = l1;
                l1 = l1.next;
                currNode = currNode.next;
            } else {
                currNode.next = l2;
                l2 = l2.next;
                currNode = currNode.next;
            }
        }
        while (l1 != null) {
            currNode.next = l1;
            l1 = l1.next;
            currNode = currNode.next;
        }
        while (l2 != null) {
            currNode.next = l2;
            l2 = l2.next;
            currNode = currNode.next;
        }

        return listNode.next;
    }
}
