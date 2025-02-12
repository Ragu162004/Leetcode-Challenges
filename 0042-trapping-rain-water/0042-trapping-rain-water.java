class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int left = height[l], right = height[r];
        int res = 0 ;
        while(l < r) {
            if(left < right) {
                l++;
                left = Math.max(left,height[l]);
                res += left - height[l];
            }else {
                r--;
                right = Math.max(right, height[r]);
                res += right - height[r];
            }
        }
        return res;
    }
}