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
    private int computeDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(computeDepth(root.left), computeDepth(root.right));
    }

    private int helper(TreeNode root, int level, int depth) {
        if(root == null) return 0;
        int sum = 0;
        if(level == depth) sum += root.val;
        sum += helper(root.left, level + 1, depth);
        sum += helper(root.right, level + 1, depth);

        return sum;
    }
    public int deepestLeavesSum(TreeNode root) {
        int depth = computeDepth(root);
        return helper(root, 1, depth);
    }
}