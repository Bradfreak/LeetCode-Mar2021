//Best Time to Buy and Sell Stock with Transaction Fee
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0, hold = -prices[0];
        for(int i = 0; i < prices.length; i++){
            cash = Math.max(cash, hold+prices[i]-fee);
            hold = Math.max(hold, cash-prices[i]);
        }
        return cash;
    }
}
