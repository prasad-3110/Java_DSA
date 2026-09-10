package strings.basics;

import java.util.Scanner;

public class CountVowels {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowelCount = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' ||
                    str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' ||
                    str.charAt(i) == 'U'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
        sc.close();
    }
}


/*
* # Problem: Count Vowels

## Problem Statement

Given a string `S`, count the number of vowels present in the string.

A vowel is one of the following characters:

`a, e, i, o, u`

The input string may contain uppercase and lowercase letters.

### Input Format

A single line containing the string `S`.

### Output Format

Print the number of vowels present in `S`.

### Constraints

* `1 <= S.length() <= 10^5`
* `S` may contain letters, digits, spaces, and special characters.

### Example

**Input**

```text
Hello World
```

**Output**

```text
3
```

---

## Approach Notes

**Idea:** Traverse the String character by character and check whether the current character is one of the 10 vowels (`a,e,i,o,u` + uppercase). If yes, increment the vowel counter.

**Steps:**

1. Initialize `vowelCount = 0`.
2. Traverse from `i = 0` to `str.length() - 1`.
3. Get the current character using `charAt(i)`.
4. Compare it with lowercase and uppercase vowels.
5. If it is a vowel, increment `vowelCount`.
6. Print the final count.

**Time:** `O(n)`
**Space:** `O(1)`

* */