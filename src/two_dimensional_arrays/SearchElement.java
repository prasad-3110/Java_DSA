package two_dimensional_arrays;

import java.util.Scanner;

public class SearchElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {23,45,67},
                {32,65,89},
                {43,21,34}
        };
        int target = sc.nextInt();
        System.out.println(searchElement(matrix, target));
    }

    private static boolean searchElement(int[][] matrix, int target){
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                if (matrix[row][col] == target) return true;
            }
        }
        return false;
    }
}

/*
* # Problem: Search Element in a Matrix

## Problem Statement

Given a 2D integer array `matrix` and an integer `target`, determine whether the target element is present in the matrix.

If the target is present, print `true`; otherwise, print `false`.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

The last line contains the integer `target` to search for.

### Output Format

Print `true` if the target is present in the matrix; otherwise, print `false`.

### Constraints

- `1 <= R, C <= 100`
- `-10^9 <= matrix[i][j], target <= 10^9`

### Example

**Input**

```text
3 3
10 20 30
40 50 60
70 80 90
50
```

**Output**

```text
true
```

### Explanation

The target `50` is present at row `1`, column `1`.

---

## Approach Notes

**Idea:** Traverse every element and compare it with the target.

**Steps:**

1. Initialize a boolean variable `found = false`.
2. Traverse rows and columns.
3. Compare `matrix[row][col]` with `target`.
4. If equal, set `found = true`.
5. Print `found`.

**Remember:**

* Searching → **Compare each element with target**.
* `found` acts as a **flag** to track whether the element exists.

**Time:** `O(R × C)`
**Space:** `O(1)`

---

## Class Name

`SearchElement`

## Package

`two_dimensional_arrays`
* */
