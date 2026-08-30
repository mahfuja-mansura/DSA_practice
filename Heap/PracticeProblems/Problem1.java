package Heap.PracticeProblems;

import Heap.MinHeap;

public class Problem1
{
   public int kThMinimumPairSum(int[]a, int[]b, int k)
   {
    MinHeap hpA = new MinHeap(a.length);
    MinHeap hpB = new MinHeap(b.length);

    for(int i = 0; i < a.length; i++)
    {
        hpA.insert(a[i]);
        hpB.insert(b[i]);
    }
    int result = 0;
   for(int i = 1; i <=k; i++)
   {
    result = hpA.extractMin()+hpB.extractMin();
   }
   return result;
   } 
}
