package hue.edu.xiong.lc0200.lc0200;

import hue.edu.xiong.ListNode;

import java.util.LinkedList;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/19
 */
public class Main0206 {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = reverseList(head.next);
        //当前链表的下一节点的下一节点赋值为当前节点
        //当前链表的下一节点是，翻转链表的最后一个节点
        head.next.next = head;
        //设置为null，不然死循环
        head.next = null;
        return p;
    }
}
