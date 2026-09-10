package strings.basics;

import java.util.Scanner;

public class CountDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int digitCount = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (digitCheck(ch)) digitCount++;
        }
        System.out.println(digitCount);
        sc.close();
    }

    private static boolean digitCheck(char chr){
        return (chr >= 48 && chr <=57);
    }
}


/*
* # Problem: Count Digits

## Problem Statement

Given a string `S`, count the number of digits present in the string.

A digit is any character from `0` to `9`.

### Input Format

A single line containing the string `S`.

### Output Format

Print the number of digits present in `S`.

### Constraints

* `1 <= S.length() <= 10^5`
* `S` may contain letters, digits, spaces, and special characters.

### Example

**Input**

```text id="g0qj8m"
Hello 2026!
```

**Output**

```text id="e6k4zx"
4
```

---

## Approach Notes

**Idea:** Traverse the String character by character. If the character's value is between `48` (`0`) and `57` (`9`), it is a digit → increment the count.

**Steps:**

1. Initialize `digitCount = 0`.
2. Traverse the String using `charAt(i)`.
3. Pass each character to `digitCheck()`.
4. Check whether `chr` is between `48` and `57`.
5. If `true`, increment `digitCount`.

**Remember:**
`'0' → 48` and `'9' → 57`.

**Time:** `O(n)`
**Space:** `O(1)`

* */