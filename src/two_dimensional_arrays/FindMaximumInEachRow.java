package two_dimensional_arrays;

import java.util.Scanner;

public class FindMaximumInEachRow {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] matrix =  new int[R][C];

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }
        findMaximumInEachRow(matrix);
    }

    private static void findMaximumInEachRow(int[][] matrix){
        for (int row = 0; row < matrix.length; row++){
            int rowMax = Integer.MIN_VALUE;
            for (int col = 0; col < matrix[row].length; col++){
                int element = matrix[row][col];
                rowMax = rowMax < element ? element : rowMax;
            }
            System.out.println(rowMax);
        }
    }
}


/*
* Problem statement
Given a 2D integer matrix, find and print the maximum element in each row.
Input format
- First line: integers R and C.
- Next R lines: C integers per line.
Output format
Print the maximum element of each row on a separate line.
Constraints
- \(1 \le R,C \le 100\)
- \(-10^4 \le matrix[i][j] \le 10^4\)
Example input
3 4
1 8 3 4
5 2 7 6
9 10 11 12


Example output
8
7
12
* */


/*
Approach Notes:

Idea:
Find the maximum element independently in each row.

Steps:
1. Traverse each row using the outer loop.
2. Initialize rowMax to Integer.MIN_VALUE.
3. Traverse every column in the current row.
4. Compare each element with rowMax and update it when larger.
5. Print rowMax after completing the row.

Remember:
- Initialize rowMax inside the outer loop.
- Integer.MIN_VALUE handles rows containing negative numbers.
- Print only after checking every element in the row.

Time Complexity: O(R * C)
Auxiliary Space: O(1)
*/