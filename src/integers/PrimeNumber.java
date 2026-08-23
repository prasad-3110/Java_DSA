package integers;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(primeCheck(N)?"Prime Number" : "Not a Prime Number");
        sc.close();
    }

    private static boolean primeCheck(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
 * Problem Statement:
 * Given an integer N, determine whether it is a prime number.
 * A prime number has exactly two positive factors: 1 and N.
 *
 * Approach:
 * Numbers less than 2 are not prime.
 * Check possible divisors starting from 2.
 * Continue checking while i * i <= N.
 * If a divisor is found, N is not prime and we can stop immediately.
 * If no divisor is found within the boundary, N is prime.
 *
 * Key Concepts:
 * i * i <= N represents the square-root boundary without using Math.sqrt().
 *
 * Factors occur in pairs whose product is N.
 * For example, for N = 36:
 *
 * 1 * 36 = 36
 * 2 * 18 = 36
 * 3 * 12 = 36
 * 4 * 9  = 36
 * 6 * 6  = 36
 * 9 * 4  = 36
 * 12 * 3 = 36
 * 18 * 2 = 36
 * 36 * 1 = 36
 *
 * Once we reach 6 * 6 = 36, the remaining factor pairs are
 * simply the reverse of the pairs already covered.
 * Therefore, we only need to check divisors while i * i <= N.
 *
 * The <= is important because for perfect squares such as 36 = 6 * 6,
 * the factor at the boundary must also be checked.
 *
 * If a divisor is found, further checking is unnecessary.
 */
