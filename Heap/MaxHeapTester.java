package Heap;

public class MaxHeapTester
{
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(7);
        maxHeap.insert(30);
        maxHeap.insert(15);

        System.out.println("Heap:");
        maxHeap.printHeap();

        System.out.println("Deleted Max: " + maxHeap.extractMax());

        System.out.println("Heap After Deletion:");
        maxHeap.printHeap();

       
    }
}    

