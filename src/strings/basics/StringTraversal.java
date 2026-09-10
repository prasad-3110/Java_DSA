package strings.basics;

import java.util.Scanner;

public class StringTraversal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        for (int i=0; i<A.length(); i++){
            System.out.println(A.charAt(i));
        }
        sc.close();
    }
}


/*
* # Problem: String Traversal

## Problem Statement

Given a string `S`, print each character of the string on a separate line in the same order as they appear in the string.

### Input Format

A single line containing the string `S`.

### Output Format

Print each character of `S` on a separate line.

### Constraints

* `1 <= S.length() <= 10^5`
* `S` contains English letters, digits, spaces, or special characters.

### Example

**Input**

```text
programming
```

**Output**

```text
p
r
o
g
r
a
m
m
i
n
g
```

---

## Approach Notes

**Idea:** Traverse the String from left to right and access each character using `charAt(i)`.

```text
Start → index 0 → charAt(i) → print → next index → repeat
```

**Loop:**

```java
for (int i = 0; i < str.length(); i++)
```

**Character:**

```java
char ch = str.charAt(i);
```

**Remember:**

* String index starts at `0`.
* Last index = `length - 1`.
* Use `< length`, NOT `<= length`.

**Time:** `O(n)`
**Space:** `O(1)`

* */