package patterns;

import java.util.Scanner;

public class Pattern01IncreasingTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int row = 1; row <= N; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Approach:
- Outer loop → rows (1 to N)
- Inner loop → print stars equal to row number
- Stars in each row = row
*/
