package Graphs.Assignment;
public class task_2a
{
    public static void main(String[]args)
    {
        int[][]adjMatx={{0, 77, 46, 44,  0,  0,  0,  0,  0,  0}, 
                        {77,  0,  17,  0,  0,  0,  0,  0,  0,  0}, 
                        {46,  17,  0, 67, 99, 18, 97,  0,  0,  0}, 
                        {44,  0, 67,  0,  0,  0, 71,  0,  0,  0}, 
                        {0,  0, 99,  0,  0,  0,  0, 36,  0,  0}, 
                        {0,  0, 18,  0,  0,  0,  0,  0,  22, 55}, 
                        {0,  0, 97, 71,  0,  0,  0,  0, 49,  0}, 
                        {0,  0,  0,  0, 36,  0,  0,  0,  0,  0}, 
                        {0,  0,  0,  0,  0,  22, 49,  0,  0,  0}, 
                        {0,  0,  0,  0,  0, 55,  0,  0,  0,  0}}; 
        maxWeightSum(adjMatx);
       
    }
    public static void maxWeightSum(int[][] adjMatx)
    {
        int[] sum_arr = new int [adjMatx.length]; 
        for(int i = 0; i < adjMatx.length; i++)
        {
            for(int j = 0; j< adjMatx.length; j++)
            {
                sum_arr[i] += adjMatx[i][j];
            }
        }
        int max = -1;
        int vertex = 0;
        for(int k = 0; k < sum_arr.length; k++)
        {
            if(max<sum_arr[k])
            {
                max = sum_arr[k];
                vertex = 1+k;
            }
        }
        System.out.println("Vertex with maximum weight sum is: " + vertex);
        System.out.println("Total weight is " + max);
    }
}
