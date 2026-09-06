package patterns;

import java.util.Scanner;

public class Pattern10HollowInvertedRightAlignedTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= row-1; spaces++){
                System.out.print(" ");
            }
            for (int col = 1; col <= N-row+1; col++){
                if (row == 1){
                    System.out.print("*");
                }
                else if (col == 1 || col == N-row+1){
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

Given an integer N, print a hollow inverted right-aligned triangle of *.

The triangle should have N rows. The first row should contain N *
characters, and each subsequent row should contain one fewer position.
The inside of the triangle should be hollow.

Example:
Input: 5

Output:
*****
 *  *
  * *
   **
    *

Constraints:
1 <= N <= 100
*/


/*
Approach:

- Outer loop → rows (1 to N)
- Spaces = row - 1
- Columns/positions = N - row + 1
- First row → print *
- For remaining rows:
  - First and last position → *
  - Otherwise → space
*/