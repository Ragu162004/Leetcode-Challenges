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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null || (root.left == null && root.right == null)) return true;
        q.offer(root.left);
        q.offer(root.right);
        while(!q.isEmpty()) {
            TreeNode curr1 = q.poll();
            TreeNode curr2 = q.poll();
            if(curr1 == null && curr2 == null) continue;
            if(curr1 == null || curr2 == null) return false;
            if(curr1.val != curr2.val) return false;

            q.offer(curr1.left); 
            q.offer(curr2.right); 
            q.offer(curr1.right); 
            q.offer(curr2.left); 
        }
        return true;
    }
}