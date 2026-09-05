package Graphs.GraphUtils;

public class AdjLL
{
    public static void printLL(EdgeNode head)
    {
        EdgeNode curr = head;
        while(curr!=null)
        {
            System.out.println("=> (" + curr.toV + ", " + curr.weight + ") ");
        }
        System.out.println();
    }  
    
    
    public static void apendLL(EdgeNode head, EdgeNode eNode)
    {
        EdgeNode temp = head;
        while (temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = eNode;
    }

    public static void addEdgeDir(EdgeNode[] adjList, int from, int to, int weight)
    {
        EdgeNode newNode = new EdgeNode(to, weight);
        if(adjList[from]==null)
        {
            adjList[from] = newNode;
        }
        else
        {
            apendLL(adjList[from], newNode);
        }
    } 
    public static void addEdgeUnd(EdgeNode[] adjList, int from, int to, int weight)
    {
        EdgeNode newNode = new EdgeNode(to, weight);
        if(adjList[from]==null)
        {
            adjList[from] = newNode;
        }
        else
        {
            apendLL(adjList[from], newNode);
        }

        EdgeNode reverse = new EdgeNode(from, weight);
        if(adjList[to]==null)
        {
            adjList[to] = reverse;
        }
        else
        {
            apendLL(adjList[to], reverse);
        }
    } 
    
    public static void showLL(EdgeNode[] adjList)
    {
        for(int i = 0; i < adjList.length; i++)
        {
            System.out.println("Vertex: " + i + ": ");
            printLL(adjList[i]);
        }
    }
}
