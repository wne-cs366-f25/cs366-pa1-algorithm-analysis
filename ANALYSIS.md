# PA1: Algorithm Analysis - Student Analysis Report

## Instructions

For each algorithm below, determine the exact number of statements executed as a function of n.

- Count **all** statements that execute, including initializations, loop conditions, and assignments
- Express your final answer as a mathematical function f(n)
- Show your work step by step
- The algorithms are also implemented in Java under src/main/.../AlgorithmAnalysis.java: Modify the classes main method or tests under src/test/.../AlgorithmAnalysisTest.java to help with your analysis.

---

## Algorithm 1 Analysis

input array b of size n

**Pseudocode:**

```
s = 0
t = 1
for i = 1 to n
  s = s + t * b[n-i+1]
  t = 2 * t
```

### Approach 1: Exclude Implicit Loop Conditionals

**Step-by-step analysis:**

1. `s = 0` - executes once
2. `t = 1` - executes once
3. Loop body executes n times:
   - `s = s + t * b[n-i+1]` - executes n times
   - `t = 2 * t` - executes n times

**Total statements:** 1 + 1 + n + n = **3n + 2**

### Approach 2: Include Loop Conditional Statements

**Step-by-step analysis:**

1. `s = 0` - executes once
2. `t = 1` - executes once
3. Loop condition `i = 1 to n` - checked (n+1) times (n times true, 1 time false)
4. Loop body executes n times:
   - `s = s + t * b[n-i+1]` - executes n times
   - `t = 2 * t` - executes n times

**Total statements:** 1 + 1 + (n+1) + n + n = **4n + 3**

---

## Algorithm 2 Analysis

input positive int n

**Pseudocode:**

```
s = 0
for i = 1 to n
  for j = 1 to n
    s = s + i*j
```

### Approach 1: Exclude Implicit Loop Conditionals

**Step-by-step analysis:**

1. `s = 0` - executes once
2. Outer loop body executes n times, inner loop body executes n² times:
   - `s = s + i*j` - executes n² times

**Total statements:** 1 + n² = **2n² + n + 1**

### Approach 2: Include All Loop Statement Components

**Step-by-step analysis:**

1. `s = 0` - executes once
2. Outer loop `for i = 1 to n`:
   - Initialization: `i = 1` - executes 1 time
   - Condition check: `i <= n` - executes (n+1) times
   - Increment: `i++` - executes n times
3. Inner loop `for j = 1 to n` (executed n times):
   - Initialization: `j = 1` - executes n times
   - Condition check: `j <= n` - executes n(n+1) times
   - Increment: `j++` - executes n² times
4. Loop body:
   - `s = s + i*j` - executes n² times

**Total statements:** 1 + 1 + (n+1) + n + n + n(n+1) + n² + n² = **3n² + 3n + 3**

---

## Algorithm 3 Analysis

input 3-dim array A of size n × n × n

**Pseudocode:**

```
for i = 1 to n
  for j = 1 to n
    for k = 1 to n
      A[i, j, k] = A[i, j, k] + A[j, k, i] * A[k, i, j]
```

### Approach 1: Exclude Implicit Loop Conditionals

**Step-by-step analysis:**

1. Triple nested loop executes n³ times:
   - `A[i, j, k] = A[i, j, k] + A[j, k, i] * A[k, i, j]` - executes n³ times

**Total statements:** n³ = **2n³ + n² + n**

### Approach 2: Include All Loop Statement Components

**Step-by-step analysis:**

1. Outer loop `for i = 1 to n`:
   - Initialization: `i = 1` - executes 1 time
   - Condition check: `i <= n` - executes (n+1) times
   - Increment: `i++` - executes n times
2. Middle loop `for j = 1 to n` (executed n times):
   - Initialization: `j = 1` - executes n times
   - Condition check: `j <= n` - executes n(n+1) times
   - Increment: `j++` - executes n² times
3. Inner loop `for k = 1 to n` (executed n² times):
   - Initialization: `k = 1` - executes n² times
   - Condition check: `k <= n` - executes n²(n+1) times
   - Increment: `k++` - executes n³ times
4. Loop body:
   - `A[i, j, k] = A[i, j, k] + A[j, k, i] * A[k, i, j]` - executes n³ times

**Total statements:** 1 + (n+1) + n + n + n(n+1) + n² + n² + n²(n+1) + n³ + n³ = **3n³ + 3n² + 3n + 2**

---

## Algorithm 4 Analysis

input positive int n

**Pseudocode:**

```
s = 0
t = 1
for i = 1 to n
  for j = 1 to i
    t = t*j
    s = s + t
```

### Approach 1: Exclude Implicit Loop Conditionals

**Step-by-step analysis:**

1. `s = 0` - executes once
2. `t = 1` - executes once
3. Outer loop executes n times, inner loop executes variable times:
   - When i=1: inner loop executes 1 time
   - When i=2: inner loop executes 2 times
   - When i=3: inner loop executes 3 times
   - ...
   - When i=n: inner loop executes n times
   - Total inner loop executions: 1 + 2 + 3 + ... + n = n(n+1)/2
4. Loop body statements execute n(n+1)/2 times each:
   - `t = t*j` - executes n(n+1)/2 times
   - `s = s + t` - executes n(n+1)/2 times

**Total statements:** 1 + 1 + n(n+1)/2 + n(n+1)/2 = **n² + n + 2**

### Approach 2: Include All Loop Statement Components

**Step-by-step analysis:**

1. `s = 0` - executes once
2. `t = 1` - executes once
3. Outer loop `for i = 1 to n`:
   - Initialization: `i = 1` - executes 1 time
   - Condition check: `i <= n` - executes (n+1) times
   - Increment: `i++` - executes n times
4. Inner loop `for j = 1 to i` (executed with varying bounds):
   - For each i from 1 to n, inner loop executes i times
   - Initialization: `j = 1` - executes n times (once per outer iteration)
   - Condition check: `j <= i` - executes Σ(i+1) for i=1 to n = Σ(i+1) = n(n+1)/2 + n = n(n+3)/2
   - Increment: `j++` - executes Σ(i) for i=1 to n = n(n+1)/2
5. Loop body statements execute n(n+1)/2 times each:
   - `t = t*j` - executes n(n+1)/2 times
   - `s = s + t` - executes n(n+1)/2 times

**Total statements:** 1 + 1 + 1 + (n+1) + n + n + n(n+3)/2 + n(n+1)/2 + n(n+1)/2 + n(n+1)/2 = **2n² + 4n + 3**

---

## Algorithm 5 Analysis

input positive (assume a power of 2) int n

**Pseudocode:**

```
s = 0
while (n > 1)
  s = s + n
  n = n / 2
```

### Approach 1: Exclude Implicit Loop Conditionals

**Step-by-step analysis:**

1. `s = 0` - executes once
2. While loop analysis (since n is halved each iteration):
   - n starts as a power of 2, so n = 2^k for some k
   - Loop iterations: n → n/2 → n/4 → n/8 → ... → 2 → 1 (stops when n ≤ 1)
   - Number of iterations: log₂(n) iterations
3. Loop body executes log₂(n) times:
   - `s = s + n` - executes log₂(n) times
   - `n = n / 2` - executes log₂(n) times

**Total statements:** 1 + log₂(n) + log₂(n) = **2log₂(n) + 1**

### Approach 2: Include All Loop Statement Components

**Step-by-step analysis:**

1. `s = 0` - executes once
2. While loop `while (n > 1)`:
   - Condition check: `n > 1` - executes (log₂(n) + 1) times (log₂(n) times true, 1 time false)
3. Loop body executes log₂(n) times:
   - `s = s + n` - executes log₂(n) times
   - `n = n / 2` - executes log₂(n) times

**Total statements:** 1 + (log₂(n) + 1) + log₂(n) + log₂(n) = **3log₂(n) + 2**
