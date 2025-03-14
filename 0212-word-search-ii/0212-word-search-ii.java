class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    private void insertWord(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.word = word; 
    }

    private void helper(char [][] board, int i, int j, TrieNode root, Set<String> result) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] == '*') return;
        char c = board[i][j];
        if (root.children[c - 'a'] == null) return;

        root = root.children[c - 'a'];
        if (root.word != null) {
            result.add(root.word); 
        }
        board[i][j] = '*';
        
        helper(board, i - 1, j, root, result);
        helper(board, i + 1, j, root, result);
        helper(board, i, j - 1, root, result);
        helper(board, i, j + 1, root, result);

        board[i][j] = c;
    }
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            insertWord(root, word);
        }
        Set<String> result = new HashSet<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0;j < board[i].length; j++) {
                helper(board, i, j, root,result);
            }
        }
        return new ArrayList<>(result);
    }
}
