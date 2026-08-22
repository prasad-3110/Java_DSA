package integers;

import java.util.Scanner;

public class LastDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Last Digit: " + lastDigit(N));
        sc.close();
    }

    private static int lastDigit(int n) {
        return n%10;
    }
}


/*
 * Problem Statement:
 * Given an integer N, find and print its last digit.
 *
 * Approach:
 * Use the modulus operator (%) with 10 to obtain the remainder.
 * The remainder represents the last digit of the number.
 *
 * Key Concept:
 * N % 10 extracts the last digit of an integer.
 */
