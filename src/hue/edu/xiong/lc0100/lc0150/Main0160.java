package hue.edu.xiong.lc0100.lc0150;

import hue.edu.xiong.ListNode;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/30
 */
public class Main0160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        ListNode currNode = headA;
        while(currNode!=null){
            countA++;
            currNode = currNode.next;
        }
        currNode = headB;
        while(currNode!=null){
            countB++;
            currNode = currNode.next;
        }
        while(countA > countB){
            headA = headA.next;
            countA--;
        }
        while(countA < countB){
            headB = headB.next;
            countB--;
        }
        while(headA != headB ){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
