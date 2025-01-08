class Solution {

    private static class TrieNode {
        TrieNode child[];
        boolean isEnd;
        TrieNode() {
            child = new TrieNode[26];
            isEnd = false;;
        }
    }

    private void insert(String s, TrieNode root) {
        TrieNode current = root; 
        for(char c : s.toCharArray()) {
            int idx = c - 'a';
            if(current.child[idx] == null) {
                current.child[idx] = new TrieNode();
            }
            current = current.child[idx];
        }
        current.isEnd = true;
    }

    private boolean helper(String s, int st, TrieNode root, Set<Integer> visited) {
        if(st == s.length()) return true;
        if(visited.contains(st)) return false;
        
        TrieNode curr = root;

        for(int i = st; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                break;
            }
            curr = curr.child[idx];
            if(curr.isEnd) {
                if(helper(s, i + 1, root, visited)) {
                    return true;
                }
            }
        }
        visited.add(st);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        TrieNode root = new TrieNode();
        for(String str : wordDict) {
            insert(str, root);
        }

        return helper(s, 0, root, new HashSet<>());
    }
}