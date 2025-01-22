class Solution {
    
    private int helper(List<List<Integer>> triangle, int i ,int j, int[][] dp) {
        if(i == triangle.size()) {
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int val = Math.min(helper(triangle,i + 1, j, dp), helper(triangle, i + 1, j + 1, dp));
        dp[i][j] = triangle.get(i).get(j) + val;
        return dp[i][j];
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int [][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for(int [] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(triangle,0 ,0, dp);
    }
}