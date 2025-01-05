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
    private boolean helper(TreeNode curr1 , TreeNode curr2) {
        if(curr1 == null && curr2 == null) return true;
        if(curr1 == null || curr2 == null) return false;
        if(curr1.val != curr2.val) return false;
        return helper(curr1.left,curr2.right) && helper(curr1.right,curr2.left);
    }
    public boolean isSymmetric(TreeNode root) {   
        if(root == null || (root.left == null && root.right == null)) return true;  
        return helper(root.left,root.right);
    }
}