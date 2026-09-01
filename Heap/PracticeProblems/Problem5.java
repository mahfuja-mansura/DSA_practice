package Heap.PracticeProblems;

import Heap.MaxHeap;

public class Problem5
{
    public static MaxHeap evenMax( MaxHeap heap)
    {
        MaxHeap even = new MaxHeap(heap.getSize());
        int value = 0;
        int earlier = heap.getSize();
       while(!heap.isEmpty())
        {
            value = heap.extractMax();
            if(value%2==0)
            {
                even.insert(value);
            }
        }

        while(!even.isEmpty())
        {
            heap.insert(even.extractMax());
        }
        System.out.println("Discarded: " + (earlier-heap.getSize()));
        return heap;
    }    
}
