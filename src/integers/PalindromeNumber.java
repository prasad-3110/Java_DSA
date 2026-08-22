package integers;

import java.util.Scanner;

public class PalindromeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(!palindromeCheck(A) ? "Not Palindrome" : "Palindrome");
        sc.close();
    }

    private static boolean palindromeCheck(int a) {
        int temp = a;
        int reverse = 0;
        while (temp != 0){
            reverse = (reverse*10) + temp%10;
            temp/=10;
        }
        return reverse == a;
    }
}


/*
 * Problem Statement:
 * Given an integer N, determine whether the number is a palindrome.
 *
 * Approach:
 * Preserve the original number and create its reverse.
 * Extract each digit using N % 10.
 * Build the reversed number by shifting the current reverse left
 * and adding the extracted digit.
 * Remove the last digit using N / 10.
 * Compare the reversed number with the original number.
 * If both are equal, the number is a palindrome.
 *
 * Key Concept:
 * A palindrome number remains the same when its digits are reversed.
 * The original number must be preserved while creating the reverse.
 */