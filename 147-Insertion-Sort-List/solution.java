/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(-1);
        while (head != null) {
            ListNode start = node;
            while(start != null && start.next != null && start.next.val < head.val) {
                start = start.next;
            }
            ListNode tmp = head.next;
            head.next = start.next;
            start.next = head;
            head = tmp;
        }
        return node.next;
    }
}