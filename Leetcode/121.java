class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mincost = prices[0];
        int maxProfit = 0;
        for (int i = 0; i<n; i++) {
            mincost = Math.min(mincost, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - mincost);
        }
        return maxProfit;
    }
}