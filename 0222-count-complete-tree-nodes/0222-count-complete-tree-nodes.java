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
    int count = 0;
    private void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        count++;
        helper(root.right);
    }
    public int countNodes(TreeNode root) {
        helper(root);
        return count;
    }
}