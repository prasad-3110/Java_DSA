package integers;

import java.util.Scanner;

public class PositiveNegativeZero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        positiveNegativeZeroCheck(N);
        sc.close();
    }
    private static void positiveNegativeZeroCheck(int N){
        System.out.print(N>0 ? "Positive": N<0 ? "Negative" : "Zero");
    }
}


/*
 * Problem Statement:
 * Given an integer N, determine whether the number is Positive, Negative, or Zero.
 *
 * Approach:
 * 1. If N is greater than 0, the number is Positive.
 * 2. If N is less than 0, the number is Negative.
 * 3. If neither condition is true, the number must be Zero.
 *
 * Key Concept:
 * Nested ternary operator can be used to represent multiple conditions.
 */
