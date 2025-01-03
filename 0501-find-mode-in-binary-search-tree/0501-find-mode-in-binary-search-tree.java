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
    private void helper(TreeNode root, Map<Integer,Integer> res) {
        if(root == null) return;
        res.put(root.val, res.getOrDefault(root.val, 0) + 1);
        helper(root.left,res);
        helper(root.right,res);
    } 
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> res = new HashMap<>();
        helper(root,res);
        int maxFrequency = 0;
        for (int freq : res.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }        
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }        
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        
        return result;
    }
}