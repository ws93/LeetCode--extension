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
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(root);
        while (!q1.isEmpty() || !q2.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = q1.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = q1.poll();
                list.add(tmp.val);
                if (tmp.left != null) {
                    q2.offer(tmp.left);
                }
                if (tmp.right != null) {
                    q2.offer(tmp.right);
                }                
            }
            res.add(list);
            Queue q = q1;
            q1 = q2;
            q2 = q;
        }
        return res;
    }
}