package Dynamic_Programming.Coin_Change;
import java.util.*;
public class Coin_change_322 {
    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 0; i < amount + 1; i++){
            for(int coin : coins){
                if (i - coin >= 0){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        int ans = (dp[amount] != amount + 1) ? dp[amount] : -1;
        return ans;
    }
    public static void main(String[] args){
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
