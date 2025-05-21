package Dynamic_Programming.Best_Time_To_Buy_And_Sell_Stock;

import java.util.*;

public class Type_IV_188 {
    static Map<String, Integer> dp = new HashMap<>();
    public static int maxProfit(int[] prices, int idx, boolean buying, int cap){
        if (idx >= prices.length || cap == 0) return 0;
        String key = idx + "," + buying + "," + cap;
        if (dp.containsKey(key)){
            return dp.get(key);
        }
        int result;
        if(buying){
            result = Math.max(maxProfit(prices, idx + 1, false, cap) - prices[idx], maxProfit(prices, idx + 1, true, cap));
        }else{
            result = Math.max(maxProfit(prices, idx + 1, true, cap - 1) + prices[idx], maxProfit(prices, idx + 1, false, cap));
        }
        dp.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int k = 2;
        System.out.println(maxProfit(prices, 0, true, k));
    }
}
