package patterns;

import java.util.Scanner;

public class Pattern04RightAlignedDecreasingTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Single loop approach:
//        for (int row = 1; row <= N; row++){
//            for (int col =1; col <=N; col++){
//                System.out.print(col <= row-1 ? " " : "*");
//            }
//            System.out.println();
//        }

        for (int row = 1; row <= N; row++){
            for (int space = 1; space < row; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= N-row+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
* Given an integer N, print a right-aligned triangle of * where the number of stars decreases by one in each row.

Example:
Input: 5

Output:
*****
 ****
  ***
   **
    *

Constraints:
1 <= N <= 100
* */

/*
Approach:
- Outer loop → rows (1 to N)
- Spaces = row - 1
- Stars = N - row + 1
*/