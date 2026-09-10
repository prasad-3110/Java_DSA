package strings.basics;

import java.util.Scanner;

public class CountConsonants {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int consonantCount = 0;
        for (int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                if (consonantCheck(ch))
                    consonantCount++;
        }
        System.out.println(consonantCount);
        sc.close();
    }

    private static boolean consonantCheck(char chr){
        return (
                ((int) chr >= 65 && (int) chr <= 90)
                        ||
                        ((int) chr >= 97 && (int) chr <= 122)
        )
                && (
                chr != 'a' &&
                        chr != 'e' &&
                        chr != 'i' &&
                        chr != 'o' &&
                        chr != 'u' &&
                        chr != 'A' &&
                        chr != 'E' &&
                        chr != 'I' &&
                        chr != 'O' &&
                        chr != 'U');
    }
}


/*
* # Problem: Count Consonants

## Problem Statement

Given a string `S`, count the number of consonants present in the string.

A consonant is an English alphabet character that is not a vowel. The vowels are `a, e, i, o, u` in both lowercase and uppercase.

Digits, spaces, and special characters should not be counted.

### Input Format

A single line containing the string `S`.

### Output Format

Print the number of consonants present in `S`.

### Constraints

* `1 <= S.length() <= 10^5`
* `S` may contain uppercase/lowercase letters, digits, spaces, and special characters.

### Example

**Input**

```text
Hello World 123!
```

**Output**

```text
7
```

---

## Approach Notes

**Idea:** Traverse the String character by character. For each character, check whether it is an alphabet **AND** not a vowel. If both are true, increment the consonant count.

**Steps:**

1. Initialize `consonantCount = 0`.
2. Traverse the String using `charAt(i)`.
3. Pass each character to `consonantCheck()`.
4. In `consonantCheck()`, verify:

   * character is an uppercase/lowercase alphabet.
   * character is not any vowel.
5. If `true`, increment `consonantCount`.
6. Print the final count.

**Remember:**
For **NOT a vowel**, use `&&` between the `!=` comparisons, not `||`.

**Time:** `O(n)`
**Space:** `O(1)`

* * */
