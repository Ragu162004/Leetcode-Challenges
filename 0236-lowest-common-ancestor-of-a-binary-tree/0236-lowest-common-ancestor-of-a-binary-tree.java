/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    private boolean exists(TreeNode root, TreeNode node) {
        if(root == node) return true;
        if(root == null) return false;
        return exists(root.left, node) || exists(root.right, node);
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }

        boolean lc = exists(root.left, p);
        boolean rc = exists(root.left, q);


        if(lc && rc) {
            return lowestCommonAncestor(root.left, p, q);
        } else if(!lc && !rc) {
            return lowestCommonAncestor(root.right, p, q);
        } 

        return root;
    }
}