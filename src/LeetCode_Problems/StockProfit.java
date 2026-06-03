package src.LeetCode_Problems;

public class StockProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for(int i = 0; i<prices.length;i++){
            minPrice = Math.min(minPrice, prices[i]);
            if((prices[i] - minPrice) > profit){
                profit = Math.max((prices[i] - minPrice),profit);
            }
            /*
            remove if entirely, just do profit = Math.max(prices[i] - minPrice, profit)
            keep the if condition, inside just do profit = prices[i] - minPrice
            */

        }
        return profit;
    }
    public static void main(String[] args) {
        // int prices[] = {7,1,5,3,6,4};
        int prices[] = {1,2};
        System.out.println(maxProfit(prices));
    }
}
