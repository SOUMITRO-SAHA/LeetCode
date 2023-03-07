//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Node head = null, tail = null;
		    
		    char head_c = sc.next().charAt(0);
		    head = new Node(head_c);
		    tail = head;
		    
		    while(n-- > 1){
		        tail.next = new Node(sc.next().charAt(0));
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    //show(head);
		    show(obj.arrangeCV(head));
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        // Edge Case:
        if(head == null)
            return null;
            
        Node d1 = new Node('1'); //Voules 
        Node d2 = new Node('1'); // Cons
        Node ls1 = d1;
        Node ls2 = d2;
        
        Node temp = head;
        while(temp != null){
            Node nextNode = temp.next;
            char ch = temp.data;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                // Voules
                ls1.next = temp;
                ls1 = temp;
                temp.next = null;
            }
            else{
                // Conson
                ls2.next = temp;
                ls2 = temp;
                temp.next = null;
            }
            
            temp = nextNode;
        }
        // Assigning the ls1 and l2 to null:

        
        // Connecting the nodes:
        ls1.next = d2.next;
        
        // Returning 
        return d1.next;
    }
}