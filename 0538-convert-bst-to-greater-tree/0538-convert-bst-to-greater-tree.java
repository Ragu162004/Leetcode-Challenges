/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int runningSum = 0;
    private void updateVal(TreeNode root) {
        if (root == null) return;
        updateVal(root.right);
        runningSum += root.val;
        root.val = runningSum;
        updateVal(root.left);
    }

    public TreeNode convertBST(TreeNode root) {
        updateVal(root);
        return root;
    }
}
