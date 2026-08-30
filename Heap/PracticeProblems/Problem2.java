package Heap.PracticeProblems;

import Heap.MinHeap;
import Heap.MaxHeap;

public class Problem2
{
    public int[] topAbsDiff(int[] nums, int s)
    {
        MinHeap odd = new MinHeap(nums.length/2);
        MinHeap even = new MinHeap(nums.length/2);
        MaxHeap diff = new MaxHeap(nums.length/2);
        int[] result = new int[s];
        int absDiff = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                even.insert(nums[i]);
            }
            else
            {
                odd.insert(nums[i]);
            }
        }
        for(int i = 0; i < nums.length/2; i++)
        {
            absDiff = odd.extractMin() - even.extractMin();
            if(absDiff<0)
            {
                diff.insert(-absDiff);
            }
            else
            {
                diff.insert(absDiff);
            }
        }
        for(int i = 0; i < s; i++)
        {
            result[i] = diff.extractMax();
        }
        return result;
    }    
}
