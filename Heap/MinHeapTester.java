package Heap;

public class MinHeapTester
{
    public static void main(String[] args)
    {
        // Create a MinHeap with capacity 10
        MinHeap heap = new MinHeap(10);

        // -------------------------
        // Test isEmpty()
        // -------------------------
        System.out.println("Is heap empty? " + heap.isEmpty());


        // -------------------------
        // Test insert()
        // -------------------------
        System.out.println("\nInserting: 10, 5, 20, 3, 8");

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(3);
        heap.insert(8);

        System.out.print("Heap after insertion: ");
        heap.printHeap();


        // -------------------------
        // Test extractMin()
        // -------------------------
        System.out.println("\nExtracting minimum:");

        System.out.println("Extracted: " + heap.extractMin());

        System.out.print("Heap after extraction: ");
        heap.printHeap();

        System.out.println("Extracted: " + heap.extractMin());

        System.out.print("Heap after extraction: ");
        heap.printHeap();


        // -------------------------
        // Test insert again
        // -------------------------
        System.out.println("\nInserting 2 and 15:");

        heap.insert(2);
        heap.insert(15);

        System.out.print("Heap after insertion: ");
        heap.printHeap();


        // -------------------------
        // Extract everything
        // -------------------------
        System.out.println("\nExtracting all elements:");

        while(!heap.isEmpty())
        {
            System.out.println("Extracted: " + heap.extractMin());
        }


        // -------------------------
        // Test empty heap
        // -------------------------
        System.out.println("\nIs heap empty? " + heap.isEmpty());

        System.out.println("\nTrying to extract from empty heap:");
        System.out.println("Result: " + heap.extractMin());
    }
}
