//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
  
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	Solution g = new Solution();
                ArrayList<Integer> res = g.inOrder(root);
                for (int i = 0; i < res.size (); i++)
                    System.out.print (res.get (i) + " ");
                System.out.print("\n");
                t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/* A Binary Tree node 

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution{
    // Return a list containing the inorder traversal of the given tree
    /*
    In-Order => Left+Root+Right
    Here, We are going to use a Stack to mimic call Stack:
    
    call = 1: Left Sub-Tree.
    call = 2: Right Sub-Tree.
    call = 3: Remove from Stack.
    **/
    class Pair{
        int call;
        Node node;
        
        Pair(Node node, int call){
            this.node = node;
            this.call = call;
        }
    }
    
    // Iterative Approach:
    ArrayList<Integer> inOrder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        // Edge Case:
        if(root == null)
            return ans;
            
        // Call Stack:
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));
        
        while(st.size() != 0){
            // Case-1: Left
            // Case-2: Right
            // Case-3: pop
            Pair rpair = st.peek();
            Node currNode = rpair.node;
            int call = rpair.call;
            
            // Coditions:
            if(call == 1){
                // left call:
                if(currNode.left != null){
                    st.push(new Pair(currNode.left, 1));
                }
                
                rpair.call = 2;
            }
            else if(call == 2){
                // Adding the current node value to the Ans:
                ans.add(currNode.data);
                
                // right call:
                if(currNode.right != null){
                    st.push(new Pair(currNode.right, 1));
                }
                
                rpair.call = 3;
                
            }
            else if(call == 3){
                st.pop();
            }
        }
        
        return ans;
    }
    
    
}