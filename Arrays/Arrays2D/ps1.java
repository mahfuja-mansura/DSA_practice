package Arrays2D;

public class ps1
{
    public static int[][] blockEnergySum(int[][]grid, String[][]directions)
    {
        int[][]energy = new int [grid.length][grid[0].length];
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                int sum = 0;
                int n = i;
                int m = j;
                if(directions[i][j]=="SE")
                {
                    //int n = i;
                    //int m = j;
                    while(n<row && m<row)
                    {
                        sum += grid[n][m];
                        n++;
                        m++;
                    }
                    //energy[i][j] = sum;
                }
                else if(directions[i][j]=="NW")
                {
                    while(n>=0 && m>=0)
                    {
                        sum += grid[n][m];
                        n--;
                        m--;
                    }
                }
                else if(directions[i][j]=="SW")
                {
                    while(n<row && m>=0)
                    {
                        sum += grid[n][m];
                        n++;
                        m--;
                    }
                }
                else if(directions[i][j]=="NE")
                {
                    while(n>=0 && m<row)
                    {
                        sum += grid[n][m];
                        n--;
                        m++;
                    }
                }
                energy[i][j] = sum;
            }
        }
        return energy;
    } 
    public static void main(String[]args)
    {
        int[][]grid = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        String[][]directions = {{"SE","SE","SW","NE"},{"SW","SW","NE","SE"},{"NW","SW","NE","NW"},{"SE","NW","SW","NE"}};   
        //blockEnergySum(grid,directions);
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                System.out.print(blockEnergySum(grid,directions)[i][j] + " ");
            }
            System.out.println(" ");
        }

    }    
}
