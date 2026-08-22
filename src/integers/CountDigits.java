package integers;

import java.util.Scanner;

public class CountDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(countDigits(A));
        sc.close();
    }

    private static int countDigits(int A) {
        int count = 0;
        if (A == 0) return 1;
        while(A != 0){
            A /= 10;
            count++;
        }
        return count;
    }
}


/*
 * Problem Statement:
 * Given an integer A, count the number of digits in the number.
 *
 * Approach:
 * Divide the number by 10 repeatedly until it becomes 0.
 * Increment the count after every division.
 *
 * Edge Case:
 * 0 itself contains 1 digit.
 *
 * Key Concept:
 * Integer division by 10 removes the last digit of the number.
 */