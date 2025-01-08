class Solution {
    private boolean helper(char [][] board, int i, int j, String word, int idx) {
        if(idx == word.length()) return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] != word.charAt(idx)) return false;

        char seen = board[i][j];
        board[i][j] = '.';
        
        boolean flag = helper(board, i - 1, j, word,idx + 1) || helper(board, i + 1, j, word, idx + 1) || helper(board, i, j - 1, word, idx + 1) || helper(board, i, j + 1, word, idx + 1);

        board[i][j] = seen;

        return flag;
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0;j < board[i].length; j++) {
                if(helper(board, i, j, word,0)) {
                    return true;
                }
            }
        }
        return false;
    }
}