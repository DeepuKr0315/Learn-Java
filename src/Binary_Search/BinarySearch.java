package Binary_Search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start entering elements in array.");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search in array: ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);
        if(index != -1){
            System.out.println("Target found at index: " + index);
        }else{
            System.out.println("Target not found in the array");
        }
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}