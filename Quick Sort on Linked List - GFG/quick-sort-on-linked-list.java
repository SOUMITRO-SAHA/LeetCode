//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node 
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class SortLL
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);
            
            printList(node);
            System.out.println();
        }
    }
    public static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void addToTheLast(Node node) 
{
  if (head == null) 
  {
    head = node;
  } else 
  {
   Node temp = head;
   while (temp.next != null)
          temp = temp.next;
         temp.next = node;
  }
}
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}*/
// you have to complete this function
class GfG
{
    public static Node quickSort(Node node){
        // Base Case:
        if(node == null || node.next == null){
            return node;
        }

        // Getting the left, pivot, right, left_end:
        // Index :      0      1      2
        Node[] res = partition(node);

        // sort the Left part:
        Node hLeft = quickSort(res[0]); // Passing the Head of Left Part:

        // Sort the right part:
        Node hRight = quickSort(res[2]); // Passing the Head of Right Part:

        // The Pivot Element:
        res[1].next = hRight;

        // Getting to the end of Left LL:
        if(hLeft == null){
            return res[1];
        }
        
        // Else if = hLeft in not null then,
        Node temp = hLeft;

        while(temp != null && temp.next != null){
            temp = temp.next;
        }

        temp.next = res[1];

        // Return Head;
        return hLeft;
    }

    public static Node[] partition(Node head){

        // Dummy Nodes:
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node l1 = d1;
        Node l2 = d2;

        Node temp = head;

        while(temp != null){
            if(temp != head){
                if(temp.data <= head.data){
                    // For Smaller Elements
                    l1.next = temp;
                    l1 = temp;
                }
                else{
                    // For Greater Elements
                    l2.next = temp;
                    l2 = temp;
                }
            }
            temp = temp.next;
        }

        // Assigning the next of the last Nodes to null
        l1.next = null;
        l2.next = null;
        if(head != null) {
            head.next = null;
        }

        // Array containing the Node Head of the left part and Pivot and Last part:
        // Filling the Array:

        return new Node[]{d1.next, head, d2.next};
    }
}