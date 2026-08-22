package integers;

import java.util.Scanner;

public class CountSpecificDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        System.out.println("D occurs " + countSpecificDigit(N, D) + " times in N");
        sc.close();
    }

    private static int countSpecificDigit(int n, int d) {
        if(n == 0) return d == 0 ? 1 : 0;
        int frequency = 0;
        while (n != 0){
            int lastDigit = n%10;
            frequency += lastDigit == d ? 1 :0;
            n /= 10;
        }
        return frequency;
    }
}



/*
 * Problem Statement:
 * Given two integers N and D, count how many times digit D occurs in N.
 *
 * Approach:
 * Extract each digit of N using N % 10.
 * Compare the extracted digit with D.
 * Increment the frequency when the digits match.
 * Remove the last digit using N / 10 and repeat.
 *
 * Edge Case:
 * If N is 0, it contains one digit (0).
 * Therefore, return 1 when D is also 0; otherwise return 0.
 *
 * Key Concept:
 * A counter can be conditionally incremented using:
 * count += condition ? 1 : 0;
 */
