package Linked_list.Singly_linked_list;

public class SinglyLL
{
    //Method 1
    public static Node createList(int[]arr)
    {
        Node head = new Node(arr[0], null);
        Node tail = head;

        for(int i = 1; i < arr.length; i++)
        {
            Node n = new Node(arr[i], null);
            tail.next = n;
            tail = n;
        }
        return head;
    }   
    
    

    //Method 2
    public static void printList(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.elem);
            temp = temp.next;
        }
    }



    //Method 3
    public static int countNodes(Node head)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }



    //Method 4
    public static Node nodeAt(Node head, int indx)
    {
        Node temp = head;
        int i = 0;

        while(temp!=null)
        {
            if(i==indx)
            {
                return temp;

            }
            temp = temp.next;
            i++;
        }
        return null;
    }



    //Method 5
    public static int elemAt(Node head, int indx)
    {
        Node temp = head;
        int i = 0;

        while(temp!=null)
        {
            if(i==indx)
            {
                return temp.elem;

            }
            temp = temp.next;
            i++;
        }
        return 00;
    }



    //Method 6
    public static void valueUpdate(Node head, int indx, int value)
    {
        Node temp = head;
        int i = 0;

        while(temp!=null)
        {
            if(i==indx)
            {
                temp.elem = value;

            }
            temp = temp.next;
            i++;
        }
    }



    //Method 7
    public static boolean valueSearch(Node head, int value)
    {
        Node temp = head;

        while(temp!=null)
        {
            if(temp.elem==value)
            {
                return true;
            }
            temp = temp.next;
        } 
        return false;  
    } 



    //Method 8
    public static void Insert(Node head, int indx, int value)
    {
        int length = countNodes(head);

        if(indx==0)
        {
            Node newNode = new Node(value, null);
            newNode.next = head;
            head = newNode;
        }
        else if(indx==length)
        {
            Node newNode = new Node(value, null);
            nodeAt(head, indx-1).next = newNode; 
        }
        else if(indx>0 && indx<length)
        {
            Node newNode = new Node(value, null);
            Node prev = nodeAt(head, indx-1);
            Node next = prev.next;
            prev.next = newNode;
            newNode.next = next;
        }
    }
     
    

    //Method 9
    public static void remove(Node head, int indx)
    {
        int length = countNodes(head);
        if(indx>=0 && indx < length)
        {
            if(indx==0)
            {
                head = head.next;
            }
            else
            {
                nodeAt(head, indx-1).next = nodeAt(head, indx).next;
            }
        }
    }



    //Method 10
    public static void reverseInPlace(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }



    //Method11
    public static void reverseOutOfPlace(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            Node newNode = curr;
            newNode.next = head;
            head = newNode;
            curr = curr.next;
        }
    }
}
