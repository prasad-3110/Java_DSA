package two_dimensional_arrays;

public class SumOfMatrixElements {
    static void main() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }
}

/*
* # Problem: Sum of Matrix Elements

## Problem Statement

Given a 2D integer array `matrix`, calculate and print the sum of all elements present in the matrix.

You must traverse every element of the matrix and add its value to the total sum.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns in the matrix.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

### Output Format

Print a single integer representing the sum of all elements in the matrix.

### Constraints

- `1 <= R, C <= 100`
- `-10^4 <= matrix[i][j] <= 10^4`

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
45
```

### Explanation

The sum of all elements is:

```text
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
```

---

## Approach Notes

**Idea:** Traverse every element of the matrix and maintain a running sum.

**Steps:**

1. Initialize `sum = 0`.
2. Traverse rows using the outer loop.
3. Traverse columns using the inner loop.
4. Add `matrix[row][col]` to `sum`.
5. Print the final sum.

**Remember:**

* Outer loop → **Row**
* Inner loop → **Column**
* `sum += matrix[row][col]` → **Accumulate element**

**Time:** `O(R × C)`
**Space:** `O(1)`

---

## Class Name

`SumOfMatrixElements`

## Package

`two_dimensional_arrays`
* */
