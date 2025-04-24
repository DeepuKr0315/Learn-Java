
// Problem link - https://www.geeksforgeeks.org/sort-an-array-where-a-subarray-of-a-sorted-array-is-in-reverse-order/
// Sort an array where a subarray of a sorted array is in reverse order

package Array;
import java.util.*;
public class Sort_reversed_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start entering elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array: " + Arrays.toString(printSorted(arr)));
    }

    static int[] printSorted(int[] arr){
        int front = -1;
        int back = -1;
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1]){
                front = i - 1;
                break;
            }
        }
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > arr[i + 1]){
                back = i + 1;
                break;
            }
        }
        if(front == -1 && back == -1){
            return arr;
        }
        while(front <= back){
            int temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;
            front++;
            back--;
        }
        return arr;
    }
}
