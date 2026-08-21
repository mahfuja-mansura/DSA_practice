package Tree;

import Tree.Binary_Tree.BTNode;
import Tree.Binary_Tree.BT_imp;

public class BTDriver
{
    public static void main(String[]args)
    {
        char[]arr = {'X', 'A','B','C','D','E','F','G','H','I','J'};
        BTNode root = BT_imp.create_tree_from_array(arr,1);
    
        System.out.print("Pre Order =>");
        BT_imp.preOrder(root);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.print("In Order =>");
        BT_imp.inOrder(root);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.print("Post Order =>");
        BT_imp.postOrder(root);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Depth of I is: " + BT_imp.depth(root, 'I', 0));
        System.out.println("-------------------------------------------------------");
        System.out.println("Height of A is: " + BT_imp.height(root));
        System.out.println("-------------------------------------------------------");
        System.out.println("Number of Nodes: " + BT_imp.number_of_nodes(root));
        System.out.println("-------------------------------------------------------");
        System.out.println("Is the tree full?");
        System.out.println("=>" + BT_imp.is_full(root));
        System.out.println("=>" + BT_imp.isFull(root));
        System.out.println("-------------------------------------------------------");
        System.out.println("Is the tree complete?");
        System.out.println("=>" + BT_imp.isComplete(root));
    }
}
