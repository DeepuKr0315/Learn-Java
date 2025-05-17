// Count subarrays with all elements greater than K
// https://www.geeksforgeeks.org/count-subarrays-with-all-elements-greater-than-k/
package Array;

public class Subarray_element_greater_then_k {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 2, 10, 11};
        int k = 5;
        int start = 0;
        int count = 0;
        for(int end = 0; end < arr.length; end++){
            if(arr[end] <= k){
                start = end + 1;
                continue;
            }
            count += end - start + 1;
        }
        System.out.println(count);
    }
}
