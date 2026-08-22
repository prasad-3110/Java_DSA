package integers;

import java.util.Scanner;

public class NumberOfFactors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fetchNumberOfFactors(N);
        sc.close();
    }

    private static void fetchNumberOfFactors(int n) {
        int count = 0;
        for (int i=1; i<=n; i++){
            count += n%i == 0 ? 1 : 0;
        }
        System.out.println("The number of factors for N: " + count);
    }
}

/*
 * Problem Statement:
 * Given a positive integer N, find the total number of positive factors of N.
 *
 * Approach:
 * Iterate from 1 to N.
 * If N % i is 0, then i is a factor of N.
 * Increment the count when a factor is found.
 *
 * Key Concept:
 * count += condition ? 1 : 0;
 * can be used to count values satisfying a condition.
 */