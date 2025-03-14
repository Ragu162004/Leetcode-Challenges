class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int profit = 0;
        int n = prices.length;
        for(int i = 1; i < n; i++) {
            if(prices[i] < bought) {
                bought = prices[i];
            }
            else if(prices[i] - bought > profit) {
                profit = prices[i] - bought;
            } 
        }
        return profit;
    }
}