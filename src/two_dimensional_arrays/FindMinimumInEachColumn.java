package two_dimensional_arrays;

import java.util.Scanner;

public class FindMinimumInEachColumn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] matrix = new int[R][C];

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        findMinimumEachColumn(matrix);
    }

    private static void findMinimumEachColumn(int[][] matrix){
        for (int col = 0; col < matrix[0].length; col++){
            int colMin = Integer.MAX_VALUE;
            for (int row = 0; row < matrix.length; row++){
                int element = matrix[row][col];
                colMin = colMin > element ? element : colMin;
            }
            System.out.println(colMin);
        }
    }
}

/*
* Problem statement
Given a 2D integer matrix, find and print the minimum element in each column.
Input format
- First line: two integers R and C.
- Next R lines: C space-separated integers per line.
Output format
Print the minimum element of each column on a separate line, from left to right.
Constraints
- \(1 \le R,C \le 100\)
- \(-10^4 \le matrix[i][j] \le 10^4\)
Example input
3 4
8 2 9 4
5 6 3 7
1 10 11 0


Example output
1
2
3
0
* */

/*
Approach Notes:

Idea:
Find the minimum element independently in each column.

Steps:
1. Read the matrix row by row according to the input format.
2. Traverse each column using the outer loop.
3. Initialize colMin to Integer.MAX_VALUE.
4. Traverse every row in the current column.
5. Update colMin whenever a smaller element is found.
6. Print colMin after completing the column.

Remember:
- Read input in the specified order.
- Outer loop selects columns; inner loop traverses rows.
- Initialize colMin inside the outer loop.

Time Complexity: O(R * C)
Auxiliary Space: O(1)
*/
