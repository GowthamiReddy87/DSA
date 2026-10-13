# Find Missing Numbers in an Array – Java

## Overview

This repository contains four Java approaches to finding missing numbers in an array within the expected range from `1` to `n`.

The approaches covered are:

1. Sum Formula
2. Nested Loops
3. HashSet
4. Boolean Array

## 1. Missing Number Using Sum Formula

### Problem Statement

An array contains distinct numbers from `1` to `n`, with exactly one number missing. Find the missing number.

### Example

**Input:**
```text
arr = [1, 2, 3, 4]
```

**Expected range:** `1 to 5`

**Output:**
```text
5
```

### Approach

1. Calculate the expected sum using the formula `n * (n + 1) / 2`.
2. Calculate the actual sum of all array elements.
3. Subtract the actual sum from the expected sum.

**Formula:**

`Missing Number = Expected Sum - Actual Sum`

### Complexity

- Time Complexity: `O(n)`
- Auxiliary Space: `O(1)`

### Limitation

This approach works when exactly one number is missing and there are no duplicate elements in the array. For large values, use `long` to avoid integer overflow.

---

## 2. Missing Numbers Using Nested Loops

### Problem Statement

Given an array that may contain duplicates, find all missing numbers within the range from `1` to `n`.

### Example

**Input:**
```text
arr = [1, 2, 2, 4, 5]
n = 6
```

**Output:**
```text
3 6
```

### Approach

1. Iterate through every number from `1` to `n`.
2. Search for that number in the input array.
3. Use a Boolean variable named `found` to track whether the number exists.
4. If the number is not found, print it as a missing number.

### Complexity

Let `m` be the array length and `n` be the maximum number in the expected range.

- Time Complexity: `O(n * m)`
- Auxiliary Space: `O(1)`

### Advantages

- Simple and easy to understand.
- Works with sorted and unsorted arrays.
- Handles duplicate elements.
- Does not require an additional data structure.

---

## 3. Missing Numbers Using HashSet

### Problem Statement

Find all missing numbers in the range from `1` to `n` using a HashSet.

### Example

**Input:**
```text
arr = [1, 2, 2, 4, 5]
n = 6
```

**Output:**
```text
3 6
```

### Approach

1. Create a `HashSet<Integer>`.
2. Insert every array element into the HashSet.
3. Iterate from `1` to `n`.
4. Use `contains()` to check whether each number exists in the set.
5. Print numbers that are absent.

### Complexity

- Average Time Complexity: `O(m + n)`
- Auxiliary Space: `O(m)`

Here, `m` is the input array length and `n` is the range limit.

### Advantages

- Efficient for larger arrays.
- Automatically stores each distinct value only once.
- Handles duplicate elements and unsorted arrays.

### Limitation

A HashSet requires additional memory, and its iteration order is not guaranteed. In this program, missing numbers are printed in ascending order because the range is checked sequentially.

---

## 4. Missing Numbers Using Boolean Array

### Problem Statement

Find all missing numbers from `1` to `n` by tracking which numbers are present.

### Example

**Input:**
```text
arr = [1, 2, 2, 4, 5]
n = 6
```

**Output:**
```text
3 6
```

### Approach

1. Create a Boolean array of size `n + 1`.
2. Initially, all positions are `false`.
3. For each input number, mark `present[number] = true`.
4. Iterate through the range from `1` to `n`.
5. If `present[i]` is `false`, print that number.

### Complexity

- Time Complexity: `O(m + n)`
- Auxiliary Space: `O(n)`

Here, `m` is the input array length and `n` is the range limit.

### Advantages

- Faster than nested loops for large ranges when memory is available.
- Easy to implement.
- Handles duplicates and unsorted arrays.
- Produces missing numbers in ascending order.

### Limitation

The Boolean array uses extra memory proportional to the range limit. Each input value must also be within the valid range before using it as an array index.

---

## Comparison of All Four Approaches

| Approach | Time Complexity | Auxiliary Space | Handles Duplicates |
|---|---|---|---|
| Sum Formula | `O(n)` | `O(1)` | No |
| Nested Loops | `O(n * m)` | `O(1)` | Yes |
| HashSet | Average `O(m + n)` | `O(m)` | Yes |
| Boolean Array | `O(m + n)` | `O(n)` | Yes |

*Note: `m` represents the input array length, and `n` represents the upper limit of the expected range.*

## Key Learnings

- The sum formula is suitable when exactly one number is missing and the remaining values are distinct.
- Nested loops are simple but can be slow for large inputs.
- HashSet provides efficient membership checking using additional memory.
- A Boolean array offers efficient checking when the expected range is reasonably small.
- The best approach depends on the input constraints and available memory.

## Conclusion

These four approaches demonstrate different ways to solve missing-number problems in Java. Understanding their logic, time complexity, and space complexity helps in selecting the appropriate approach for coding interviews and DSA practice.
