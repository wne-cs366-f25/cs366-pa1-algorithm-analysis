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

[your answer here]

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

[your answer here]

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

[your answer here]

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

[your answer here]

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

[your answer here]

---

## Algorithm 6 Analysis (Bonus - Optional)

input positive int n

**Pseudocode:**
```
p = 1
for i = 1 to n
  for j = 1 to i
    for k = 1 to j
      p = p * (i + j + k)
```

[your answer here]