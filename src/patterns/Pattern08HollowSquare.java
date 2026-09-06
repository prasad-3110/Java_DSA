package patterns;

import java.util.Scanner;

public class Pattern08HollowSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++){
            for (int col = 1; col <=N; col++){
                if (row == 1 || row == N) System.out.print("*");
                else if (col == 1 || col == N) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Problem Statement:

Given an integer N, print a hollow square pattern of * with N rows
and N columns. The border of the square should contain * and the
inside should contain spaces.

Example:
Input: 5

Output:
*****
*   *
*   *
*   *
*****

Constraints:
1 <= N <= 100
*/


/*
Approach:
- Outer loop → rows (1 to N)
- Inner loop → columns (1 to N)
- Print * if the position is on the boundary:
  row == 1 || row == N || col == 1 || col == N
- Otherwise print a space
*/