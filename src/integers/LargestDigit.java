package integers;

import java.util.Scanner;

public class LargestDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Largest digit: " + findLargestDigit(N));
        sc.close();
    }

    private static int findLargestDigit(int n) {
        int max = 0;
        while (n != 0){
            max = n%10 > max ? n%10 : max;
            n /= 10;
        }
        return max;
    }
}


/*
 * Problem Statement:
 * Given an integer N, find the largest digit present in the number.
 *
 * Approach:
 * Extract each digit using N % 10.
 * Compare the extracted digit with the current maximum.
 * Update the maximum when the extracted digit is greater.
 * Remove the last digit using N / 10 and repeat.
 *
 * Key Concept:
 * Since every digit is between 0 and 9, max can be initialized to 0.
 * Ternary can be used to conditionally update the maximum.
 */