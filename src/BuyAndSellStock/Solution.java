package BuyAndSellStock;

public class Solution {

    public static void main(String[] args) {
        int[] prices = {1,2,4,2,5,7,2,4,9,0,9};
        int answer = maxProfit(prices);
        System.out.println(answer);
    }
    public static int maxProfit(int[] prices) {
        int footer = 0;
        int header = 1;
        int max_profit = 0;
        while (header < prices.length) {
            if (prices[footer] < prices[header]) {
                max_profit = Math.max(max_profit,prices[header] - prices[footer]);
            } else {
                footer = header;
            }
            header++;
        }
        return max_profit;
    }
}
