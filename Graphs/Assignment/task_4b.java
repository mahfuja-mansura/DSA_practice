package Graphs.Assignment;

import Graphs.GraphUtils.AdjLL;
import Graphs.GraphUtils.EdgeNode;

public class task_4b
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
        convertIntoUndirected(adjList);
    }
    public static void convertIntoUndirected(EdgeNode[]adjList)
    {
       
        for(int i = 1; i < adjList.length; i++)
        {
            EdgeNode temp = adjList[i];
            while (temp!=null)
            {
                EdgeNode newNode = new EdgeNode(i, temp.weight);
                if(adjList[temp.toV]==null)
                {
                    adjList[temp.toV] = newNode;
                }
                else
                {
                    AdjLL.apendLL(adjList[temp.toV], newNode);
                }
                temp = temp.next;
            }
        }
        AdjLL.showLL(adjList);
    }
}
