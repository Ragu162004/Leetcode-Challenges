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
    private void helper(List<List<Integer>> result, TreeNode root, int level) {
        if(root == null) return;
        if(level >= result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);
        helper(result,root.left, level+1);
        helper(result,root.right, level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result,root,0);
        return result;
    }
}