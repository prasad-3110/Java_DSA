package patterns;

import java.util.Scanner;

public class Pattern07Diamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Upper-pyramid
        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= N-row; spaces++){
                System.out.print(" ");
            }
            for (int stars1 = 1; stars1 <= row; stars1++){
                System.out.print("*");
            }
            for (int stars2 = 1; stars2 <= row-1; stars2++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower inverted-pyramid
        for (int row = 1; row <= N-1; row++){
            for (int spaces = 1; spaces <= row; spaces++){
                System.out.print(" ");
            }
            for (int stars1 = 1; stars1 <= N-row; stars1++){
                System.out.print("*");
            }
            for (int stars2 = 1; stars2 <= N-row-1; stars2++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Problem Statement:

Given an integer N, print a centered diamond pattern of *.
The diamond should contain N rows in the upper half and N - 1 rows
in the lower half.

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
- First stars = row
- Second stars = row - 1

Lower half (row = 1 to N - 1):
- Spaces = row
- First stars = N - row
- Second stars = N - row - 1
*/