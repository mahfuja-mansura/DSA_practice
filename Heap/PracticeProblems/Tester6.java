package Heap.PracticeProblems;

import java.util.Arrays;

public class Tester6
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 3, -1, -3, 5, 3, 6};
        int k = 3;

        int[] result = Problem6.scanMaxInGroup(numbers, k);

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("K: " + k);
        System.out.println("Result: " + Arrays.toString(result));
    }    
}
