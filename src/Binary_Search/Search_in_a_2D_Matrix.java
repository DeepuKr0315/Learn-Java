
// Problem link = https://leetcode.com/problems/search-a-2d-matrix/description/
// 74. Search a 2D Matrix

package Binary_Search;

public class Search_in_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println();
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midValue = matrix[mid / 2][mid % n];
            if(target == midValue){
                return true;
            }else if(target < midValue){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
