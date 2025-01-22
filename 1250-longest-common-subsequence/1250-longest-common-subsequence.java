class Solution {

    private int helper(int i, int j, String text1, String text2, int[][] dp) {
        if(i >= text1.length() || j >= text2.length()) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];

        if(text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + helper(i + 1, j + 1, text1, text2, dp);
        }else {
            return dp[i][j] = Math.max(helper(i + 1, j, text1, text2, dp), helper(i, j + 1, text1, text2, dp));
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int [] row : dp) {
            Arrays.fill(row,-1);
        }
        return helper(0,0,text1,text2,dp);

    }
}