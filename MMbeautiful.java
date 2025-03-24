import java.util.*;

public class MMbeautiful {

    public static int MinOperation(int[][] mat) {
        int n = mat.length;        
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }
        int operation = 0;
        for (int i = 0; i < n; i++) {
            operation += (maxSum - rowSum[i]);
        }

        return operation;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        int result = MinOperation(mat);
        System.out.println("Minimum operations needed: " + result);
    }
}