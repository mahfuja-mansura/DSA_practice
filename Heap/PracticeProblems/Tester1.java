package Heap.PracticeProblems;

public class Tester1
{
    public static void main(String[] args)
    {
        Problem1 test = new Problem1();

        // Test Case 1
        int[] A1 = {4, 7, 2, 6};
        int[] B1 = {9, 1, 3, 8};
        int k1 = 3;

        int result1 = test.kThMinimumPairSum(A1, B1, k1);

        System.out.println("Test Case 1");
        System.out.println("A = [4, 7, 2, 6]");
        System.out.println("B = [9, 1, 3, 8]");
        System.out.println("k = " + k1);
        System.out.println("Result = " + result1);


        // Test Case 2
        int[] A2 = {3, -2, 7, 1, -5, 4};
        int[] B2 = {6, -1, 2, -3, 8, 0};
        int k2 = 4;

        int result2 = test.kThMinimumPairSum(A2, B2, k2);

        System.out.println("\nTest Case 2");
        System.out.println("A = [3, -2, 7, 1, -5, 4]");
        System.out.println("B = [6, -1, 2, -3, 8, 0]");
        System.out.println("k = " + k2);
        System.out.println("Result = " + result2);
    }
}
