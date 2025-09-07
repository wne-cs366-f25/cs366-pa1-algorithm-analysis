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

Analyze algorithms 1-5 (algorithm 6 is optional bonus) from the provided pseudocode and determine the **exact number of statements executed** as a function of n.

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

Fill out the `ANALYSIS.md` file with:

1. **Step-by-step mathematical analysis** for each algorithm
2. **Final f(n) functions** expressing exact statement counts
3. **Verification** using test output
4. **Reflection questions** about growth rates and patterns

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

### Algorithm 6: Triple Triangular Loops (Bonus)
- **Pattern**: Three levels of triangular nesting
- **Key insight**: Very fast growth rate

## Example Analysis Workflow

For Algorithm 1:

1. **Read the pseudocode** and understand what it does
2. **Run the test** and observe the execution trace
3. **Count initialization statements**: `s = 0` and `t = 1` → 2 statements
4. **Analyze the loop**: executes n times, 2 statements per iteration → 2n statements  
5. **Combine**: f₁(n) = 2 + 2n
6. **Verify**: Check that f₁(1) = 4, f₁(2) = 6, f₁(4) = 10 match test output

## Submission Instructions

### Creating Your Submission

1. **Complete `ANALYSIS.md`** with your mathematical analysis
2. **Test your work** using `./gradlew test` to verify your functions
3. **Create submission file** using one of these methods:

#### Method 1: DevContainer (Recommended)
```bash
tar -czf pa1-YOURNAME.tar.gz /workspace
```
Then download the file from the container.

#### Method 2: Local Development
Right-click the assignment folder and compress to ZIP, or use:
```bash
zip -r pa1-YOURNAME.zip .
```

### What to Submit

Your compressed file should contain:
- `ANALYSIS.md` - **Your completed mathematical analysis** 
- All original starter code files (unchanged Java files are fine)
- Any additional test cases you created (optional)

**Important**: The Java implementations are provided to help your analysis - you don't need to modify them unless you want to test additional cases.

## Grading Criteria

- **Mathematical Analysis (60%)**: Correct f(n) functions for algorithms 1-5
- **Show Your Work (25%)**: Clear step-by-step analysis in ANALYSIS.md  
- **Verification (10%)**: Using test output to check your answers
- **Reflection (5%)**: Thoughtful answers to reflection questions
- **Bonus**: Algorithm 6 analysis (up to 10% extra credit)

## Getting Help

### Understanding the Algorithms
- **Run the tests first**: `./gradlew test` shows exactly what each algorithm does
- **Start with small inputs**: Manually trace through n=1, n=2 cases
- **Use the pseudocode**: It's the authoritative source

### Mathematical Analysis  
- **Count systematically**: Don't skip any statements
- **Use summation formulas**: Remember ∑(i=1 to n) i = n(n+1)/2
- **Check your work**: Your f(n) should match the test output

### Technical Issues
- **Container won't start**: Try "Rebuild Container" in VS Code
- **Gradle errors**: Run `./gradlew clean` then `./gradlew test`
- **Java version**: Ensure Java 21+ with `java -version`

### Getting Course Help
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

## Important Dates

- **Assigned**: [Assignment Date]
- **Due**: September 18, 11:59 PM
- **Late Policy**: 10% per day, maximum 5 days

## Tips for Success

1. **Start early**: Algorithm analysis takes practice and reflection
2. **Use the test output**: It's your best verification tool  
3. **Think systematically**: Count every statement, every time it executes
4. **Check edge cases**: What happens when n=1? n=0?
5. **Show your work**: Partial credit is awarded for clear reasoning
6. **Break down complex algorithms**: Analyze them step by step

The goal is to understand why these algorithms have different growth patterns and develop skills in systematic algorithm analysis.

---

_Course content developed by Declan Gray-Mullen for WNEU with Claude_