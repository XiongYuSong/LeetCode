package hue.edu.xiong.lc0200.lc0200;

import hue.edu.xiong.ListNode;

import java.util.ArrayList;
import java.util.Objects;

public class Main0234 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = arrayList.size() - 1;
        while (left < right) {
            if (!Objects.equals(arrayList.get(left), arrayList.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
