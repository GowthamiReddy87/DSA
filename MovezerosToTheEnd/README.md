# Move Zeros to the End of an Array in Java

## Overview

This project demonstrates three approaches to moving all zeros to the end of an integer array while maintaining the relative order of non-zero elements.

The original array is modified in place without creating another array.

## Problem Statement

Given an integer array, move all zeros to the end while preserving the order of non-zero elements.

**Example**

Input:
```text
[1, 0, 2, 0, 3]
```

Output:
```text
[1, 2, 3, 0, 0]
```

## Approach 1: Two Passes — Copy and Fill

### Logic
1. Initialize `j = 0`.
2. Traverse the array using `i`.
3. Copy every non-zero element to index `j` and increment `j`.
4. Fill all remaining positions with zeros using a second loop.

### Example
Input:
```text
[1, 0, 2, 0, 3]
```

Output:
```text
1 2 3 0 0
```

### Complexity
- Time Complexity: `O(n)`
- Auxiliary Space: `O(1)`

**Class name:** `MoveZerosToTheEndTwoPointer`

## Approach 2: Single Loop — Copy and Clear

### Logic
1. Initialize `j = 0`.
2. Traverse the array using `i`.
3. When a non-zero element is found, copy it to `arr[j]`.
4. If `i != j`, set the original position `arr[i]` to zero.
5. Increment `j`.

### Example
Input:
```text
[1, 0, 2, 0, 3]
```

Output:
```text
1 2 3 0 0
```

### Complexity
- Time Complexity: `O(n)`
- Auxiliary Space: `O(1)`

**Class name:** `MoveZerosToTheEndSingleloop`

## Approach 3: Single Loop — Swap Using a Temporary Variable

### Logic
1. Initialize `j = 0`.
2. Traverse the array using `i`.
3. If `arr[i]` is non-zero, swap `arr[i]` with `arr[j]` using a temporary variable.
4. Increment `j`.
5. Continue until the array has been traversed.

### Example
Input:
```text
[1, 0, 2, 0, 3]
```

Output:
```text
1 2 3 0 0
```

### Complexity
- Time Complexity: `O(n)`
- Auxiliary Space: `O(1)`

**Class name:** `MoveZerosToTheEndUsingTempVar`

## Comparison of All Three Approaches

| Feature | Two Passes | Copy and Clear | Swap Using Temp |
|---|---|---|---|
| Traversals | Two | One | One |
| Time Complexity | `O(n)` | `O(n)` | `O(n)` |
| Auxiliary Space | `O(1)` | `O(1)` | `O(1)` |
| Preserves non-zero order | Yes | Yes | Yes |
| Creates another array | No | No | No |

## Concepts Learned
- Java arrays and loops
- Two-pointer technique
- Swapping elements
- In-place array modification
- Maintaining relative order
- Time and auxiliary space complexity

## Conclusion

All three approaches move zeros to the end in linear time and constant auxiliary space. The two-pass approach is straightforward, while the single-loop approaches accomplish the task in one traversal. The swapping approach is a clean and common interview solution.
