package two_dimensional_arrays;

import java.util.Scanner;

public class SumOfMainDiagonal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int row = 0; row < N; row++){
            for (int col = 0; col < N; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.println("The main diagonal sum is: "  + sumOfMainDiagonal(matrix));
    }

    private static int sumOfMainDiagonal(int[][] matrix){
        int sum = 0;
        for (int diagonalElement = 0; diagonalElement < matrix.length; diagonalElement++){
            sum += matrix[diagonalElement][diagonalElement];
        }
        return sum;
    }
}


/*
 * Problem: Sum of Main Diagonal in a Square Matrix
 *
 * Problem Statement:
 * Given an N x N square matrix of integers, calculate and return
 * the sum of its main diagonal elements.
 *
 * The main diagonal runs from the top-left corner to the
 * bottom-right corner of the matrix.
 *
 * Input Format:
 * - The first line contains an integer N, representing the size
 *   of the square matrix.
 * - The next N lines contain N space-separated integers
 *   representing the matrix elements.
 *
 * Output Format:
 * Print the sum of the main diagonal elements.
 *
 * Constraints:
 * - 1 <= N <= 100
 * - -10^4 <= matrix[i][j] <= 10^4
 *
 * Example Input:
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Example Output:
 * 15
 *
 * Explanation:
 * The main diagonal elements are 1, 5, and 9.
 * Their sum is 1 + 5 + 9 = 15.
 */


/*
 * Approach Notes:
 *
 * Idea:
 * Main diagonal elements have equal row and column indices.
 *
 * Steps:
 * 1. Initialize sum = 0.
 * 2. Iterate from index 0 to N - 1.
 * 3. Add matrix[i][i] to sum.
 * 4. Return the final sum.
 *
 * Remember:
 * - Main diagonal elements satisfy row == col.
 * - A single loop is sufficient; nested loops are unnecessary.
 *
 * Time Complexity: O(N)
 * Auxiliary Space: O(1)
 */
