package hue.edu.xiong.lc0700.lc0700;

import hue.edu.xiong.ListNode;

public class Main0725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode currListNode = root;
        ListNode[] list = new ListNode[k];
        int count = 0;
        while (currListNode != null) {
            count++;
            currListNode = currListNode.next;
        }
        if (k >= count) {//说明有空数据
            currListNode = root;
            for (int i = 0; i < count; i++) {
                list[i] = currListNode;
                currListNode = currListNode.next;
                list[i].next = null;
            }
            return list;
        }
        int a = count / k;
        int b = count % k;
        for (int i = 0; i < k; i++) {
            currListNode = root;
            list[i] = currListNode;
            for (int j = 0; j < a - 1; j++) {
                currListNode = currListNode.next;
            }
            if (i < b) {
                currListNode = currListNode.next;
            }
            root = currListNode.next;
            currListNode.next = null;
        }
        return list;
    }
}
