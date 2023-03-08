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
    public static Node quickSort(Node head)
    {
        // Base Case:
        if(head == null || head.next == null){
            return head;
        }
        
        // Getting the Partition in array [left, pivot, right]
        Node[] res = partition(head);
        
        // Sorting the left part:
        Node lHead = quickSort(res[0]);
        Node rHead = quickSort(res[2]);
        
        // Connecting the pivot to right part:
        res[1].next = rHead;
        
        // Checking if lHead != null
        if(lHead == null){
            return res[1];
        }
        
        Node temp = lHead;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = res[1];
        
        return lHead;
    }
    
    public static Node[] partition(Node head){
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node l1 = d1;
        Node l2 = d2;
        
        Node pivot = head;
        Node temp = head;
        while(temp != null){
            if(temp != pivot){
                if(temp.data <= pivot.data){
                    l1.next = temp;
                    l1 = temp;
                }
                else{
                    l2.next = temp;
                    l2 = temp;
                }
            }
            
            temp = temp.next;
        }
        
        // Assigining the next of  left, pivot, right to null
        l1.next = null;
        l2.next = null;
        pivot.next = null;
        
        // Updating the Head nodes of dummy:
        d1 = d1.next;
        d2 = d2.next;
        
        // Returning the result:
        return new Node[]{d1,pivot,d2};
    }
    
    
}