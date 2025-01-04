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
        private boolean helper(TreeNode root, int sum, int k) {
        if(root == null) return false;
        sum = sum + root.val;
        if(root.left == null && root.right == null) {
            return sum == k;
        }
        return helper(root.left,sum,k) || helper(root.right,sum,k);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);
    }
}