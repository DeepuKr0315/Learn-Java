// Stictly sorted matrix
package Binary_Search;

import java.util.*;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{10,20,30},{14,25,36},{27,38,49}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter element to search in array: ");
        int target = sc.nextInt();
        System.out.println("Target found at index: " + Arrays.toString(search_in_2D(arr, target)));
    }
    static int[] search_in_2D(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;
        while(row < arr.length && col >= 0){
            if (arr[row][col] == target){
                return new int[]{row, col};
            }else if (arr[row][col] > target) {
                col--;
            }else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
