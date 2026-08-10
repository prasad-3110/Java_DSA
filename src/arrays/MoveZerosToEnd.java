package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    static void main() {
        int[] arr = {1,2,0,0,0,4,0,0,5};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEnd(int[] arr){
        int pointer = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != 0){
                if (i != pointer){
                    int temp = arr[i];
                    arr[i] = arr[pointer];
                    arr[pointer] = temp;
                }
                pointer++;
            }
        }
    }
}


/*
 * Solved using the two-pointer technique.
 *
 * Both pointers move in the same direction:
 * - 'i' scans the array from left to right.
 * - 'pointer' keeps track of the position where the next
 *   non-zero element should be placed.
 *
 * A 'for' loop is preferred here because 'i' is the main
 * scanning pointer and it traverses the entire array from
 * index 0 to n-1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */