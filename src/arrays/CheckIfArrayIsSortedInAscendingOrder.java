package arrays;

public class CheckIfArrayIsSortedInAscendingOrder {
    static void main() {
        int[] arr = {-1,3,5,7,9,9,13};
//        int[] arr = {};
//        int[] arr = {25,12};
        System.out.println(ascSortChck(arr));
    }

    private static boolean ascSortChck(int[] arr){
        if ((arr == null) || arr.length<2){
            return true;
        }

        for (int i=1; i<arr.length; i++){
            if (arr[i] < arr[i-1])
                return false;
        }

        return true;
    }
}




/*
 * Approach:
 *
 * - The array is sorted in ascending order if every element is
 *   greater than or equal to the element immediately before it.
 *
 * - Instead of comparing every element with every other element,
 *   compare adjacent elements:
 *
 *      arr[i] with arr[i - 1]
 *
 * - Start from index 1 because the first element has no previous
 *   element to compare with.
 *
 * - For every element:
 *
 *      If arr[i] < arr[i - 1]:
 *          The ascending order is violated.
 *          Return false immediately.
 *
 *      Otherwise:
 *          Continue checking the next pair.
 *
 * - If the entire array is traversed without finding a violation,
 *   the array is sorted, so return true.
 *
 * - Edge cases considered:
 *      1. null array
 *      2. empty array
 *      3. single-element array
 *      4. duplicate/equal elements
 *      5. negative numbers
 *
 * - Time Complexity  : O(n)
 * - Space Complexity : O(1)
 *
 * Thinking pattern:
 *
 * - I initially need to ask: "What condition would prove that
 *   the array is NOT sorted?"
 *
 * - A single adjacent pair where the current element is smaller
 *   than the previous element is enough to prove that the array
 *   is not sorted.
 *
 * - Therefore, I don't need to find or track the largest/smallest
 *   value. I only need to look for a violation of the required
 *   ordering.
 */
