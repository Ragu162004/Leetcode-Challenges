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

    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        int i = 1;
        while(!q.isEmpty()) {
            int sum = 0;
            int count = q.size();
            while(count != 0) {
                TreeNode curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
                sum += curr.val;
                count--;
            }
            if(max < sum) {
                max = sum;
                level = i;
            }
            i++;
        }
        return level;
    }
}