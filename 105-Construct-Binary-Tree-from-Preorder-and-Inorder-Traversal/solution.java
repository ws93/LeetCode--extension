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
    int pre = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) {
            return null;
        }
        return helper(preorder, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if(pre >= preorder.length || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pre++]);
        int inMid = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                inMid = i;
                break;
            }
        }
        root.left = helper(preorder, inorder, inStart, inMid - 1);
        root.right = helper(preorder, inorder, inMid + 1, inEnd);
        return root;
    }
}