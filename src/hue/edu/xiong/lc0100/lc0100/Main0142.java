package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/4
 */
public class Main0142 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node1 = head;
        ListNode node2 = head;
        while (true) {
            if (!(node1 != null && node2 != null && node2.next != null)) {
                return null;
            }
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2) {
                break;
            }
        }
        //因为判断这个条件(node1 != null && node2 != null &&node2.next != null)所以出来必定有环
        node1 = head;
        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
