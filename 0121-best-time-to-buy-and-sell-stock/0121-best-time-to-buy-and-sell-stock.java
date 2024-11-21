class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for(int i = 1 ; i < prices.length ; i++)
        {
            if(prices[i] < minPrice)
                minPrice = prices[i];
            else if(prices[i] - minPrice > profit)
                profit = prices[i] - minPrice;
        }
        return profit;
    }
}