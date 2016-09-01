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
    class returnType {
        int singlePath;
        int maxPath;
        public returnType(int singlePath, int maxPath) {
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }
    public int maxPathSum(TreeNode root) {
        return helper(root).maxPath;
    }

    private returnType helper(TreeNode root) {
        if (root == null) {
            return new returnType(0, Integer.MIN_VALUE);
        }
        returnType left = helper(root.left);
        returnType right = helper(root.right);
        int singlePath = Math.max(Math.max(left.singlePath, right.singlePath) + root.val, 0);
        int maxPath = Math.max(left.maxPath, right.maxPath);
        maxPath = Math.max(maxPath, left.singlePath + right.singlePath + root.val);
        return new returnType(singlePath, maxPath);
    }
}