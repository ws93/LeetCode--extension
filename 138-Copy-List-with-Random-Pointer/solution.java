/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	if(head == null) {
    		return null;
    	}
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode it = head;
        // copy next and store relation in map
        while(it != null) {
        	map.put(it, new RandomListNode(it.label));
        	it = it.next;
        }
        // copy random 
        it = head;
        while(it != null) {
            map.get(it).next = map.get(it.next);
            map.get(it).random = map.get(it.random);
        	it = it.next;
        }
        return map.get(head);
    }

}