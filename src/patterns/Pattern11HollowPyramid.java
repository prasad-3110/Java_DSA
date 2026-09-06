package patterns;

import java.util.Scanner;

public class Pattern11HollowPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= N-row; spaces++){
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * row -1; stars++){
                System.out.print(row == N ? "*" : stars == 1 || stars == (2 * row - 1) ? "*" : " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Problem Statement:

Given an integer N, print a hollow centered pyramid of *.

The pyramid should have N rows. The first row should contain one *,
the last row should contain 2*N-1 stars, and the inside of the
pyramid should be hollow.

Example:
Input: 5

Output:
    *
   * *
  *   *
 *     *
*********

Constraints:
1 <= N <= 100
*/


/*
Approach 1 — Two-star sections:

- Outer loop → rows (1 to N)
- Spaces = N - row
- First star section = row positions
- Second star section = row - 1 positions
- Last row → print * in all positions
- Other rows:
  - First position of first section → *
  - Last position of second section → *
  - Otherwise → space


Approach 2 — Single position loop:

- Outer loop → rows (1 to N)
- Spaces = N - row
- Total positions = 2 * row - 1
- Last row → print * in all positions
- Other rows:
  - First and last position → *
  - Otherwise → space
*/