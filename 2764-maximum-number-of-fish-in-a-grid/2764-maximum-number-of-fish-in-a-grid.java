class Solution {

    private int helper(int[][] grid, int x,int y) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) return 0;
        int curr = grid[x][y];
        grid[x][y] = 0;
        curr += helper(grid, x - 1, y);
        curr += helper(grid, x + 1, y);
        curr += helper(grid, x, y - 1);
        curr += helper(grid, x, y + 1);

        return curr;
    }
    public int findMaxFish(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0) {
                    max = Math.max(max, helper(grid, i, j));
                }
            }
        }
        return max;
    }
}