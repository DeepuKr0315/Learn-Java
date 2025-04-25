// problem link = https://www.geeksforgeeks.org/check-if-subarray-with-given-product-exists-in-an-array/

package Array;
public class Product_exist {
    public static void main(String[] args) {
        int[] arr = {1, 2, -5, -4}; // Input array
        int product = -10; // Target product value

        // Check if there is a subarray with the given product and print the result
        System.out.println((hasSubarrayWithProduct(arr, product)));
    }
    public static boolean hasSubarrayWithProduct(int[] arr, int k){
        int n = arr.length;
        for(int start = 0; start < n; start++){
            int product = 1;
            for(int end = start; end < n; end++){
                product = product * arr[end];
                if(product == k){
                    return true;
                }
            }
        }
        return false;
    }
}
