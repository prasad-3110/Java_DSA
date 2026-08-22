package integers;

import java.util.Scanner;

public class ProductOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Product of digits: " + productOfDigits(N));
        sc.close();
    }

    private static int productOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int product = 1;
        while(n != 0){
            product *= n%10;
            n /= 10;
        }
        return product;
    }
}



/*
 * Problem Statement:
 * Given an integer N, find the product of all its digits.
 *
 * Approach:
 * Initialize product to 1.
 * Extract each digit using N % 10 and multiply it with product.
 * Remove the last digit using integer division N / 10.
 * Repeat until N becomes 0.
 *
 * Edge Case:
 * If N is 0, the product of its digits is 0.
 *
 * Key Concept:
 * 1 is the neutral value for multiplication.
 * 0 affects the product, so it must not be ignored.
 */