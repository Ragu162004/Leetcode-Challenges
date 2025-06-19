class Solution {
    public int smallestNumber(int n) {
        int res = 0;
        int i = 1;
        while(res < n) {
            res = res << 1;
            res = res | 1;
        }
        return res;
    }
}