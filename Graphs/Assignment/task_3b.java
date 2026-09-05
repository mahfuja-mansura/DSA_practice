package Graphs.Assignment;

import Graphs.GraphUtils.AdjLL;
import Graphs.GraphUtils.EdgeNode;

public class task_3b
{
    public static void main(String[]args)
    {
        int vNum = 11;
        EdgeNode [] adjList = new EdgeNode [vNum];

        AdjLL.addEdgeDir(adjList, 1, 2, 77);
        AdjLL.addEdgeDir(adjList, 1, 3, 46);
        AdjLL.addEdgeDir(adjList, 1, 4, 44);
        AdjLL.addEdgeDir(adjList, 2, 3, 17);
        AdjLL.addEdgeDir(adjList, 3, 5, 99);
        AdjLL.addEdgeDir(adjList, 3, 6, 18);
        AdjLL.addEdgeDir(adjList, 3, 7, 97);
        AdjLL.addEdgeDir(adjList, 4, 3, 67);
        AdjLL.addEdgeDir(adjList, 4, 7, 71);
        AdjLL.addEdgeDir(adjList, 5, 8, 36);
        AdjLL.addEdgeDir(adjList, 6, 9, 22);
        AdjLL.addEdgeDir(adjList, 6, 10, 55);
        AdjLL.addEdgeDir(adjList, 7, 9, 49);
        maxDegree(adjList);
        task_2b.maxWeightSum(adjList);

    }
    
     public static void maxDegree(EdgeNode[] adjList)
    {
        int[] degree = new int [adjList.length];
        int max = -1;
        int  vertex = 0;
        for(int i = 1; i < adjList.length; i++)
        {
            EdgeNode temp = adjList[i];
            while (temp!=null)
            {
                degree[i]++;
                temp = temp.next;
            }
        }
        for(int k = 1; k < degree.length; k++)
        {
            if(max<degree[k])
            {
                max = degree[k];
                vertex = k;
            }
        }
        
        System.out.println("Vertex with maximum weight sum is: " + vertex);
        System.out.println("Total weight is " + max);
    }
}
