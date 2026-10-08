package two_dimensional_arrays;

public class FindMinimumElement {
    static void main() {
        int[][] matrix = {
                {8,2,5},
                {7,9,1},
                {4,6,3}
        };

        int min = Integer.MAX_VALUE;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                int element = matrix[row][col];
                min = min > element ? element : min;
            }
        }
        System.out.println(min);
    }
}

/*
* # Problem: Find Minimum Element

## Problem Statement

Given a 2D integer array `matrix`, find and print the smallest element present in the matrix.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

### Output Format

Print the smallest element present in the matrix.

### Constraints

- `1 <= R, C <= 100`
- `-10^9 <= matrix[i][j] <= 10^9`

### Example

**Input**

```text
3 3
8 2 5
7 9 1
4 6 3
```

**Output**

```text
1
```

### Explanation

The smallest element in the matrix is `1`.

---

## Approach Notes

**Idea:** Traverse every element and maintain the minimum value found so far.

**Steps:**

1. Initialize `min = Integer.MAX_VALUE`.
2. Traverse rows and columns.
3. Compare each element with `min`.
4. Update `min` if the current element is smaller.
5. Print `min`.

**Remember:**

* Initialize minimum with `Integer.MAX_VALUE`.
* Update minimum while traversing.

**Time:** `O(R × C)`
**Space:** `O(1)`

---

## Class Name

`FindMinimumElement`

## Package

`two_dimensional_arrays`
* */