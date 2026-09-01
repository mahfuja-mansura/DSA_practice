package Heap.PracticeProblems;

import java.util.Arrays;

public class Tester3
{
    public static void main(String[]args)
    {
        int[] arr1 = {5,7,1,3,4,10};
        int[] arr2 = {5,4,3,-2,6,-4,9,1};
        
        System.out.println("========== Before Test ==========");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Problem3 test1 = new Problem3();
        test1.alternateMaxMin(arr1);
        
        Problem3 test2 = new Problem3();
        test2.alternateMaxMin(arr2);

        System.out.println("========== After Test ==========");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }    
}
