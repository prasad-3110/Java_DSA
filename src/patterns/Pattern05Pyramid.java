package patterns;

import java.util.Scanner;

public class Pattern05Pyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++){
            for (int spaces = 1; spaces <= N- row; spaces++){
                System.out.print(" ");
            }
            for (int stars1 = 1; stars1 <= row; stars1++){
                System.out.print("*");
            }
            for (int stars2 =1; stars2 <= row-1; stars2++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}



/*
* Given an integer N, print a centered pyramid of * where each row
contains two more stars than the previous row.

Example:
Input: 5

Output:
    *
   ***
  *****
 *******
*********

Constraints:
1 <= N <= 100
* */

/*
Approach:
- Outer loop → rows (1 to N)
- Spaces = N - row
- First stars = row
- Second stars = row - 1
*/