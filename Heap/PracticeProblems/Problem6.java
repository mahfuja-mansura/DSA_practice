package Heap.PracticeProblems;

import Heap.MaxHeap;

public class Problem6
{
    public static int[] scanMaxInGroup(int[] numbers, int k)
    {
        MaxHeap group = new MaxHeap(k);
        MaxHeap max = new MaxHeap(numbers.length);

        for(int i = 0; i <= numbers.length-k; i++)
        {
            int j = i;
            while(group.getSize()!=k)
            {
                group.insert(numbers[j++]);
            }
            max.insert(group.extractMax());
            while (!group.isEmpty())
            {
                group.extractMax();    
            }
        }
        int[] result = new int[max.getSize()];
        for(int i = result.length-1; i >= 0 ; i--)
        {
            result[i] = max.extractMax();
        }
        return result;
    }    
}
