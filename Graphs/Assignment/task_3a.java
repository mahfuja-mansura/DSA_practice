package Graphs.Assignment;

public class task_3a
{
    public static void main(String[]args)
    {
        int[][]adjMatx = {{0, 77, 46, 44,  0,  0,  0,  0,  0,  0}, 
                          {0,  0, 17,  0,  0,  0,  0,  0,  0,  0}, 
                          {0,  0,  0,  0, 99, 18, 97,  0,  0,  0}, 
                          {0,  0, 67,  0,  0,  0, 71,  0,  0,  0}, 
                          {0,  0,  0,  0,  0,  0,  0, 36,  0,  0}, 
                          {0,  0,  0,  0,  0,  0,  0,  0, 22, 55}, 
                          {0,  0,  0,  0,  0,  0,  0,  0, 49,  0}, 
                          {0,  0,  0,  0,  0,  0,  0,  0,  0,  0}, 
                          {0,  0,  0,  0,  0,  0,  0,  0,  0,  0}, 
                          {0,  0,  0,  0,  0,  0,  0,  0,  0,  0}};
        maxDegree(adjMatx);
        task_2a.maxWeightSum(adjMatx);
    } 
    public static void maxDegree(int[][] adjMatx)
    {
        int[] degree = new int [adjMatx.length]; 
        for(int i = 0; i < adjMatx.length; i++)
        {
            for(int j = 0; j< adjMatx.length; j++)
            {
                if(adjMatx[i][j]!=0)
                {
                    degree[i]++;
                }
            }
        }
        int max = -1;
        int vertex = 0;
        for(int k = 0; k < degree.length; k++)
        {
            if(max<degree[k])
            {
                max = degree[k];
                vertex = 1+k;
            }
        }
        System.out.println("Vertex with maximum Degree is: " + vertex);
        System.out.println("Total weight is " + max);
    }   
}
