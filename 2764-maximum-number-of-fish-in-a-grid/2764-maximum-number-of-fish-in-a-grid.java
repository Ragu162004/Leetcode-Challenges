class Solution {

    private int helper(int[][] grid, boolean[][] seen, int x,int y) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || seen[x][y] == true || grid[x][y] == 0) return 0;

        seen[x][y] = true;
        int curr = grid[x][y];
        curr += helper(grid, seen, x - 1, y);
        curr += helper(grid, seen, x + 1, y);
        curr += helper(grid, seen, x, y - 1);
        curr += helper(grid, seen, x, y + 1);

        return curr;
    }
    public int findMaxFish(int[][] grid) {
        int max = 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(seen[i][j] != true && grid[i][j] != 0) {
                    max = Math.max(max, helper(grid, seen, i, j));
                }
            }
        }
        return max;
    }
}