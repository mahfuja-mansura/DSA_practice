package Tree.Binary_Tree;

public class BT_imp
{
    //Method 1
    public static BTNode create_tree_from_array(int[]arr, int i)
    {
       if(i>=arr.length)
        {
            return null;
        }
         BTNode node = new BTNode(arr[i]);
         node.left = create_tree_from_array(arr, 2*i);
         node.right = create_tree_from_array(arr, 2*i+1);
         return node; 
    }

    //Method 2

    public static void main(String[]args)
    {
        int[]arr = {000,10,20,30,40,50,60,70,80,70,100};
        create_tree_from_array(arr, 1);
    }
}
