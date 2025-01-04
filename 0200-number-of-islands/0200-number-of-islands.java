class Solution {
    private void travelHelper(char[][] grid, int i ,int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        travelHelper(grid, i - 1, j);
        travelHelper(grid, i + 1, j);
        travelHelper(grid, i, j - 1);
        travelHelper(grid, i, j + 1);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    travelHelper(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}