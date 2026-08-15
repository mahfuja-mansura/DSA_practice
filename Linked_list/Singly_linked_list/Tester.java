package Linked_list.Singly_linked_list;

public class Tester
{
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,4,5};
        Node head = SinglyLL.createList(arr);
        SinglyLL.printList(head);
        int length = SinglyLL.countNodes(head);
        System.out.println("Length of this linked list is " + length);
        System.out.println(SinglyLL.elemAt(head, 3));
        SinglyLL.valueUpdate(head, 2, 100);
        SinglyLL.printList(head);
        System.out.println(SinglyLL.valueSearch(head, 2));
        SinglyLL.Insert(head, 5, 101);
        SinglyLL.printList(head);
        SinglyLL.remove(head, 3);
        SinglyLL.printList(head);
    }    
}
