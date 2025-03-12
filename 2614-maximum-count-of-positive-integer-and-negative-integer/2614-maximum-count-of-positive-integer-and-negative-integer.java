class Solution {
    private int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1, result = nums.length;   
        while(l <= r) {
            int mid = (l + r) / 2;
            if(nums[mid] < target) {
                l = mid + 1;
            }else {
                result = mid;
                r = mid - 1;
            }
        }

        return result;
    }
    public int maximumCount(int[] nums) {   
        return Math.max(binarySearch(nums, 0),nums.length - binarySearch(nums, 1));
    }
}