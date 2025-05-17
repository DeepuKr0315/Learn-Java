package Array;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
