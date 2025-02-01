class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 1; i < nums.length; ++i) {
            if(((nums[i - 1] & 1) ^ (nums[i] & 1)) == 0) {
                return false;
            }
        }

        return true;
    }
}