package Graphs.Assignment;

import Graphs.GraphUtils.AdjMatx;

public class task_4a
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
        convertIntoUndirected(adjMatx);
        
    } 
    public static void convertIntoUndirected(int[][]adjMatx)
    {
        for(int i = 0; i < adjMatx.length; i++)
        {
            for(int j = 0; j < adjMatx.length;j++)
            {
                adjMatx[j][i] = adjMatx[i][j];
            }
        }
        AdjMatx.printGrph(adjMatx);
    }    
}
