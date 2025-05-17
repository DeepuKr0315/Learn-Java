//https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/?envType=study-plan-v2&envId=dynamic-programming

package Dynamic_Programming;

import java.util.Arrays;

public class Make_str_palindrome {
    public static int longestPalindromicSubseq(String s){
        int[][] dp = new int[s.length()][s.length()];
        for(int[] row : dp){
            Arrays.fill(row, 0);
        }
        for(int l = 1; l < s.length(); l++){
            for(int i = 0; i < s.length() - l + 1; i++){
                int j = i + l - 1;
                if(i == j){
                    dp[i][j] = 1;
                }else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int length = s.length() - longestPalindromicSubseq(s);
        System.out.println("Minimum Insertion Steps to Make a String Palindrome: " + length);
    }
}
