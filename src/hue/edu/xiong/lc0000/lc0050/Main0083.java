package hue.edu.xiong.lc0000.lc0050;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/16
 */
public class Main0083 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node1;
        node1.next = node2;
        ListNode listNode = deleteDuplicates(head);
        System.out.println();
    }

    // 递归解法
    // public ListNode deleteDuplicates(ListNode head) {
    //     if(head == null){
    //         return null;
    //     }
    //     //清除当前节点后面节点的所有相同的值
    //     while(head.next != null){
    //         if(head.val != head.next.val){
    //             break;
    //         }
    //         head.next = head.next.next;
    //     }
    //     //这时当前节点和下一个节点肯定不一样
    //     head.next = deleteDuplicates(head.next);
    //     return head;
    // }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode currNode = head;
        while (currNode.next != null) {
            if (currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }
}
