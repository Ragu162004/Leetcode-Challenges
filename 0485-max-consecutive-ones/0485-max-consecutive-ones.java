class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res_count = 0, idx = -1;
        for(int i = 0;i < nums.length; i++) {
            if(nums[i] == 1) {
                if(idx == -1) {
                    idx = i;
                }
            } else {
                if(idx != -1) {
                    res_count = Math.max(res_count, i - idx);
                    idx = -1;
                }
            }
        }
        if(idx != -1) res_count = Math.max(res_count, nums.length - idx);
        return res_count;
    }
}