package arrays;

public class SecondLargestWithoutSorting {
    static void main() {
        int[] arr = {10, 5, -1, 20, 15, 20};
//        int arr = {};
//        int[] arr = {20,20,20};
        System.out.println(findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {

        if (arr == null || arr.length<2){
            return Integer.MIN_VALUE;
        }

        int secondLargest = Integer.MIN_VALUE;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && !(arr[i] == largest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}


/*
* private static int findSecondLargest(int[] arr) {

        if (arr == null || arr.length<2){
            return Integer.MIN_VALUE;
        }

        int secondLargest = Integer.MIN_VALUE;
        int largest = arr[0];

        for (int element : arr) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest && !(element == largest)) {
                secondLargest = element;
            }
        }
        return secondLargest;
    }
* */


/*
 * Approach:
 *
 * - Find the second largest distinct element without sorting the array.
 * - Maintain two variables while traversing the array:
 *      1. largest       -> largest element seen so far
 *      2. secondLargest -> second largest distinct element seen so far
 *
 * - For every element:
 *
 *      If element > largest:
 *          The current largest becomes the second largest,
 *          and the current element becomes the new largest.
 *
 *      Else if element > secondLargest and element != largest:
 *          The current element becomes the new second largest.
 *
 * - We use a single traversal, so:
 *      Time Complexity  : O(n)
 *      Space Complexity : O(1)
 *
 * - Edge cases considered:
 *      1. null array
 *      2. array with fewer than 2 elements
 *      3. negative numbers
 *      4. duplicate largest elements
 *      5. no second distinct largest element
 */

