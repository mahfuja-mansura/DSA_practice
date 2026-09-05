package Graphs.Assignment;
import Graphs.GraphUtils.AdjLL;
import Graphs.GraphUtils.EdgeNode;
public class task_2b
{
    public static void main(String[]args)
    {
        int vNum = 11;
        EdgeNode [] adjList = new EdgeNode [vNum];
        AdjLL.addEdgeUnd(adjList, 1, 2, 77);
        AdjLL.addEdgeUnd(adjList, 1, 3, 46);
        AdjLL.addEdgeUnd(adjList, 1, 4, 44);
        AdjLL.addEdgeUnd(adjList, 2, 3, 17);
        AdjLL.addEdgeUnd(adjList, 3, 4, 67);
        AdjLL.addEdgeUnd(adjList, 3, 5, 99);
        AdjLL.addEdgeUnd(adjList, 3, 6, 18);
        AdjLL.addEdgeUnd(adjList, 3, 7, 97);
        AdjLL.addEdgeUnd(adjList, 4, 7, 71);
        AdjLL.addEdgeUnd(adjList, 5, 8, 36);
        AdjLL.addEdgeUnd(adjList, 6, 9, 22);
        AdjLL.addEdgeUnd(adjList, 6, 10, 55);
        AdjLL.addEdgeUnd(adjList, 7, 9, 49);
        maxWeightSum(adjList);
    }

     public static void maxWeightSum(EdgeNode[] adjList)
    {
        int[] sum_arr = new int [adjList.length];
        int max = -1;
        int  vertex = 0;
        for(int i = 1; i < adjList.length; i++)
        {
            EdgeNode temp = adjList[i];
            while (temp!=null)
            {
                sum_arr[i] += temp.weight;
                temp = temp.next;
            }
        }
        for(int k = 1; k < sum_arr.length; k++)
        {
            if(max<sum_arr[k])
            {
                max = sum_arr[k];
                vertex = k;
            }
        }
        
        System.out.println("Vertex with maximum weight sum is: " + vertex);
        System.out.println("Total weight is " + max);
    }
}
