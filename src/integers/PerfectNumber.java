package integers;

import java.util.Scanner;

public class PerfectNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(perfectCheck(N) ? "Perfect Number" : "Not a Perfect Number");
        sc.close();
    }

    private static boolean perfectCheck(int n) {
        int sum = 0;
        for (int i=1; i<n; i++){
            sum += n%i == 0 ? i : 0;
        }
        return sum == n;
    }
}


/*
 * Problem Statement:
 * Given a positive integer N, determine whether it is a perfect number.
 * A perfect number is a number whose sum of proper divisors equals the number itself.
 *
 * Approach:
 * Iterate from 1 to N - 1.
 * If N % i is 0, add i to the sum.
 * After checking all proper divisors, compare the sum with N.
 * If sum equals N, the number is a perfect number.
 *
 * Key Concept:
 * A boolean condition can be returned directly using:
 * return sum == n;
 */