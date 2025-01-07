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
    private int helper(TreeNode root, TreeNode grandParent, TreeNode parent) {
        if(root == null) return 0;
        int sum = 0;
        if(grandParent != null && grandParent.val % 2 == 0)  {
            sum = sum + root.val;
        }
        grandParent = parent;
        parent = root;
        sum += helper(root.left, grandParent, parent);
        sum += helper(root.right, grandParent, parent);

        return sum;
    }
    public int sumEvenGrandparent(TreeNode root) {
        return helper(root, null,null);
    }
}