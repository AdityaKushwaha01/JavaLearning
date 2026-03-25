package NewLearningsJava;
public class MagicSquareMatrix {
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        // Check if square matrix
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                return false;
            }
        }
        int magicSum = 0;
        // Calculate sum of first row
        for (int j = 0; j < n; j++) {
            magicSum += matrix[0][j];
        }
        // Check rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }
        // Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }
        // Check main diagonal
        int diag1 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
        }
        // Check secondary diagonal
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag2 += matrix[i][n - 1 - i];
        }
        if (diag1 != magicSum || diag2 != magicSum) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        if (isMagicSquare(matrix)) {
            System.out.println("Magic Square");
        } else {
            System.out.println("Not a Magic Square");
        }
    }
}