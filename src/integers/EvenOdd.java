package integers;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        evenOddCheck(N);
        sc.close();
    }
    private static void evenOddCheck(int N){
        System.out.print(N%2 == 0 ? "Even" : "Odd");
    }
}

/*
 * Problem Statement:
 * Given an integer N, determine whether the number is Even or Odd.
 *
 * Approach:
 * Check whether N % 2 is 0.
 * If the remainder is 0, the number is Even; otherwise, it is Odd.
 *
 * Key Concept:
 * Modulus (%) gives the remainder after division.
 * Ternary operator can be used for the two possible outcomes.
 */
