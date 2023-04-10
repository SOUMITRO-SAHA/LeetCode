//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
    private static Node construct(int[]in, int sin, int ein, int[]pre, int spre, int epre){
        // Base Case:
        if(sin > ein || spre > epre) return null;
        
        Node rootNode = new Node(pre[spre]);
        
        // Now Searching for Node in the In-Order:
        int i = sin;
        int count = 0;
        while(rootNode.data != in[i]){
            i++;
            count++;
        }
        
        // Recursive Call:
        rootNode.left = construct(in,sin, i-1, pre, spre+1, spre+count);
        rootNode.right = construct(in,i+1, ein, pre, spre + count +1, epre);
        
        return rootNode;
    }
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        return construct(inorder,0, inorder.length-1, preorder,0, preorder.length-1);
    }
}
