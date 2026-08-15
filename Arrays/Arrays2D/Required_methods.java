package Arrays2D;

import java.util.Scanner;

public class Required_methods
{
    Scanner input = new Scanner(System.in);
    
    //Method 1
    public void create_Array(int row, int col)
    {
        int[][]arr = new int [row][col];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        print_Array(arr, "row");
    }
    
    

    //Method 2
    public void print_Array(int[][]arr, String base)
    {
        int row = arr.length;
        int col = arr[0].length;

        if(base.equals("row"))
        {
            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
        else if(base.equals("col"))
        {
            for(int j = 0; j < col; j++)
            {
                for(int i = 0; i < row; i++)
                {
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println(" ");
            }
            
        }
    }



    //Method 3
    public int summation(int[][]arr, String base)
    {
        int row = arr.length;
        int col = arr[0].length;
        int sum = 0;
        int totSum = 0;
        if(base.equals("row"))
        {
            for(int i = 0; i < row; i++)
            {
                sum = 0;
                for(int j = 0; j < col; j++)
                {
                    sum += arr[i][j];
                }
                totSum += sum;
                System.out.println("Summation of the elements of row " + i + " is " + sum);
            }
        }

        else if(base.equals("col"))
        {
            for(int j = 0; j < col; j++)
            {
                sum = 0;
                for(int i = 0; i < row; i++)
                {
                    sum += arr[i][j];
                }
                totSum += sum;
                System.out.println("Summation of the elements of column " + j + " is" + sum);
            }
        }
         System.out.println("Summation of the elements of whole matrix is " + totSum);
         return totSum;
    }



    //Method 4
    public void sum_diogonal(int[][]arr, String type)
    {
        int sum = 0;
        if(type.equals("Primary"))
        {
            for(int i = 0; i < arr.length;i++)
            {
                sum += arr[i][i];
            }
            System.out.println("Summation of Primary diagonal: " + sum);
        }

        else if(type.equals("Secondary"))
        {
            for(int i = 0; i < arr.length; i++)
            {
                sum += arr[i][arr.length-1-i];
            }
            System.out.println("Summation of Secondary diagonal: " + sum);
        }
        
    }



    //Method 5
    public void swap(int[][]arr, String base)
    {
        int temp = 0;
        int row = arr.length;
        int col = arr[0].length;

        if(base.equals("row"))
        {
            for(int j = 0; j < col; j++)
            {
                for(int i = 0; i < row/2; i++)
                {
                    temp = arr[i][j];
                    arr[i][j] = arr[row-1-i][j];
                    arr[row-1-i][j] = temp;
                }
            }
        }

        else if(base.equals("col"))
        {
            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    temp = arr[i][j];
                    arr[i][j] = arr[i][col-1-i];
                    arr[i][col-1-i] = temp;
                }
            }
        }
        print_Array(arr,"row");
    }
}
