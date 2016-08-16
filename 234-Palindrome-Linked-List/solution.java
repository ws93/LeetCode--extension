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
        List<Integer> list = new ArrayList<>();
        ListNode it = head;
        while (it != null) {
            list.add(it.val);
            it = it.next;
        }
        return palin(list);
    }
    
    private boolean palin(List<Integer> list) {
        for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }
        return true;
    }
}