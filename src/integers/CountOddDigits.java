package integers;

import java.util.Scanner;

public class CountOddDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(countOddDigits(N));
        sc.close();
    }

    private static int countOddDigits(int n) {
        int oddCount = 0;
        while (n != 0){
            oddCount += (n%10)%2 != 0 ? 1 : 0;
            n /= 10;
        }
        return oddCount;
    }
}


/*
 * Problem Statement:
 * Given an integer N, count how many of its digits are odd.
 *
 * Approach:
 * Extract each digit using N % 10.
 * Check whether the extracted digit is not divisible by 2.
 * Increment the count if the digit is odd.
 * Remove the last digit using N / 10 and repeat.
 *
 * Key Concept:
 * A digit is odd when digit % 2 != 0.
 * Ternary can be used to conditionally increment the counter.
 */
