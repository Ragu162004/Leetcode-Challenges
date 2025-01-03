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

    private void helper(TreeNode root, Set<Integer> values) {
        if(root == null) return;
        values.add(root.val);
        helper(root.left,values);
        helper(root.right,values);
    }
    public int kthSmallest(TreeNode root, int k) {
        Set<Integer> values = new TreeSet<>();
        helper(root,values); 
        int min = Integer.MAX_VALUE;
        for(int ele : values) {
            k--;
            if(k == 0) return ele;
        }
        return 0;
    }
}