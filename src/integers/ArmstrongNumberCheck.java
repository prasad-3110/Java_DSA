package integers;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(armstrongNumberCheck(N) ? "Armstrong Number" : "Not an Armstrong Number");
        sc.close();
    }

    private static boolean armstrongNumberCheck(int n) {
        int remainingNumber = n;
        int digitPowerSum = 0;
        int digitCount = 0;

        int numberForDigitCount = n;

        while(numberForDigitCount != 0){
            numberForDigitCount /= 10;
            digitCount++;
        }

        while (remainingNumber != 0){
            int currentDigit = remainingNumber % 10;
            int digitPower = 1;
            for (int i =1; i <= digitCount; i++){
                 digitPower *= currentDigit;
            }
            digitPowerSum += digitPower;
            remainingNumber /= 10;
        }

        return digitPowerSum == n; // 0 is handled naturally; no special case needed.
    }
}


/*
 * Problem Statement:
 * Given an integer N, determine whether it is an Armstrong number.
 * The power used for each digit is the number of digits in N.
 *
 * Approach:
 * First count the number of digits in N.
 * Then extract each digit using N % 10.
 * Calculate the digit raised to the number of digits using a loop.
 * Add each powered digit to the total sum.
 * Finally, compare the sum with the original number.
 *
 * Key Concept:
 * Calculate powers using repeated multiplication instead of Math.pow().
 */