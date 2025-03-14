import java.util.*;

class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;    
        int m = matrix[0].length; 
        int[][] transposed = new int[m][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = matrix[i][j]; 
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
       
        TransposeMatrix solution = new TransposeMatrix();
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = solution.transpose(matrix);
        
        
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
