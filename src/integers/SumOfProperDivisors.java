package integers;

import java.util.Scanner;

public class SumOfProperDivisors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Sum of proper divisors is: " + sumOfProperDivisors(N));
        sc.close();;
    }

    private static int sumOfProperDivisors(int n) {
        int sum = 0;
        for (int i=1; i<n; i++){
            sum += n%i == 0 ? i : 0;
        }
        return sum;
    }
}

/*
 * Problem Statement:
 * Given an integer N, calculate the sum of all proper divisors of N.
 * A proper divisor is a positive divisor less than N itself.
 *
 * Approach:
 * Iterate from 1 to N - 1.
 * If N % i is 0, then i is a divisor of N.
 * Add i to the sum; otherwise add 0.
 *
 * Key Concept:
 * N % i == 0 means i divides N without a remainder.
 * Ternary can be used to conditionally add the divisor.
 */
