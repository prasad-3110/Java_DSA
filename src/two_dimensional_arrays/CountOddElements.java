package two_dimensional_arrays;

import java.util.Scanner;

public class CountOddElements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] matrix = new int[R][C];

        for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        countOdd(matrix);
    }

    private static void countOdd(int[][] matrix){
        int count = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                int element = matrix[row][col];
                count += element % 2 != 0 ? 1 : 0;
            }
        }
        System.out.println(count);
    }
}

/*
* # Problem: Count Odd Elements

## Problem Statement

Given a 2D integer array `matrix`, count and print the number of odd elements present in the matrix.

An element is odd if it is not completely divisible by `2`.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

### Output Format

Print the number of odd elements present in the matrix.

### Constraints

- `1 <= R, C <= 100`
- `-10^9 <= matrix[i][j] <= 10^9`

### Example

**Input**

```text
3 3
1 2 3
4 5 6
7 8 9
```

**Output**

```text
5
```

### Explanation

The odd elements are `1, 3, 5, 7, 9`. Therefore, the count is `5`.

---

## Approach Notes

**Idea:** Traverse every element and count those not divisible by `2`.

**Steps:**

1. Initialize `oddCount = 0`.
2. Traverse rows and columns.
3. Check whether `matrix[row][col] % 2 != 0`.
4. If true, increment `oddCount`.
5. Print the final count.

**Remember:**

- `% 2 != 0` → Odd
- `oddCount++` → Increment the count.

**Time:** `O(R × C)`
**Space:** `O(1)`

---

## Class Name

`CountOddElements`

## Package

`two_dimensional_arrays`
*
*
* ## Approach Notes

**Idea:** Traverse every element and count those not divisible by `2`.

**Steps:**
1. Initialize `count = 0`.
2. Traverse rows and columns.
3. Check `element % 2 != 0`.
4. Increment the count if true.
5. Print the final count.

**Remember:** `% 2 != 0` → Odd.

**Time:** `O(R × C)`
**Space:** `O(1)` auxiliary space.
* */
