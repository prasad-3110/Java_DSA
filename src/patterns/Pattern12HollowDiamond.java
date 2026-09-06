package patterns;

import java.util.Scanner;

public class Pattern12HollowDiamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= N-row; spaces++){
                System.out.print(" ");
            }
            int upperPositions = 2*row-1;
            for (int stars1 = 1; stars1 <= upperPositions; stars1++){
                System.out.print(stars1 == 1 || stars1 == upperPositions ? "*" : " ");
            }
            System.out.println();
        }

        for (int row = 1; row <= N-1; row++){
            for (int spaces = 1; spaces <= row; spaces++){
                System.out.print(" ");
            }
            int lowerPositions = (2*N)-(2*row+1);
            for (int stars2 = 1; stars2 <= lowerPositions; stars2++){
                System.out.print(stars2 == 1 || stars2 == lowerPositions ? "*" : " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Problem Statement:

Given an integer N, print a hollow centered diamond pattern of *.

The diamond should have N rows in the upper half and N - 1 rows
in the lower half. Only the boundary of the diamond should contain
* characters; the inside should be hollow.

Example:
Input: 5

Output:
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

Constraints:
1 <= N <= 100
*/

/*
Approach:

Upper half (row = 1 to N):
- Spaces = N - row
- Positions = 2 * row - 1
- First and last position → *
- Otherwise → space

Lower half (row = 1 to N - 1):
- Spaces = row
- Positions = 2 * N - 2 * row - 1
- First and last position → *
- Otherwise → space
*/