package Heap.PracticeProblems;

import Heap.MinHeap;

public class Problem3
{
    public void alternateMaxMin(int[] arr)
    {
        MinHeap org = new MinHeap(arr.length);
        MinHeap fHalf = new MinHeap(arr.length/2);
        MinHeap lHalf = new MinHeap(arr.length/2);

        for(int i = 0; i < arr.length; i++)
        {
            org.insert(arr[i]);
        }

        for(int i = 0; i < arr.length/2; i++)
        {
            fHalf.insert(org.extractMin());
        }

        for(int i = 0; i < arr.length/2; i++)
        {
            lHalf.insert(org.extractMin());
        }

        for(int i = 0; i < arr.length; i+=2)
        {
            arr[i] = fHalf.extractMin();
        }

        for(int i = arr.length-1; i > 0; i-=2)
        {
            arr[i] = lHalf.extractMin();
        }
    }    
}
