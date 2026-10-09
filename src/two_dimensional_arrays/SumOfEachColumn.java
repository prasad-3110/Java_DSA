package two_dimensional_arrays;

import java.util.Scanner;

public class SumOfEachColumn {
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

        sumOfEachColumn(matrix);
    }

    private static void sumOfEachColumn(int[][] matrix){
        for (int col = 0; col < matrix[0].length; col++){
            int columnSum = 0;
            for (int row = 0; row < matrix.length; row ++){
                columnSum += matrix[row][col];
            }
            System.out.println(columnSum);
        }
    }
}


/*
* Problem: Sum of Each Column in a Matrix
Problem Statement
Given a 2D integer array matrix, calculate and print the sum of elements in each column.
Input Format
- The first line contains two integers R and C, representing the number of rows and columns.
- The next R lines contain C space-separated integers representing the matrix elements.
Output Format
Print the sum of each column on a separate line, from the first column to the last.
Constraints
- \(1 \le R,C \le 100\)
- \(-10^4 \le matrix[i][j] \le 10^4\)
Example
Input:
3 4
1 2 3 4
5 6 7 8
9 10 11 12


Output:
15
18
21
24


Explanation
- Column 0: \(1 + 5 + 9 = 15\)
- Column 1: \(2 + 6 + 10 = 18\)
- Column 2: \(3 + 7 + 11 = 21\)
- Column 3: \(4 + 8 + 12 = 24\)
*
* */


/*
Approach Notes:

Idea:
Traverse the matrix column by column and calculate each column's sum.

Steps:
1. Use the outer loop to select each column.
2. Initialize columnSum = 0 for the selected column.
3. Use the inner loop to traverse every row in that column.
4. Add matrix[row][col] to columnSum.
5. Print columnSum after traversing the entire column.

Remember:
- Outer loop selects the column.
- Inner loop traverses the rows.
- matrix[row][col] accesses the current element.
- Reset columnSum for every new column.

Time Complexity: O(R * C)
Auxiliary Space: O(1)
*/