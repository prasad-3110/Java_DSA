package arrays;

import java.util.Arrays;

public class ReverseAnArrayInPlace {
    static void main() {
//        int[] arr = {5,1,4,7,9,6};
//        int[] arr = {};
        int[] arr = {2,4,6};
        reverseAnArrayInPlace(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseAnArrayInPlace(int[] arr){

        if (arr == null || arr.length<2){
            return;
        }

        int i = 0;
        int j = arr.length-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}



/*
 * Approach:
 *
 * - Reverse the array in-place using two pointers.
 * - i starts from the beginning and j from the end.
 * - Swap arr[i] and arr[j], then move:
 *      i++
 *      j--
 * - Continue while i < j.
 *
 * - Thinking:
 *      First ↔ last
 *      Second ↔ second-last
 *      Third ↔ third-last...
 *
 * - This naturally leads to two pointers moving towards each other.
 *
 * - Edge cases: null, empty, single element, odd/even length.
 *
 * - Time Complexity  : O(n)
 * - Space Complexity : O(1)
 */