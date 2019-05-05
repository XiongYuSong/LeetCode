package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.ListNode;
import hue.edu.xiong.lc0600.lc0650.Main0654;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/5
 */
public class Main0148 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        new Main0148().sortList(node1);
    }

    // 递归排序三部曲：1，快慢指针找中点；2，递归调用mergeSort，3，合并两个链表
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        // 1.找中点
        ListNode node1 = head;
        ListNode node2 = head.next;
        while(node1 != null && node2 != null && node2.next != null){
            node1 = node1.next;
            node2 = node2.next.next;
        }
        ListNode midNode = node1.next;//找到中点
        node1.next = null;//断开这个链表
        ListNode l1 = mergeSort(head);
        ListNode l2 = mergeSort(midNode);
        return merge(l1,l2);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode currNode = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val ){
                currNode.next = l1;
                l1 = l1.next;
                currNode = currNode.next;
            } else {
                currNode.next = l2;
                l2 = l2.next;
                currNode = currNode.next;
            }
        }
        if(l1 == null){//反正最后一个节点的下一节点要为空
            currNode.next = l2;
        }else{
            currNode.next = l1;
        }
        return head.next;
    }
}
