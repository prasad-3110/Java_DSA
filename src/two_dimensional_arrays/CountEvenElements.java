package two_dimensional_arrays;

public class CountEvenElements {
    static void main() {
        int[][] matrix =  {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int evenCount = 0;

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                int element = matrix[row][col];
                evenCount = element % 2 == 0 ? evenCount+1 : evenCount;
            }
        }
        System.out.println(evenCount);
    }
}

/*
* # Problem: Count Even Elements

## Problem Statement

Given a 2D integer array `matrix`, count and print the number of even elements present in the matrix.

An element is even if it is completely divisible by `2`.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

### Output Format

Print the number of even elements present in the matrix.

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
4
```

### Explanation

The even elements are `2, 4, 6, 8`, so the count is `4`.

---

## Approach Notes

**Idea:** Traverse every element and count the elements divisible by `2`.

**Steps:**

1. Initialize `evenCount = 0`.
2. Traverse rows and columns.
3. Check `matrix[row][col] % 2 == 0`.
4. If true, increment `evenCount`.
5. Print `evenCount`.

**Remember:**

* `% 2 == 0` → **Even**
* `evenCount++` → increments the count by `1`.
* As a standalone statement, `evenCount++` is equivalent to `evenCount = evenCount + 1`.
* Avoid `evenCount = evenCount++` because post-increment returns the old value, which gets assigned back to the variable.

**Time:** `O(R × C)`
**Space:** `O(1)`

---

## Class Name

`CountEvenElements`

## Package

`two_dimensional_arrays`
* */
