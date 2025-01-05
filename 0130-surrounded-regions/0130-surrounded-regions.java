class Solution {
    public void helper(char[][] board, int n, int m, int i, int j) {
        if( i < 0 || j < 0 || i >= n || j >= m || board[i][j] != 'O') return;
        board[i][j] = 'M';
        helper(board, n, m, i + 1, j);
        helper(board, n, m, i - 1, j);
        helper(board, n, m, i, j + 1);
        helper(board, n, m, i, j - 1);
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++) {
            helper(board, n, m, i, 0);
            helper(board, n, m, i, m - 1);
        }
        for(int i = 0; i < m; i++) {
            helper(board, n, m, 0, i);
            helper(board, n, m, n - 1, i);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 'M') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }
}