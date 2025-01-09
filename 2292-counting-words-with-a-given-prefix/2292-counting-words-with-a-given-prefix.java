class Solution {

    class TrieNode {
        TrieNode[] child;
        int count;
        TrieNode(){
            child = new TrieNode[26];
            count = 0;
        }
    }

    private void insert(String s, TrieNode root) {
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new TrieNode();
            }
            curr = curr.child[idx];
            curr.count++;
        }
    }

    private int helper(String s, TrieNode root) {
        TrieNode curr = root;
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (curr.child[idx] == null) {
                return 0; 
            }
            curr = curr.child[idx];
        }
        return curr.count;
    }

    public int prefixCount(String[] words, String pref) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            insert(word, root);
        }
        return helper(pref, root);
    }
}
