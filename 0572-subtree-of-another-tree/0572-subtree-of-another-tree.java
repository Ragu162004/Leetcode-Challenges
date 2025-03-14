class Solution {
    private boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return helper(p.left, q.left) && helper(p.right, q.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (helper(root, subRoot)) return true; 
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
