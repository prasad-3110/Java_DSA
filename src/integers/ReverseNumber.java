package integers;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(reverseNum(A));
        sc.close();
    }

    private static int reverseNum(int A) {
        int rev = 0;
        while (A != 0){
            rev = (rev*10) + (A%10);
            A /= 10;
        }
        return rev;
    }
}


/*
 * Problem Statement:
 * Given an integer A, reverse the digits of the number.
 *
 * Approach:
 * Extract the last digit using A % 10.
 * Shift the current reversed number one digit to the left by multiplying it by 10.
 * Add the extracted digit to the reversed number.
 * Remove the last digit from A using integer division A / 10.
 * Repeat until A becomes 0.
 *
 * Key Concept:
 * A % 10 extracts the last digit.
 * A / 10 removes the last digit.
 * rev * 10 shifts the existing number one digit to the left.
 */
