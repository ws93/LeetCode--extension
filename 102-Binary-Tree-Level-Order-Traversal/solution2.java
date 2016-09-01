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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode node = new TreeNode(-1);
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            q.offer(node);
            while (q.peek() != node) {
                TreeNode tmp = q.poll();
                list.add(tmp.val);
                if (tmp.left != null) {
                    q.offer(tmp.left);
                }
                if (tmp.right != null) {
                    q.offer(tmp.right);
                }
            }
            q.poll();
            res.add(list);
        }
        return res;
    }
}