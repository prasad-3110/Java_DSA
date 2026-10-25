package two_dimensional_arrays;

import java.util.Scanner;

public class SumOfSecondaryDiagonal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        for (int row = 0; row < N; row++){
            for (int col = 0; col < N; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.println("The sum of secondary diagonal is:" + sumOfSecondaryDiagonal(matrix));
    }

    private static int sumOfSecondaryDiagonal(int[][] matrix){
        int sum = 0;

        for (int row = 0; row < matrix.length; row++){
            int secondaryDiagonalElementPosition = matrix[row].length-1 - row;
            sum += matrix[row][secondaryDiagonalElementPosition];
        }
        return sum;
    }
}


/*
 * Approach Notes:
 *
 * Idea:
 * The secondary diagonal runs from the top-right corner
 * to the bottom-left corner.
 *
 * Steps:
 * 1. Initialize sum = 0.
 * 2. Traverse each row using a single loop.
 * 3. Calculate the column index as matrix[row].length - 1 - row.
 * 4. Add the corresponding element to sum.
 * 5. Return the final sum.
 *
 * Remember:
 * - Main diagonal: matrix[i][i]
 * - Secondary diagonal: matrix[i][N - 1 - i]
 * - For a square matrix, each row has the same length N.
 *
 * Time Complexity: O(N)
 * Auxiliary Space: O(1)
 */