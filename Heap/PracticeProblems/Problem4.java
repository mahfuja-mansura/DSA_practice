package Heap.PracticeProblems;

import Heap.MaxHeap;

public class Problem4
{
    public static void urgent_task(int[] tasks, int deadline)
    {
        MaxHeap hp = new MaxHeap(tasks.length);
        int completed = 0;

        for(int i = 0; i < tasks.length; i++)
        {
            hp.insert(tasks[i]);
        }

        for(int i = 1; i <= deadline; i++)
        {
            System.out.println("Day " + i + " - " + "Urgency " + hp.extractMax());
            completed++;
        }
        System.out.println();
        System.out.println("Taska completed: " + completed);
        System.out.println("Task ignored: " + (tasks.length- completed));
    }    
}
