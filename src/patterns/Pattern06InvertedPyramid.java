package patterns;

import java.util.Scanner;

public class Pattern06InvertedPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++){
            for (int space = 1; space <= row - 1; space++){
                System.out.print(" ");
            }
            for (int star1 = 1; star1 <= N-row+1; star1++){
                System.out.print("*");
            }
            for (int star2 = 1; star2 <= N-row; star2++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Problem Statement:

Given an integer N, print an inverted centered pyramid of *.

Example:
Input: 5

Output:
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
- Outer loop → rows (1 to N)
- Spaces = row - 1
- First stars = N - row + 1
- Second stars = N - row
*/