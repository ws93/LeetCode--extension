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
    int post;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post = postorder.length - 1;
        if (inorder == null || postorder == null) {
            return null;
        }
        return helper(inorder, postorder, 0, inorder.length - 1);
    }
    
    private TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if(post < 0 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[post--]);
        int inMid = 0;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == root.val) {
                inMid = i;
                break;
            }
        }
        
        root.right = helper(inorder, postorder, inMid + 1, inEnd);
        root.left = helper(inorder, postorder, inStart, inMid - 1);
        return root;
    }
}