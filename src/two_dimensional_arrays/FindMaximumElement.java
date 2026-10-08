package two_dimensional_arrays;

public class FindMaximumElement {
    static void main() {
        int[][] matrix = {
                {0,9,8},
                {7,6,5},
                {4,3,2}
        };
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col <matrix[row].length; col++){
                int element = matrix[row][col];
                max = max < element ? element : max;
            }
        }

        System.out.println(max);
    }
}

/*
* # Problem: Find Maximum Element

## Problem Statement

Given a 2D integer array `matrix`, find and print the largest element present in the matrix.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

### Output Format

Print the largest element present in the matrix.

### Constraints

- `1 <= R, C <= 100`
- `-10^9 <= matrix[i][j] <= 10^9`

### Example

**Input**

```text
3 3
0 9 8
7 6 5
4 3 2
```

**Output**

```text
9
```

---

## Approach Notes

**Idea:** Traverse every element and maintain the maximum value found so far.

**Steps:**

1. Initialize `max = Integer.MIN_VALUE`.
2. Traverse rows and columns.
3. Compare each element with `max`.
4. Update `max` if the current element is larger.
5. Print `max`.

**Remember:**

* Initialize maximum with `Integer.MIN_VALUE` to handle negative values.
* Update maximum while traversing.

**Time:** `O(R × C)`
**Space:** `O(1)`
* */
