/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (ListNode list : lists) {
            ListNode tmp = list;
            while (tmp != null) {
                pq.add(tmp.val);
                tmp = tmp.next;
            }
        }
        ListNode res = null;
        if (lists == null || lists.length == 0) {
            return res;
        } 
        res = new ListNode(0); 
        ListNode node = res;
        while (!pq.isEmpty()) {
            node.next = new ListNode(pq.poll());
            node = node.next;
        }
        return res.next;
    }
}