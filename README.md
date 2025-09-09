# PA1: Algorithm Analysis Practice

## Overview

In this assignment, you will analyze the exact number of statements executed by various algorithms and express your results as mathematical functions of the input size n.

## Learning Objectives

By completing this assignment, you will:

- **Master statement counting**: Learn to count every statement execution in algorithms
- **Understand growth patterns**: See how different algorithmic structures lead to different growth rates
- **Practice mathematical analysis**: Express algorithm complexity as precise mathematical functions
- **Verify theoretical analysis**: Use code execution traces to validate your mathematical work
- **Connect theory to practice**: Bridge the gap between abstract analysis and concrete implementation

## Assignment Setup

### Option 1: DevContainer (Recommended)

1. Download and extract the PA1 starter code zip file
2. Open the folder in VS Code
3. When prompted, click "Reopen in Container"
4. Wait for the container to build (first time setup)
5. The Java 21 development environment will be automatically configured

### Option 2: Local Development

**Requirements:**

- Java 21 or higher
- Gradle (or use included wrapper)
- Git (optional)

**Verify setup:**

```bash
java -version
./gradlew --version
```

## Your Task

Analyze algorithms 1-5 from the provided pseudocode and determine the **exact number of statements executed** as a function of n.

### What to Count

Count **every statement that executes**, including:

- Variable initializations (`s = 0`, `t = 1`)
- Loop body statements (`s = s + t * b[i]`)
- Array assignments (`A[i,j,k] = ...`)

**Do NOT count:**

- Loop condition checks
- Function calls or returns
- Comments or blank lines

### Understanding the Algorithms

Each algorithm is provided as pseudocode in the assignment PDF and implemented in Java with detailed logging. The Java implementations help you:

1. **See execution traces**: Every iteration prints its work
2. **Verify statement counts**: Actual counts are displayed
3. **Test different input sizes**: Run with various values of n
4. **Understand the patterns**: See how growth changes with n

## Getting Started

### Step 1: Run the Test Suite

The comprehensive test suite shows detailed execution traces for all algorithms:

```bash
./gradlew test
```

This will run all algorithms with various input sizes and print detailed execution information including:

- Every loop iteration
- Variable values at each step
- Statement counts for verification
- Expected vs actual results

### Step 2: Experiment with Individual Cases

Use the main method for additional testing:

```bash
./gradlew run
```

You can modify the main method in `AlgorithmAnalysis.java` to test specific cases or input sizes.

### Step 3: Complete Your Analysis

Fill out the `ANALYSIS.md` file with **step-by-step explaination** and a **final f(n) function** expressing the exact statement count for each algorithm.

## The Algorithms

### Algorithm 1: Linear Processing with Powers of 2

- **Pattern**: Simple loop with array access
- **Key insight**: Each iteration does the same amount of work

### Algorithm 2: Double Nested Loops

- **Pattern**: Every combination of i and j from 1 to n
- **Key insight**: Inner loop always executes n times

### Algorithm 3: Triple Nested Loops

- **Pattern**: Three-dimensional processing
- **Key insight**: Cubic growth pattern

### Algorithm 4: Triangular Nested Loops

- **Pattern**: Inner loop bound depends on outer loop variable
- **Key insight**: Not all nested loops are equal!

### Algorithm 5: Logarithmic While Loop

- **Pattern**: Repeatedly divide input by 2
- **Key insight**: How many times can you halve n?


## Example Analysis Workflow

For Algorithm 1:

1. **Read the pseudocode** and understand what it does
2. **Run the test** and observe the execution trace
3. **Count initialization statements**: `s = 0` and `t = 1` → 2 statements
4. **Analyze the loop**: executes n times, 2 statements per iteration → 2n statements
5. **Combine**: f₁(n) = 2 + 2n

## Submission Instructions

### Creating Your Submission

1. **Complete `ANALYSIS.md`** with your mathematical analysis
2. **Test your work** using `./gradlew test` to verify your functions
3. **Create submission file** using one of these methods:

#### Method 1: DevContainer (Recommended)

```bash
tar -czf pa1-YOURNAME.zip /workspace
```

Then download the file from the container.

#### Method 2: Local Development

Right-click the assignment folder and compress to ZIP.

### What to Submit

Your compressed file should contain:

- `ANALYSIS.md` - **Your completed mathematical analysis**
- All original starter code files (unchanged Java files are fine)
- Any additional test cases you created (optional)

**Important**: The Java implementations are provided to help your analysis - you don't need to modify them unless you want to test additional cases.

## Grading Criteria

- **Submission (33.3%):** Work made available to instructoras required by submission guidelines. Software artifacts are located and named as specified in the assignment.
- **Completeness (33.3%):** All problems are attempted. Incomplete problems are also incorrect.
- **Correctness (33.3%):** Work demonstrates a clear understanding of the material.

## Getting Help

- **Office Hours**: Tuesday & Wednesday 12:30-1:30 PM (Herman 207)
- **Syllabot**: Use the course AI assistant for conceptual questions
- **Discussion**: Talk through approaches with classmates (but write your own analysis)

## Academic Integrity

This is an **individual assignment**. You may:

- Discuss approaches and concepts with classmates
- Use course materials and textbook
- Ask questions during office hours
- Use the provided Java code to understand the algorithms

You may **NOT**:

- Copy analysis from other students
- Use AI tools to generate mathematical solutions
- Submit work you don't understand
- Share your completed ANALYSIS.md file

The goal is to understand why these algorithms have different growth patterns and develop skills in systematic algorithm analysis.

---

_Course content developed by Declan Gray-Mullen for WNEU with Claude_
