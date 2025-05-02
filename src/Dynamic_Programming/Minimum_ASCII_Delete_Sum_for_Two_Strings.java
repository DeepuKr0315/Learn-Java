// Problem link = https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/
// 712. Minimum ASCII Delete Sum for Two Strings

package Dynamic_Programming;
public class Minimum_ASCII_Delete_Sum_for_Two_Strings {
    public static int minimumDeleteSum(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for(int i = m - 1; i >= 0; i--){
            dp[i][n] = dp[i + 1][n] + (int) s1.charAt(i);
        }
        for(int j = n - 1; j >= 0; j--){
            dp[m][j] = dp[m][j + 1] + (int) s2.charAt(j);
        }
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = dp[i + 1][j + 1];
                }else{
                    dp[i][j] = Math.min((int) s1.charAt(i) + dp[i + 1][j], (int) s2.charAt(j) + dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        String s1 = "delete";
        String s2 = "leet";
        System.out.println(minimumDeleteSum(s1, s2));
    }
}
