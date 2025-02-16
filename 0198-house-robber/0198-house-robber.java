class Solution {
    private int helper(int i, int [] nums, int[] dp) {
        if(i < 0 || i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = Math.max(helper(i - 2, nums, dp) + nums[i], helper(i - 1, nums, dp));
    }
    public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums.length - 1, nums, dp);
    }
}