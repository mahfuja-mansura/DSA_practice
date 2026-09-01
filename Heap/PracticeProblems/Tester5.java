package Heap.PracticeProblems;

import Heap.MaxHeap;

public class Tester5
{
    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap(10);

        heap.insert(15);
        heap.insert(8);
        heap.insert(10);
        heap.insert(6);
        heap.insert(7);
        heap.insert(3);
        heap.insert(2);

        System.out.println("Before: ");
        heap.printHeap();

        MaxHeap result = Problem5.evenMax(heap);

        System.out.println("After: ");
        result.printHeap();
    }    
}
