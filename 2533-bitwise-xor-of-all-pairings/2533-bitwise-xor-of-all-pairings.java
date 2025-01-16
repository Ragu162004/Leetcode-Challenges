class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x1 = 0, x2 = 0;
        if(nums1.length % 2 != 0) {
            for(int num : nums2) {
                x1 ^= num;
            }
        }
        if(nums2.length % 2 != 0) {
            for(int num : nums1) {
                x2 ^= num;
            }
        }
        return x1 ^ x2;
    }
}