/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode first = result;
        while(l1 != null && l2 != null){
            result.val = l1.val + l2.val + carry;
            if(result.val >= 10){
                result.val -= 10;
                carry = 1;
            }else{
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            if(l1 != null || l2 != null){
                result.next = new ListNode(0);
                result = result.next;                
            }

        }
        if(l1 == null){ // l1 is empty
            while(l2 != null){
                result.val = l2.val + carry;
                if(result.val >= 10){
                    result.val -= 10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                l2 = l2.next;
                if(l2 != null){
                    result.next = new ListNode(0);
                    result = result.next;                    
                }

            }
            
        }else{ // l2 is empty
            while(l1 != null){
                result.val = l1.val + carry;
                if(result.val >= 10){
                    result.val -= 10;
                    carry = 1;                    
                }else{
                    carry = 0;
                }
                l1 = l1.next;
                if(l1 != null){
                    result.next = new ListNode(0);
                    result = result.next;                    
                }

            }
        }
        if(carry == 1){
            result.next = new ListNode(1);
            result = result.next;
        }
        result.next = null;
        return first;
    }
}
