/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    private void helper(List<List<Node>> result, Node root, int level) {
        if(root == null) return;
        if(level >= result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root);
        helper(result,root.left, level+1);
        helper(result,root.right, level+1);
    }
    public Node connect(Node root) {
        if(root == null) return root;
        List<List<Node>> result = new ArrayList<>();
        helper(result,root,0);
        for(int i = 0; i < result.size(); i++) {
            for(int j = 0; j < result.get(i).size(); j++) {
                if(j == result.get(i).size() - 1) result.get(i).get(j).next = null;
                else result.get(i).get(j).next = result.get(i).get(j + 1);
            }
        }
        return root;
    }
}