package patterns;

import java.util.Scanner;

public class Pattern03RightAlignedTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // // Single-loop approach:
//        for (int row = 1; row <= N; row++){
//            for (int col = 1; col <=N; col++){
//                System.out.print(col <= N-row ? " " : "*");
//            }
//            System.out.println();
//        }

        // Conventional approach:
        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= N-row; spaces++){
                System.out.print(" ");
            }
            for (int stars = 1; stars <= row; stars++){
                // for (int stars = N-row+1; stars <=N; stars++)
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
* Given an integer N, print a right-aligned triangle of * where the number of stars increases by one in each row.

Example:
Input: 5

Output:
    *
   **
  ***
 ****
*****

Constraints:
1 <= N <= 100
* */


/*
Approach:
- Outer loop → rows (1 to N)
- Spaces = N - row
- Stars = row
*/