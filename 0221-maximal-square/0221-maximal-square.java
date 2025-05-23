class Solution {
    public int maximalSquare(char[][] a) {
      if (a == null || a.length == 0 || a[0].length == 0)
        return 0;

      int max = 0, n = a.length, m = a[0].length;
    
     
      int[][] dp = new int[n + 1][m + 1];
    
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
          if (a[i - 1][j - 1] == '1') {
            dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
            max = Math.max(max, dp[i][j]);
          }
        }
      }
    
      return max * max;
    }
}