package two_dimensional_arrays;

public class PrintAllElements {
    static void main() {
        int[][] matrix =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,9,0}
                };

        for(int row=0; row<matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++){
                System.out.println(matrix[row][col]);
            }
        }

    }
}


/*
* # Problem: Print All Elements

## Problem Statement

Given a 2D integer array, print all its elements row by row.

### Input

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 9, 0}
};
```

### Output

```text
1
2
3
4
5
6
7
9
0
```

---

## Approach Notes

**Idea:** Traverse the matrix row by row using nested loops and print each element.

**Steps:**

1. Traverse rows using the outer loop.
2. Traverse columns using the inner loop.
3. Access each element using `matrix[row][col]`.
4. Print the element.

**Remember:**

* Outer loop → **Row**
* Inner loop → **Column**
* `matrix[row][col]` → **Current element**

**Time:** `O(R × C)`
**Space:** `O(1)`

---

## Class Name

`PrintAllElements`

## Package

`two_dimensional_arrays`
*/
