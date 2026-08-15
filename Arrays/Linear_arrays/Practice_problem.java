public class Practice_problem
{
    public static void main(String[]args)
    {
        int[]arr1 = {1,2,3,4,3,2,1};
        int[]arr2 = {1,2,3,4,5,6,7};
        Required_methods p = new Required_methods();
        System.out.println(p.palindrome(arr1, 7));
        System.out.println(p.palindrome(arr2, 7));
        p.Merge_Arrays(arr1, arr1.length, arr2, arr2.length);
    }    
}
