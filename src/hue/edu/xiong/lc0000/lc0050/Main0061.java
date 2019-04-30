package hue.edu.xiong.lc0000.lc0050;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/30
 */
public class Main0061 {

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {//
            return head;
        }
        ListNode currNode = head;
        int count = 1;
        while (currNode.next != null) {
            count++;
            currNode = currNode.next;
        }
        ListNode oldNode = currNode;//尾部节点
        k = k % count;//如果超过节点数，就取模
        if (k == 0) {
            return head;
        } else {
            currNode = head;
            while ((count - k) > 1) {
                currNode = currNode.next;
                k++;
            }
            ListNode newNode = currNode;//新的尾结点
            ListNode newHead = currNode.next;//新的头结点
            newNode.next = null;
            oldNode.next = head;
            return newHead;
        }
    }
}
