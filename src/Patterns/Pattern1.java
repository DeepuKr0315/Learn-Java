/*

*
*  *
*  * *
*  * * *
*  * *
*  *
*

*/
package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row;
            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
