/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode oddIt = head, evenIt = evenHead;
        while (evenIt != null && evenIt.next != null) {
            // ListNode tmp = oddIt.next;
            oddIt.next = evenIt.next;
            oddIt = oddIt.next;
            evenIt.next = oddIt.next;
            evenIt = evenIt.next;
        }
        oddIt.next = evenHead;
        return head;
    }
}