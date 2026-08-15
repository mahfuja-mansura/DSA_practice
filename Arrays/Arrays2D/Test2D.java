package Arrays2D;

public class Test2D
{
    public static void main(String[]args)
    {
        int[][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Required_methods rq = new Required_methods();
        rq.create_Array(3, 4);
        System.out.println("------------------------------");
        rq.print_Array(arr, "row");
        System.out.println("------------------------------");
        rq.print_Array(arr, "col");
        System.out.println("------------------------------");
        rq.summation(arr,"row");
        System.out.println("------------------------------");
        rq.summation(arr,"col");
        System.out.println("------------------------------");
        rq.sum_diogonal(arr, "Primary");
        System.out.println("------------------------------");
        rq.sum_diogonal(arr, "Secondary");
        System.out.println("------------------------------");
        rq.swap(arr, "row");
        System.out.println("------------------------------");
        rq.swap(arr, "col");
        System.out.println("------------------------------");
    }     
}
