class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        for(int e : machines) {
            sum += e;
        }
        if(sum % machines.length != 0) {
            return -1;
        }

        int k = sum / machines.length;
        int s = 0;
        int x = 0;
        int max = Integer.MIN_VALUE;

        for(int v : machines) {
            x = v - k;
            s = x + s;
            max = Math.max(Math.max(max,Math.abs(s)), x);
        }

        return max;
    }
}