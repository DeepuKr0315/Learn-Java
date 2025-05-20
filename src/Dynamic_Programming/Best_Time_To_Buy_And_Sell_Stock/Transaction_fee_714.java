package Dynamic_Programming.Best_Time_To_Buy_And_Sell_Stock;

import java.util.*;

public class Transaction_fee_714 {
    static Map<String, Integer> dp = new HashMap<>();
    public static int maxProfit(int[] prices, int fee, int idx, boolean buying){
        if(idx >= prices.length) return 0;
        String key = idx + "," + buying;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int cooldown = maxProfit(prices, fee, idx + 1, buying);
        if(buying){
            int buy = maxProfit(prices, fee, idx + 1, false) - prices[idx];
            dp.put(key, Math.max(cooldown, buy));
        }else{
            int sell = maxProfit(prices, fee, idx + 1, true) + prices[idx] - fee;
            dp.put(key, Math.max(cooldown, sell));
        }
        return dp.get(key);
    }
    public static void main(String[] args){
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        System.out.println(maxProfit(prices, fee, 0, true));
    }
}
