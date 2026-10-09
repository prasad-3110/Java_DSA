package two_dimensional_arrays;

import java.util.Scanner;

public class PrintSpecificRow {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int targetRow = sc.nextInt();

        int[][] matrix = new int[R][C];

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        printSpecificRow(matrix, targetRow);
    }

    private static void printSpecificRow(int[][] matrix, int targetRow){
        for (int i = 0; i < matrix[targetRow].length; i++){
            System.out.print(matrix[targetRow][i] + " ");
        }
    }
}

/*
* # Problem: Print a Specific Row of a Matrix

## Problem Statement

Given a 2D integer array `matrix` and an integer `rowIndex`, print all elements of the specified row in their original order.

Assume that `rowIndex` is a valid, zero-based row index.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

The last line contains an integer `rowIndex`, representing the row to print.

### Output Format

Print all elements of the specified row, separated by spaces.

### Constraints

- `1 <= R, C <= 100`
- `0 <= rowIndex < R`
- `-10^4 <= matrix[i][j] <= 10^4`

### Example

**Input**

```text
3 4
1 2 3 4
5 6 7 8
9 10 11 12
1
```

**Output**

```text
5 6 7 8
```

### Explanation

The given `rowIndex` is `1`. Since row indexing starts at `0`, the second row is selected, and its elements are printed.
*
*
*
* ## Approach Notes

**Idea:** Access the specified row directly and traverse its elements.

**Steps:**

1. Read `targetRow`.
2. Traverse `matrix[targetRow]` using a single loop.
3. Print each element.

**Remember:**
- `matrix[rowIndex]` → selects a row.
- `matrix[rowIndex].length` → number of columns in that row.

**Time:** `O(C)`
**Space:** `O(1)` auxiliary space.
* */
