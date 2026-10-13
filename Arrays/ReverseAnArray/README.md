# Java Array Reversal

## Overview

## Programs

### 1. Reverse Array Using a Temporary Variable
- Uses two pointers: `left` and `right`.
- Swaps elements using a temporary variable (`temp`).
- Moves both pointers toward the center until `left < right`.

**Example input:**
```java
int arr[] = {1, 2, 3, 4, 5};
```

**Output:**
```text
5 4 3 2 1
```

### 2. Reverse Array Without a Temporary Variable
- Uses the same two-pointer technique.
- Swaps elements using addition and subtraction instead of a temporary variable.
- Uses `left < right` to avoid modifying the middle element unnecessarily.

**Example input:**
```java
int arr[] = {50, 40, 30, 20, 10};
```

**Output:**
```text
10 20 30 40 50
```

**Note:** Arithmetic swapping can cause integer overflow. Using a temporary variable is generally safer and more readable.

## Algorithm
1. Initialize `left = 0`.
2. Initialize `right = arr.length - 1`.
3. While `left < right`:
   - Swap `arr[left]` and `arr[right]`.
   - Increment `left`.
   - Decrement `right`.
4. Print the reversed array.

## Complexity Analysis

| Complexity | Both Programs |
|---|---|
| Time Complexity | O(n) |
| Auxiliary Space | O(1) |

Here, `n` represents the number of elements in the array.

## Concepts Learned
- Java arrays
- Two-pointer technique
- Swapping elements
- In-place array reversal
- Time and auxiliary space complexity
- Debugging and integer overflow

## How to Run
Save the program in `Reverse.java`, then run:

```bash
java Reverse.java
```

Alternatively, compile and run:

```bash
javac Reverse.java
java Reverse
```

## Conclusion
Both programs reverse an array in place using O(n) time and O(1) auxiliary space. The temporary-variable method is recommended for its safety and readability.
