class Solution {

    private int helper(int[][] grid , int i , int j, int[][] dp) {
        if(i >= grid.length || j >= grid[0].length) return Integer.MAX_VALUE;
        
        if(i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];

        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int sum = Math.min(helper(grid, i + 1, j, dp), helper(grid, i, j + 1, dp));
        dp[i][j] = sum + grid[i][j];
        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int [] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return helper(grid, 0, 0, dp);
    }
}