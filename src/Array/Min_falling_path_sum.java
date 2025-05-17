package Array;

public class Min_falling_path_sum {

    public static int minFalling(int[][] matrix){
        int N = matrix.length;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < N; i++){
            for(int j = 0; j < N; j++){
                int middle = matrix[i - 1][j];
                int left = (j > 0) ? matrix[i - 1][j - 1] : Integer.MAX_VALUE ;
                int right = (j < N - 1) ? matrix[i - 1][j + 1] : Integer.MAX_VALUE;
                matrix[i][j] = matrix[i][j] + Math.min(middle, Math.min(left, right));
            }
        }
        for(int i = 0; i < N; i++){
            min = Math.min(min, matrix[N - 1][i]);
        }
        return min;
    }
    public static int helper(int[][] matrix, int row, int col){
        int result = Integer.MAX_VALUE;
        if(row == matrix.length){
            return 0;
        }
        if(col < 0 || col == matrix.length){
            return Integer.MAX_VALUE;
        }
        result = matrix[row][col] + Math.min(helper(matrix, row + 1, col - 1), Math.min(helper(matrix, row + 1, col), helper(matrix, row + 1, col + 1)));
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int N = matrix.length;
        int result = Integer.MAX_VALUE;
        for(int col = 0; col < N; col++){
            result = Math.min(result, helper(matrix, 0, col));
        }
        System.out.println(result);
        System.out.println(minFalling(matrix));
    }
}
