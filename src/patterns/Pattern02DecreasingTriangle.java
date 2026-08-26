package patterns;

import java.util.Scanner;

public class Pattern02DecreasingTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row=1; row <= N; row++){
            for (int col = 1; col <= N-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Problem:
Given an integer N, print a right-angled triangle of * where the
number of stars decreases by one in each row.

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
*/

/*
Approach:
- Outer loop → rows (1 to N)
- Inner loop → print decreasing stars
- Stars in each row = N - row + 1
*/