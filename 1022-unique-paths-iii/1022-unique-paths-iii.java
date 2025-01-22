class Solution {

    private int helper(int i , int j, int[][] grid, int zeros) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1) return 0;

        if(grid[i][j] == 2) {
            return zeros == 0 ? 1 : 0;
        }
        grid[i][j] = -1;

        int sum = helper(i - 1, j, grid, zeros - 1) + helper(i + 1, j, grid, zeros - 1) + helper(i , j - 1, grid, zeros - 1) + helper(i, j + 1, grid, zeros - 1);
        grid[i][j] = 0;
        return sum;
    }

    public int uniquePathsIII(int[][] grid) {
        int x = -1;
        int y = -1;
        int zeros = 1;
        for(int i = 0 ;i < grid.length; i++) {
            for(int j = 0 ; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    x = i;
                    y = j;
                }else if(grid[i][j] == 0) {
                    zeros++;
                }
            }
        }
        return helper(x, y, grid, zeros);
    }
}