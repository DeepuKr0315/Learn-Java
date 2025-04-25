package Array;

public class Subarray_of_size_k_with_given_sum {

    public static boolean checkSubarraySum(int[] arr, int k, int sum){
        int len = arr.length;
        int curr_sum = 0;
        for(int i = 0; i < k; i++){
            curr_sum += arr[i];
        }
        if (curr_sum == sum){
            return true;
        }
        for(int i = k; i < len; i++){
            curr_sum = curr_sum + arr[i] - arr[i - k];
            if(curr_sum == sum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4, sum = 18;
        System.out.println(checkSubarraySum(arr, k, sum));
    }
}
