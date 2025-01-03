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
    List<Integer> ls; 
    private void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        helper(root.right);
        ls.add(root.val);
    }    
    public List<Integer> postorderTraversal(TreeNode root) {
        ls = new ArrayList<>();
        helper(root);
        return ls;
    }
}