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
    int max_w = 0;
    private int max(TreeNode root) {
        if(root == null) return 0;
        int lp = max(root.left);
        int rp = max(root.right);
        max_w = Math.max(max_w,lp + rp);
        return 1 + Math.max(lp,rp);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        max(root);
        return max_w;
    }
}