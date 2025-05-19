package Dynamic_Programming.Best_Time_To_Buy_And_Sell_Stock;

import java.util.Arrays;

public class Type_III_123 {
    public static int maxProfit(int[] prices){
        int first_buy = Integer.MAX_VALUE;
        int first_sell = 0;
        int second_buy = Integer.MAX_VALUE;
        int second_sell = 0;
        for(int price : prices){
            first_buy = Math.min(first_buy, price);
            first_sell = Math.max(price - first_buy, first_sell);
            second_buy = Math.min(second_buy, price - first_sell);
            second_sell = Math.max(second_sell, price - second_buy);
        }
        return second_sell;
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println("Max profit: " + maxProfit(prices));
    }
}
