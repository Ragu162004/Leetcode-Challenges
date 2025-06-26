class Solution {

    private int helper(int[] nums, int target, int[] dp) {
        if(target == 0) return 1;
        if(target < 0) return 0;

        if(dp[target] != -1) return dp[target];

        int res = 0;
        for(int num : nums) {
                res += helper(nums, target - num, dp);
        }
        dp[target] = res;
        return res;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);

        return helper(nums, target, dp);
    }
}