class Solution {

    private int helper(int i, int j, int[][] dp, int[][] grid) {
        if(i >= grid.length || j >= grid[0].length || grid[i][j] == 1) {
            return 0;
        }

        if(i == grid.length - 1 && j == grid[0].length - 1) return 1;

        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        dp[i][j] = helper(i + 1, j ,dp, grid) + helper(i, j + 1, dp, grid);

        return dp[i][j];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int [] row : dp) {
            Arrays.fill(row,-1);
        }
        return helper(0, 0, dp, obstacleGrid);
    }
}