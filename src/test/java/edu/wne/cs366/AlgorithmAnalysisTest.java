package edu.wne.cs366;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Test suite for Algorithm Analysis assignment.
 * 
 * Run with: ./gradlew test
 */
public class AlgorithmAnalysisTest {

    @Test
    @DisplayName("Algorithm 1: Array Processing")
    public void testAlgorithm1() {
        System.out.println("=== ALGORITHM 1 TEST CASES ===");
        
        int[] arr1 = {5};
        System.out.println("n=1:");
        AlgorithmAnalysis.algorithm1(arr1);
        
        int[] arr2 = {3, 7};
        System.out.println("\nn=2:");
        AlgorithmAnalysis.algorithm1(arr2);
        
        int[] arr4 = {1, 2, 3, 4};
        System.out.println("\nn=4:");
        AlgorithmAnalysis.algorithm1(arr4);
    }

    @Test
    @DisplayName("Algorithm 2: Double Nested Loops")  
    public void testAlgorithm2() {
        System.out.println("\n=== ALGORITHM 2 TEST CASES ===");
        
        System.out.println("n=1:");
        AlgorithmAnalysis.algorithm2(1);
        
        System.out.println("\nn=2:");
        AlgorithmAnalysis.algorithm2(2);
        
        System.out.println("\nn=3:");
        AlgorithmAnalysis.algorithm2(3);
    }

    @Test
    @DisplayName("Algorithm 3: Triple Nested Loops")
    public void testAlgorithm3() {
        System.out.println("\n=== ALGORITHM 3 TEST CASES ===");
        
        int[][][] arr1 = {{{5}}};
        System.out.println("n=1:");
        AlgorithmAnalysis.algorithm3(arr1);
        
        int[][][] arr2 = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        System.out.println("\nn=2:");
        AlgorithmAnalysis.algorithm3(arr2);
    }

    @Test
    @DisplayName("Algorithm 4: Triangular Nested Loops")
    public void testAlgorithm4() {
        System.out.println("\n=== ALGORITHM 4 TEST CASES ===");
        
        System.out.println("n=1:");
        AlgorithmAnalysis.algorithm4(1);
        
        System.out.println("\nn=2:");
        AlgorithmAnalysis.algorithm4(2);
        
        System.out.println("\nn=3:");
        AlgorithmAnalysis.algorithm4(3);
    }

    @Test
    @DisplayName("Algorithm 5: Logarithmic While Loop")
    public void testAlgorithm5() {
        System.out.println("\n=== ALGORITHM 5 TEST CASES ===");
        
        System.out.println("n=2:");
        AlgorithmAnalysis.algorithm5(2);
        
        System.out.println("\nn=4:");
        AlgorithmAnalysis.algorithm5(4);
        
        System.out.println("\nn=8:");
        AlgorithmAnalysis.algorithm5(8);
        
        System.out.println("\nn=16:");
        AlgorithmAnalysis.algorithm5(16);
    }

}