package integers;

import java.util.Scanner;

public class SecondLargestDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int secondLargestDigit = fetchSecondLargestDigit(N);
        if (secondLargestDigit == -1){
            System.out.println("No second largest digit");
        } else {
            System.out.println("Second Largest Digit is: " + secondLargestDigit);
        }
        sc.close();
    }

    private static int fetchSecondLargestDigit(int n) {
        int largest = -1;
        int secondLargest = -1;
        if (n == 0) {
            return -1;
        }
        while(n != 0 ){
            int digit = n%10;
            if (digit > secondLargest && digit != largest){
                if (digit > largest){
                    secondLargest = largest;
                    largest = digit;
                }else {
                    secondLargest = digit;
                }
            }
            n /= 10;
        }
        return secondLargest;
    }
}




/*
 * Problem Statement:
 * Given an integer N, find the second largest distinct digit present in the number.
 *
 * Approach:
 * Initialize largest and secondLargest to -1 because -1 cannot be a digit.
 * Extract each digit using N % 10.
 * Ignore the digit if it is equal to the current largest digit.
 * If the digit is greater than the current largest, move the current
 * largest to secondLargest and update largest.
 * Otherwise, if it is greater than secondLargest, update secondLargest.
 * Remove the last digit using N / 10 and repeat.
 *
 * Edge Case:
 * If no distinct second-largest digit exists, return -1.
 *
 * Key Concept:
 * Maintain multiple state variables while traversing the digits.
 * A sentinel value should not overlap with a valid answer.
 */