package patterns;

import java.util.Scanner;

public class Pattern13SolidDiamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Upper pyramid
        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= N-row; spaces++){
                System.out.print(" ");
            }
            int positions = (2*row)-1;
            for (int stars = 1; stars <= positions; stars++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower pyramid
        for (int row = 1; row <= N-1; row++){
            for (int spaces = 1; spaces <= row; spaces++){
                System.out.print(" ");
            }
            int positions = (2*N)-(2*row+1);
            for (int stars = 1; stars <= positions; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Problem Statement:

Given an integer N, print a centered solid diamond pattern of *.

The diamond should have N rows in the upper half and N - 1 rows
in the lower half. Each row should be completely filled with *.

Example:
Input: 5

Output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

Constraints:
1 <= N <= 100
*/

/*
Approach:

Upper half (row = 1 to N):
- Spaces = N - row
- Positions = 2 * row - 1
- Print * for all positions

Lower half (row = 1 to N - 1):
- Spaces = row
- Positions = 2 * N - 2 * row - 1
- Print * for all positions
*/