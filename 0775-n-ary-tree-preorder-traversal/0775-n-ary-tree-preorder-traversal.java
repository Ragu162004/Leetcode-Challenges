/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private void helper(Node root,List<Integer> ls) {
        if(root == null) return;
        ls.add(root.val);
        for(Node child : root.children) {
            helper(child,ls);
        }
    }    
    public List<Integer> preorder(Node root) {
        List<Integer> ls = new ArrayList<>(); 
        helper(root,ls);
        return ls;
    }
}