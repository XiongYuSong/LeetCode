package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/3
 */
public class Main0141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode node1 = head;
        ListNode node2 = head;
        while (node1 != null && node2 != null) {
            node1 = node1.next;
            node2 = node2.next;
            if (node2 == null) {
                //没有环
                return false;
            } else {
                node2 = node2.next;
            }
            if (node1 == node2) {
                return true;
            }
        }
        return false;
    }
}
