/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res = new LinkedList<Integer>();
        helper(root, 0);
        return res;
    }
    
    private void helper (TreeNode root, int curtDepth) {
        if(root == null) {
            return;
        }
        if(curtDepth == res.size()) {
            res.add(root.val);
        }
        helper(root.right, curtDepth + 1);
        helper(root.left, curtDepth + 1);
    }
}