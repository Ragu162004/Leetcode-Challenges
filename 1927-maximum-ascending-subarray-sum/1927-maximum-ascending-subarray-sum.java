class Solution {
    public int maxAscendingSum(int[] nums) {
        int max_sum = 0;
        int curr = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                curr += nums[i];
            }else {
                max_sum = max_sum > curr ? max_sum : curr;
                curr = nums[i];
            }
        }
        return max_sum > curr ? max_sum : curr;
    }
}