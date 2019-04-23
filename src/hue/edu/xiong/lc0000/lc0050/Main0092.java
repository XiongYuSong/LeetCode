package hue.edu.xiong.lc0000.lc0050;

import hue.edu.xiong.ListNode;

import java.util.LinkedList;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/19
 */
public class Main0092 {

    public static void main(String[] args) {


    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        LinkedList<ListNode> list = new LinkedList<>();
        ListNode listNode = new ListNode(0);
        listNode.next = head;

        ListNode first = head;
        ListNode second = listNode;

        for (int i = 1; i < m; i++) {
            first = first.next;
            second = second.next;
        }

        for (int i = m; i <= n; i++) {
            list.push(first);
            first = first.next;
        }
        while (!list.isEmpty()) {
            second.next = list.pop();
            second = second.next;
        }
        second.next = first;
        return listNode.next;
    }
}
