package integers;

import java.util.Scanner;

public class CountEvenDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Even digits: " + countEvenDigits(N));
        sc.close();;
    }

    private static int countEvenDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n != 0){
            count += (n%10)%2 == 0 ? 1 : 0;
            n /= 10;
        }
        return count;
    }
}


/*
 * Problem Statement:
 * Given an integer N, count how many of its digits are even.
 *
 * Approach:
 * Extract each digit using N % 10.
 * Check whether the extracted digit is divisible by 2.
 * Increment the count if the digit is even.
 * Remove the last digit using N / 10 and repeat.
 *
 * Edge Case:
 * If N is 0, it contains one even digit.
 *
 * Key Concept:
 * count += condition ? 1 : 0;
 * can be used to conditionally increment a counter.
 */