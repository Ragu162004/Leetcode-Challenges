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
    private void dfs(TreeNode root, int hd, int level, TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map) {
        if (root == null) return;

        map.putIfAbsent(hd, new TreeMap<>());
        map.get(hd).putIfAbsent(level, new ArrayList<>());
        map.get(hd).get(level).add(root.val);
        
        dfs(root.left, hd - 1, level + 1, map);  
        dfs(root.right, hd + 1, level + 1, map); 
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();
        dfs(root, 0, 0, map);
        List<List<Integer>> result = new ArrayList<>();
        
        for (TreeMap<Integer, ArrayList<Integer>> levelMap : map.values()) {
            List<Integer> vertical = new ArrayList<>();
            for (ArrayList<Integer> nodes : levelMap.values()) {
                Collections.sort(nodes); 
                vertical.addAll(nodes);
            }
            result.add(vertical);
        }
        return result;
    }
} 