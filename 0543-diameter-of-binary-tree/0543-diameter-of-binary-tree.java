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
    private int getHeight(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }
    private int max(TreeNode root) {
        if(root == null) return 0;
        int lp = getHeight(root.left);
        int rp = getHeight(root.right);
        int lw = max(root.left);
        int rw = max(root.right);
        return Math.max((lp + rp), Math.max(lw,rw));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        return max(root);
    }
}