package two_dimensional_arrays;

import java.util.Scanner;

public class SumOfEachRow {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] matrix = new int[R][C];

        for (int row = 0; row < R; row++){
            for (int col = 0; col < C; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        sumOfEachRow(matrix);
    }

    private static void sumOfEachRow(int[][] matrix){
        for (int row = 0; row < matrix.length; row++){
            int rowSum = 0;
            for (int col = 0; col < matrix[row].length; col++){
                rowSum += matrix[row][col];
            }
            System.out.println(rowSum);
        }
    }
}


/*
* # Problem: Sum of Each Row in a Matrix

## Problem Statement

Given a 2D integer array `matrix`, calculate and print the sum of elements in each row.

### Input Format

The first line contains two integers `R` and `C`, representing the number of rows and columns.

The next `R` lines contain `C` space-separated integers representing the matrix elements.

### Output Format

Print the sum of each row on a separate line.

### Constraints

- `1 <= R, C <= 100`
- `-10^4 <= matrix[i][j] <= 10^4`

### Example

**Input**

```text
3 4
1 2 3 4
5 6 7 8
9 10 11 12
```

**Output**

```text
10
26
42
```

### Explanation

- Row 0: `1 + 2 + 3 + 4 = 10`
- Row 1: `5 + 6 + 7 + 8 = 26`
- Row 2: `9 + 10 + 11 + 12 = 42`
* */



/*
Approach Notes:

Idea:
Traverse the matrix row by row, calculating the sum of each row independently.

Steps:
1. Iterate through each row using the outer loop.
2. Initialize rowSum = 0 for the current row.
3. Use the inner loop to visit every column in that row.
4. Add each element to rowSum.
5. Print rowSum after completing the row.

Remember:
- The outer loop selects the row.
- The inner loop traverses its columns.
- Initialize rowSum inside the outer loop.
- Print the sum after the inner loop finishes.

Time Complexity: O(R * C)
Auxiliary Space: O(1)
*/