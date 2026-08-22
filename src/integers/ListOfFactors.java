package integers;

import java.util.Scanner;

public class ListOfFactors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        listOfFactors(N);
        sc.close();
    }

    private static void listOfFactors(int n) {
        for (int i= 1; i<=n; i++){
            System.out.print(n%i == 0 ? i +" ": "");
        }
    }
}



/*
 * Problem Statement:
 * Given a positive integer N, print all its positive factors.
 *
 * Approach:
 * Iterate from 1 to N.
 * If N % i is 0, then i is a factor of N.
 * Print the factor when the condition is satisfied.
 *
 * Key Concept:
 * N % i == 0 means i divides N without a remainder.
 */