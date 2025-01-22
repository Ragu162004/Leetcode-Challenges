class Solution {
    private int helper(int i, int j, String s, int[][] dp) {
        if(i > j || i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) != s.charAt(j)) {
            return dp[i][j] = 1 + Math.min(helper(i + 1, j, s, dp) , helper(i, j - 1, s, dp));
        }
        else {
            return dp[i][j] = helper(i + 1, j - 1, s, dp);
        }

    }

    public int minInsertions(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] row : dp) {
            Arrays.fill(row,-1);
        }
        return helper(0, s.length() - 1, s, dp);
    }
}