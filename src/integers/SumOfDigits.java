package integers;

import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("Sum of digits of N is: " + sumOfDigits(A));
        sc.close();
    }

    private static int sumOfDigits(int A) {
        int sum = 0;
        while (A != 0){
            sum += A % 10;
            A /= 10;
        }
        return sum;
    }

}



/*
 * Problem Statement:
 * Given an integer A, find the sum of all its digits.
 *
 * Approach:
 * Extract the last digit using A % 10 and add it to sum.
 * Remove the last digit using integer division A / 10.
 * Repeat until A becomes 0.
 *
 * Key Concept:
 * A % 10 extracts the last digit.
 * A / 10 removes the last digit.
 */
