package edu.wne.cs366;

/**
 * PA1: Algorithm Analysis Practice
 * 
 * This class contains implementations of algorithms from the assignment PDF.
 * Each algorithm includes basic logging to help students verify their analysis.
 */
public class AlgorithmAnalysis {

    /**
     * Algorithm 1: input array b of size n
     * s = 0
     * t = 1
     * for i = 1 to n
     *   s = s + t * b[n-i+1]
     *   t = 2 * t
     * 
     * @param b input array of size n
     * @return the computed sum s
     */
    public static int algorithm1(int[] b) {
        if (b == null) throw new IllegalArgumentException("Array cannot be null");
        
        int n = b.length;
        int s = 0;
        int t = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Algorithm 1: i=" + i);
            s = s + t * b[n - i]; 
            t = 2 * t;
        }
        
        return s;
    }

    /**
     * Algorithm 2: input n
     * s = 0
     * for i = 1 to n
     *   for j = 1 to n
     *     s = s + i*j
     * 
     * @param n input size
     * @return the computed sum s
     */
    public static int algorithm2(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        
        int s = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Algorithm 2: i=" + i + ", j=" + j);
                s = s + i * j;
            }
        }
        
        return s;
    }

    /**
     * Algorithm 3: input 3-dim array A of size n × n × n
     * for i = 1 to n
     *   for j = 1 to n
     *     for k = 1 to n
     *       A[i, j, k] = A[i, j, k] + A[j, k, i] * A[k, i, j]
     * 
     * @param A 3D array of size n×n×n
     */
    public static void algorithm3(int[][][] A) {
        if (A == null) throw new IllegalArgumentException("Array cannot be null");
        
        int n = A.length;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.println("Algorithm 3: i=" + i + ", j=" + j + ", k=" + k);
                    
                    // Convert to 0-based indexing
                    int ii = i-1, jj = j-1, kk = k-1;
                    A[ii][jj][kk] = A[ii][jj][kk] + A[jj][kk][ii] * A[kk][ii][jj];
                }
            }
        }
    }

    /**
     * Algorithm 4: input n
     * s = 0
     * t = 1
     * for i = 1 to n
     *   for j = 1 to i
     *     t = t*j
     *     s = s + t
     * 
     * @param n input size
     * @return the computed sum s
     */
    public static long algorithm4(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        
        long s = 0;
        long t = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("Algorithm 4: i=" + i + ", j=" + j);
                t = t * j;
                s = s + t;
            }
        }
        
        return s;
    }

    /**
     * Algorithm 5: input n
     * s = 0
     * while (n > 1)
     *   s = s + n
     *   n = n / 2
     * 
     * @param n input size
     * @return the computed sum s
     */
    public static int algorithm5(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        
        int s = 0;
        
        while (n > 1) {
            System.out.println("Algorithm 5: n=" + n);
            s = s + n;
            n = n / 2;
        }
        
        return s;
    }


    /**
     * Simple main method for basic testing and experimentation.
     * Modify this method to test different inputs.
     */
    public static void main(String[] args) {
        System.out.println("PA1: Algorithm Analysis Practice");
        System.out.println("================================");
        System.out.println();
        
        // Example: Test Algorithm 1 with a small array
        int[] testArray = {1, 2, 3, 4};
        System.out.println("Testing Algorithm 1 with array [1, 2, 3, 4]:");
        algorithm1(testArray);
        
        System.out.println();
        System.out.println("Testing Algorithm 2 with n=3:");
        algorithm2(3);
    }
}