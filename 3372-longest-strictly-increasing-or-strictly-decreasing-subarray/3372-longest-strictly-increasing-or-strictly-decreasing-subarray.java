class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;
        int inc = 1;
        int dec = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 1;i < nums.length; i++) {
            if(nums[i - 1] < nums[i]) {
                inc++;
                dec = 1;
            }else if(nums[i - 1] > nums[i]) {
                dec++;
                inc = 1;
            }else  {
                inc = 1;
                dec = 1;
            }
            max = inc > dec ? inc > max ? inc : max : dec > max ? dec : max;
        }
        return max;
    }
}