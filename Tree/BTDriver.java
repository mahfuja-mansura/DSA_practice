package Tree;

import Tree.Binary_Tree.BTNode;
import Tree.Binary_Tree.BT_imp;

public class BTDriver
{
    public static void main(String[]args)
    {
        int[]arr = {000,10,20,30,40,50,60,70,80,90,100};
        BTNode root = BT_imp.create_tree_from_array(arr,1);
    
        System.out.print("Pre Order =>");
        BT_imp.preOrder(root);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.print("In Order =>");
        BT_imp.inOrder(root);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.print("Postgit Order =>");
        BT_imp.postOrder(root);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Depth of 90 is: " + BT_imp.depth(root, 90, 0));
        System.out.println("-------------------------------------------------------");
        System.out.println("Height of 10 is: " + BT_imp.height(root));
        System.out.println("-------------------------------------------------------");
        System.out.println("Number of Nodes: " + BT_imp.number_of_nodes(root));
        System.out.println("-------------------------------------------------------");
        System.out.println("Is the tree full?");
        System.out.println("=>" + BT_imp.is_full(root));
        System.out.println("=>" + BT_imp.isFull(root));
    }
}
