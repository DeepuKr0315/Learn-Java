// Find All Occurrences of Subarray in Array
// https://www.geeksforgeeks.org/check-whether-an-array-is-subarray-of-another-array/
package Array;
import java.util.*;
public class Occurances_of_Subarray_in_array {

    // LPS = Longest Prefix which is also a Suffix.
    static void createLPS(int[] pat, int[] lps){
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < pat.length){
            if(pat[i] == pat[len]){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    static List<Integer> search(int[] arr1, int[] arr2){
        int n = arr1.length, m = arr2.length;
        List<Integer> res = new ArrayList<>();

        if (m == 0 || m > n) return res;  // edge case

        int[] lps = new int[m];
        createLPS(arr2, lps);

        int i = 0, j = 0;
        while (i < n) {
            if (arr1[i] == arr2[j]) {
                i++; j++;
                if (j == m) {
                    res.add(i - j);
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 0, 3, 0, 3, 0};
        int[] b = {3, 0, 3, 0};

        List<Integer> res = search(a, b);
            for (int idx : res)
                System.out.print(idx + " ");
    }
}
