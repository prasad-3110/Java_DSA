package arrays;

public class LargestNumberInArray {
    static void main() {
        int[] arr = {2,5,8,13};
        System.out.println(findLargestNumber(arr));
    }
    private static int findLargestNumber(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (max < j) max = j;
        }
        return max;
    }
}
