package hue.edu.xiong.lc0100.lc0100;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/5/3
 */
public class Main0147 {


//     public ListNode insertionSortList(ListNode head) {
//         if(head == null){
//             return head;
//         }
//         //新链表头结点
//         ListNode newHead = new ListNode(-1);
//         newHead.next = head;
//         head = head.next;//头结点移动到下一位
//         newHead.next.next = null;
//         while(head != null){
//             ListNode currNode = head;//获取当前头结点
//             head = head.next;//头结点移动到下一位
//             currNode.next = null;
//             //插入这个节点到新链表中
//             insert(newHead,currNode);
//         }
//         return newHead.next;
//     }

//     private void insert(ListNode head,ListNode node){//插入node节点到链表中
//         ListNode currNode = head;
//         while(true){
//             if(currNode.next == null){//当前节点是最大值
//                 currNode.next = node;
//                 return;
//             }
//             if(currNode.next.val < node.val){
//                 currNode = currNode.next;
//             }else{
//                 node.next = currNode.next;
//                 currNode.next = node;
//                 return;
//             }
//         }
//     }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode l1 = insertionSortList(head);
        ListNode l2 = insertionSortList(slow);
        return merge(l1, l2);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return l1 == null ? l2 : l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
