package two_dimensional_arrays;

import java.util.Scanner;

public class CountOccurrences {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int target = sc.nextInt();

        int[][] matrix = new int[R][C];

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        countOccurrences(matrix, target);
    }

    private static void countOccurrences(int[][] matrix, int target){
        int count = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                int element = matrix[row][col];
                count += element == target ? 1 : 0;
            }
        }
        System.out.println(count);
    }
}

/*
* # Problem: Count Occurrences in a Matrix

## Problem Statement

Given a 2D integer array `matrix` and an integer `target`, count how many times the target appears in the matrix.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

The last line contains the integer `target`.

### Output Format

Print the number of times `target` occurs in the matrix.

### Constraints

- `1 <= R, C <= 100`
- `-10^9 <= matrix[i][j], target <= 10^9`

### Example

**Input**
```text
3 3
1 2 3
2 5 2
7 2 9
2
```

**Output**
```text
4
```

### Explanation

The target `2` appears four times in the matrix.
*
*
*## Approach Notes

**Idea:** Traverse every element and count how many times it matches the target.

**Steps:**

1. Initialize `count = 0`.
2. Traverse rows and columns.
3. Compare each element with `target`.
4. If equal, increment `count`.
5. Print the final count.

**Remember:** `element == target` → Match found.

**Time:** `O(R × C)`
**Space:** `O(1)` auxiliary space.
* */
