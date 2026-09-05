public class AdjMatx
{
    public static int[][] createMatx(int n)
    {
        int[][] adjMatx = new int [n][n];
        return adjMatx; 
    }

    public static void addEdge(int[][]adjMatx, int m, int n, int weight)
    {
        adjMatx[m][n] = weight;
        adjMatx[n][m] = weight;
    }

    public static void printGrph(int[][]adjMatx)
    {
        for(int i = 0; i < adjMatx.length; i++)
        {
            for(int j = 0; j < adjMatx.length; j++)
            {
                System.out.println(adjMatx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
