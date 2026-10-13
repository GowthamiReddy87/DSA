#  Java DSA: Array Rotation

## Overview

This repository contains four Java programs for rotating arrays to the left and right. It covers both the basic approach using repeated shifting and the optimized approach using the reversal algorithm.

## Problems Covered

### 1. Left Rotation by K Positions — Basic Approach

**Concept:** Move the first element to the end of the array, repeating the process `k` times.

**Example:**
- Input: `[1, 2, 3, 4, 5]`, `k = 3`
- Output: `[4, 5, 1, 2, 3]`

**Complexity:**
- Time: `O(n × k)`
- Extra Space: `O(1)`

### 2. Right Rotation by K Positions — Basic Approach

**Concept:** Move the last element to the beginning of the array, repeating the process `k` times.

**Example:**
- Input: `[10, 20, 30, 40, 50]`, `k = 2`
- Output: `[40, 50, 10, 20, 30]`

**Complexity:**
- Time: `O(n × k)`
- Extra Space: `O(1)`

### 3. Left Rotation by K Positions — Optimized Approach

**Concept:** Use the reversal algorithm:
1. Reverse the first `k` elements.
2. Reverse the remaining elements.
3. Reverse the entire array.

**Example:**
- Input: `[1, 2, 3, 4, 5]`, `k = 3`
- Output: `[4, 5, 1, 2, 3]`

**Complexity:**
- Time: `O(n)`
- Extra Space: `O(1)`

### 4. Right Rotation by K Positions — Optimized Approach

**Concept:** Use the reversal algorithm:
1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining elements.

**Example:**
- Input: `[1, 2, 3, 4, 5]`, `k = 2`
- Output: `[4, 5, 1, 2, 3]`

**Complexity:**
- Time: `O(n)`
- Extra Space: `O(1)`

## Comparison

| Approach | Time Complexity | Extra Space |
|---|---|---|
| Left rotation — basic | `O(n × k)` | `O(1)` |
| Right rotation — basic | `O(n × k)` | `O(1)` |
| Left rotation — optimized | `O(n)` | `O(1)` |
| Right rotation — optimized | `O(n)` | `O(1)` |

Here, `n` is the number of elements in the array and `k` is the number of rotation positions.

## Concepts Practiced

- Array traversal and indexing
- Left and right array rotation
- Nested loops
- Swapping elements using a temporary variable
- Reversal algorithm
- Time and space complexity analysis
- Optimizing a solution from `O(n × k)` to `O(n)`

## How to Run

1. Install the Java Development Kit (JDK).
2. Save each program in its own `.java` file, using the same name as its public class.
3. Open a terminal in the directory containing the files.
4. Compile and run a program:

```bash
javac ArrayRotation.java
java ArrayRotation
```

Replace `ArrayRotation.java` with the filename of the program you want to execute.

## Learning Outcome

Practiced four array rotation solutions and learned how the reversal algorithm improves performance while using constant extra space.
