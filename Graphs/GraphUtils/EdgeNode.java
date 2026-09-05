package Graphs.GraphUtils;
public class EdgeNode
{
    public int toV;
    public int weight;
    public EdgeNode next;
    public EdgeNode(int toV, int weight)
    {
        this.toV = toV;
        this.weight = weight;
        this. next = null; 
    }

}