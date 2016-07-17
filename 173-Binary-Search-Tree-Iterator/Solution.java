/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private List<Integer> inorder = new ArrayList<>();
    private int count = 0;
    private void inorderTra(TreeNode root) {
        if(root == null) {
            return;
        }
        inorderTra(root.left);
        inorder.add(root.val);
        inorderTra(root.right);
    }
    public BSTIterator(TreeNode root) {
        inorderTra(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(inorder == null) return false;
        return count < inorder.size();
    }

    /** @return the next smallest number */
    public int next() {
        
        return inorder.get(count++);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */