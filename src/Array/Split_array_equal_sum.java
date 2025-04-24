// problem link = https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1

package Array;
import java.util.*;
public class Split_array_equal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start entering elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(canSplit(arr));
    }
    public static boolean canSplit(int[] arr){
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            leftSum = leftSum + arr[i];
        }
        int rightSum = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            rightSum = rightSum + arr[i];
            leftSum = leftSum - arr[i];
            if(rightSum == leftSum){
                return true;
            }
        }
        return false;
    }
}
