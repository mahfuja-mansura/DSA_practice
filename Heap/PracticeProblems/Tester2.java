package Heap.PracticeProblems;

public class Tester2
{
    public static void main(String[] args)
    {
        Problem2 test = new Problem2();

        // -------------------------
        // Test Case 1
        // -------------------------
        int[] nums1 = {7, 2, 5, 12, 3, 8};
        int s1 = 2;

        int[] result1 = test.topAbsDiff(nums1, s1);

        System.out.println("Test Case 1:");
        System.out.println("nums = [7, 2, 5, 12, 3, 8]");
        System.out.println("S = " + s1);

        System.out.print("Result = ");
        for(int i = 0; i < result1.length; i++)
        {
            System.out.print(result1[i] + " ");
        }
        System.out.println();


        // -------------------------
        // Test Case 2
        // -------------------------
        int[] nums2 = {22, 5, 2, 49, 36, 1, 10, 15};
        int s2 = 3;

        int[] result2 = test.topAbsDiff(nums2, s2);

        System.out.println("\nTest Case 2:");
        System.out.println("nums = [22, 5, 2, 49, 36, 1, 10, 15]");
        System.out.println("S = " + s2);

        System.out.print("Result = ");
        for(int i = 0; i < result2.length; i++)
        {
            System.out.print(result2[i] + " ");
        }
        System.out.println();
    }    
}
