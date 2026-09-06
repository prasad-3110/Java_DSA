package patterns;

import java.util.Scanner;

public class Pattern09HollowRightAlignedTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= N-row; spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                if (row == 1 || row == N) {
                    System.out.print("*");
                } else if (col == 1 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Problem Statement:

Given an integer N, print a hollow right-aligned triangle of *.

The triangle should have N rows. The first row should contain one *,
and the last row should contain N * characters. The inside of the
triangle should be hollow.

Example:
Input: 5

Output:
    *
   **
  * *
 *  *
*****

Constraints:
1 <= N <= 100
*/

/*
Approach:
- Outer loop → rows (1 to N)
- Leading spaces = N - row
- Inner loop → columns (1 to row)
- Print * for the boundary:
  row == 1 || row == N || col == 1 || col == row
- Otherwise print a space
*/