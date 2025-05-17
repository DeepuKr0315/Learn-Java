// https://leetcode.com/problems/uncrossed-lines/description/?envType=study-plan-v2&envId=dynamic-programming
// 1035. Uncrossed lines

package Dynamic_Programming;
import java.util.*;
public class Uncrossed_lines_1035 {
    static int[] nums1 = {2,5,1,2,5};
    static int[] nums2 = {10,5,2,1,5,2};
    private static int helper(int idx1, int idx2){
        Map<String, Integer> dp = new HashMap<>();
        if(idx1 == nums1.length || idx2 == nums2.length){
            return 0;
        }
        String key = idx1 + "," + idx2;
        if(dp.containsKey(key)){
            return dp.get(key);
        }else{
            if(nums1[idx1] == nums2[idx2]){
                dp.put(key, 1 + helper(idx1 + 1, idx2 + 1));
            }else{
                dp.put(key, Math.max(helper(idx1 + 1, idx2), helper(idx1, idx2 + 1)));
            }
        }
        return dp.get(key);
    }
    public static int memoization(int[] nums1, int[] nums2){
        return helper(0, 0);
    }

    public static int tabulation(int[] nums1, int[] nums2){
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int[] ints : dp) {
            Arrays.fill(ints, 0);
        }
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }else{
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[nums1.length][nums2.length];
    }

    public static int space_opt_approach(int[] nums1, int[] nums2){
        int[] prev = new int[nums2.length + 1];
        Arrays.fill(prev, 0);
        for (int k : nums1) {
            int[] dp = new int[nums2.length + 1];
            Arrays.fill(dp, 0);
            for (int j = 0; j < nums2.length; j++) {
                if (k == nums2[j]) {
                    dp[j + 1] = 1 + dp[j];
                } else {
                    dp[j + 1] = Math.max(dp[j], prev[j + 1]);
                }
            }
            prev = dp;
        }
        return prev[nums2.length];
    }

    public static void main(String[] args) {
        System.out.println("Array 1: " + Arrays.toString(nums1));
        System.out.println("Array 2: " + Arrays.toString(nums2));
        System.out.println("Memoization Approach: " + memoization(nums1, nums2));
        System.out.println("Tabulation Approach: " + tabulation(nums1, nums2));
        System.out.println("Space Optimization Approach: " + space_opt_approach(nums1, nums2));
    }
}
