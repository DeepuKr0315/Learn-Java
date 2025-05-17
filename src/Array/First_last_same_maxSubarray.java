// Maximum length of the sub-array whose first and last elements are same
// https://www.geeksforgeeks.org/maximum-length-of-the-sub-array-whose-first-and-last-elements-are-same/

package Array;

import java.util.Arrays;

public class First_last_same_maxSubarray {
    public static void main(String[] args) {
        char[] arr = {'g', 'e', 'e', 'k', 's'};
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        for(int i = 0; i < arr.length; i++){
            int idx = arr[i] - 'a';
            if(first[idx] == -1){
                first[idx] = i;
            }
            last[idx] = i;
        }
        int maxLen = 0;
        for(int i = 0; i < 26; i++){
            if(first[i] != -1){
                maxLen = Math.max(maxLen, last[i] - first[i] + 1);
            }
        }
        System.out.println(maxLen);
    }
}
