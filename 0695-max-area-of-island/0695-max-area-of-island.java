class Solution {
    private int travelHelper(int[][] grid, int i ,int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        int count = 1;
        count += travelHelper(grid, i - 1, j);
        count += travelHelper(grid, i + 1, j);
        count += travelHelper(grid, i, j - 1);
        count += travelHelper(grid, i, j + 1);
        return count;
        
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    max_area = Math.max(max_area,travelHelper(grid,i,j));
                }
            }
        }
        return max_area;
    }
}