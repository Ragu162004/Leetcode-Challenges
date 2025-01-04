class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()) {
            List<Integer> ls = new ArrayList<>();
            int size = q.size();
            while(size != 0) {
                TreeNode curr = q.poll();
                ls.add(curr.val);
                if(curr.right != null) q.offer(curr.right);
                if(curr.left != null) q.offer(curr.left);
                size--;
            }
            if(flag) {
                Collections.reverse(ls);
            }
            flag = !flag;
            result.add(ls);
        }
        return result;
    }
}