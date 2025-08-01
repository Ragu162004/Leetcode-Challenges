class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int profit = 0;
        int currStock = prices[0];
        for(int i = 1; i < prices.length; i++) {
            currStock = Math.min(currStock,prices[i]);
            profit = Math.max(prices[i] - currStock, profit);
        }

        return profit;
    }
}