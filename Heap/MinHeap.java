package Heap;

public class MinHeap 
{
    private Integer[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity)
    {
        this.capacity = capacity;
        size = 0;
        heap = new Integer[capacity+1]; 
    }

    private int parent(int indx)
    {
        return indx/2;
    }

    private int lChild(int indx)
    {
        return 2*indx;
    }

    private int rChild(int indx)
    {
        return 2*indx+1;
    }

    private void swap(int i, int j)
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
        return;
    }

    private void swim(int indx)
    {
        if(indx>1 && heap[indx]<heap[parent(indx)])
        {
            swap(indx, parent(indx));
            swim(parent(indx));
        }     
    }
    
    private Integer peek()
    {
        if(isEmpty())
        {
            System.out.println("Heap is Empty!");
            return null;
        }
        return heap[1];
    }
    private void sink(int indx)
    {
        int smallest = indx;
        if(lChild(indx)<=size && heap[lChild(indx)]<heap[smallest])
        {
            smallest = lChild(indx);
        }
        if(rChild(indx)<=size && heap[rChild(indx)]<heap[smallest])
        {
           smallest = rChild(indx);
        }
        if(smallest!=indx)
        {
            swap(smallest,indx);
            sink(smallest);
        }

    }
    public void insert(int value)
    {
        if(size>=capacity)
        {
            System.out.println("Heap is full!");
            return;
        }
        heap[++size] = value;
        swim(size);
    }

    public Integer extractMin()
    {
        if(isEmpty())
        {
            System.out.println("Heap is empty!");
            return null;
        }
        int value = peek();
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        sink(1);
        return value;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void printHeap()
    {
        for(int i = 1; i <= size; i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    } 
}
