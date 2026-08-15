public class Test_array
{
    public static void main(String[]args)
    {
        int[]arr = new int [5];
        Required_methods rm = new Required_methods();
        rm.iteration(arr);
        rm.print_arr_int(arr, "hor");
        rm.resize(arr, 3);
        rm.rotate(arr,"left");
        rm.rotate(arr,"right");
        rm.shift(arr,"left");
        rm.shift(arr,"right");
        rm.reverse_op(arr);
        rm.reverse_ip(arr);
        rm.insert(arr, 3, 100);
        rm.remove(arr, 3);
    }    
}
