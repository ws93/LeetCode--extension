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
        boolean balance;
        int height;

        public returnType(boolean balance, int height) {
            this.balance = balance;
            this.height = height;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return helper(root).balance;
    }

    private returnType helper(TreeNode root) {
        if (root == null) {
            return new returnType(true, 0);
        }
        returnType left = helper(root.left);
        returnType right = helper(root.right);

        if (!left.balance || !right.balance || Math.abs(left.height - right.height) > 1) {
            return new returnType(false, Math.abs(left.height - right.height) + 1);
        }
        return new returnType(true, Math.max(left.height, right.height) + 1);
    }
}