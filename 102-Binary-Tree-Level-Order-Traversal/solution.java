/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 // this is a test
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> level = new ArrayList<Integer>();
        	for (int i = 0; i < size; i++) {
        		TreeNode head = queue.poll();
        		level.add(head.val);
        		if (head.left != null) {
        			queue.offer(head.left);
        		}
        		if (head.left != null) {
        			queue.offer(head.right);
        		}        		
        	}
        	result.add(level);
        }
        return result;
    }
}
