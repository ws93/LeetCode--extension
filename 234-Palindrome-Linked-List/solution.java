/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode mid = findMid(head);
        ListNode rightHalf = reverseList(mid.next);
        mid.next = null;
        ListNode it1 = head;
        ListNode it2 = rightHalf;
        while (it2 != null) {
            if (it1.val != it2.val) {
                return false;
            }
            it1 = it1.next;
            it2 = it2.next;
        }
        return true;
    }
    
    private ListNode findMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curt = head;
        while (curt != null) {
            ListNode tmp = curt.next;
            curt.next = prev;
            prev = curt;
            curt = tmp;
        }
        return prev;
    }
    
}