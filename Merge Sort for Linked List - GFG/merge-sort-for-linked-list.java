//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // Base Case:
        if(head == null || head.next == null){
            return head;
        }
        
        // Getting the mid:
        Node temp = head;
        Node mid = getMid(head);
        Node head2 = mid.next;
        mid.next = null; // disconnecting two LLs:
        
        Node lHead = mergeSort(head);
        Node rHead = mergeSort(head2);
        
        Node ans = mergeLL(lHead, rHead);
        
        return ans;
    }
    // Function for merging two Linked List:
    static Node mergeLL(Node h1, Node h2){
        Node t1 = h1;
        Node t2 = h2;
        
        Node d = new Node(-1);
        Node ls = d;
        
        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                ls.next = t1;
                ls = t1;
                t1 = t1.next;
            }
            else{
                ls.next = t2;
                ls = t2;
                t2 = t2.next;
            }
        }
        
        // If any one LL left:
        if(t1 != null){
            ls.next = t1;
        }
        else{
            ls.next = t2;
        }
        
        // Updatin the head of dummy:
        d = d.next;
        
        return d;
    }
    // Function for the finding the Middle Node:
    static Node getMid(Node head){
        Node fast = head;
        Node slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}


