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
    private int helper(TreeNode root, int low, int high) {
        if(root == null) 
            return 0;
        if(root.val >= low && root.val <= high) 
            return root.val + helper(root.left, low, high) + helper(root.right, low, high);
        else if(root.val < low)
            return helper(root.right, low, high);
        else 
            return helper(root.left, low, high); 
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root, low, high);
    }
}