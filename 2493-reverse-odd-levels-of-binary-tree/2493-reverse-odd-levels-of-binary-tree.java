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
    private void helper(TreeNode left, TreeNode right,int level) {
        if(left == null || right == null) return;

        if(level % 2 != 0) {
            int val = left.val;
            left.val = right.val;
            right.val = val;
        }

        helper(left.left,right.right,level + 1);
        helper(left.right,right.left,level + 1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return root;
        helper(root.left,root.right,1);
        return root;
    }
}