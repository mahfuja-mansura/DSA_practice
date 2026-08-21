package Tree.Binary_Tree;

public class BT_imp
{
    //Method 1
    public static BTNode create_tree_from_array(char[]arr, int i)
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
    public static void preOrder(BTNode node)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.elem + " ");
        preOrder(node.left);
        preOrder(node.right);
        return;
    }

    //Method 3
    public static void inOrder(BTNode node)
    {
        if(node == null)
        {
            return;
        }
        inOrder(node.left);
        System.out.print(node.elem + " " ) ;
        inOrder(node.right);
        return;
    }

    //Method 4
    public static void postOrder(BTNode node)
    {
        if(node == null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.elem + " " ) ;
        return;
    }

    //Method 5
    public static int depth(BTNode root, int key, int curr_dep)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.elem == key)
        {return curr_dep;}

        int left = depth(root.left, key, curr_dep+1);
        if(left!=-1)
        {
            return left;
        }
        return depth(root.right, key, curr_dep+1);
    }

    //Method 6
    public static int height(BTNode node)
    {
        if(node==null)
        {
            return -1;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left, right)+1;
    }
    
    //Method 7
    public static int number_of_nodes(BTNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+number_of_nodes(root.left) + number_of_nodes(root.right);
    }

    //Method 8
    // (Using existing methods)
    public static boolean is_full(BTNode root)
    {
        return number_of_nodes(root)==Math.pow(2, height(root)+1)-1;
    }
    //(Not using existing methods)
    public static boolean isFull(BTNode root)
    {
        if(root==null)
        {
            return true;
        }
        if((root.left==null && root.right!=null) || (root.left!=null && root.right==null))
        {
            return false;
        }
        return isFull(root.left) && isFull(root.right);
    }

    //Method 9
    public static boolean isComplete(BTNode root)
    {
        if(root==null)
        {
            return true;
        }
        if(root.left!=null && root.right==null)
        {
            return true;
        }
         if(root.left==null && root.right!=null)
        {
            return false;
        }
        return isComplete(root.left) && isComplete(root.right);
    }
}
