package Binary_Search;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for finding square root or nuber smaller then square root: ");
        int num = sc.nextInt();
        int ans = binary_search(num);
        System.out.println("< Sqrt or Sqrt is:" + ans);
    }

    static int binary_search(int n){
        int start = 0;
        int end = n;
        while(start <= end){
            int mid = (start + end) / 2;
            if ((long)mid * mid == n){
                return mid;
            }else if((long)mid * mid > n){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
