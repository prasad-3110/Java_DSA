package integers;

import java.util.Scanner;

public class SmallestDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Smallest digit: " + findSmallest(N));
        sc.close();
    }

    private static int findSmallest(int n) {

        if (n == 0) return 0;

        int min = Integer.MAX_VALUE;
    // General approach: initialize min to a value greater than all possible values.
    // Since digits range from 0 to 9, min = 9 would also work here.

        while (n != 0){
            int lastDigit = n%10;
            min = lastDigit<min ? lastDigit : min;
            n /= 10;
        }
        return min;
    }
}



/*
 * Problem Statement:
 * Given an integer N, find the smallest digit present in the number.
 *
 * Approach:
 * Extract each digit using N % 10.
 * Compare the extracted digit with the current minimum.
 * Update the minimum when the extracted digit is smaller.
 * Remove the last digit using N / 10 and repeat.
 *
 * Key Concept:
 * For minimum-value problems, the initial value can be set
 * to a value greater than all possible values.
 */