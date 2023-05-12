//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG{
    //Function to return a tree created from postorder and inoreder traversals.
    private int i = 0;
    Node buildTree(int in[], int post[], int n) {
        i = n-1;
        return tree(in,post,0,n-1);
    }
    private Node tree(int in[], int post[], int x, int n){
        if(x > n) return null;
        Node root = new Node(post[i--]);
        int j;
        for(j=x;j<=n;j++)
            if(in[j] == root.data)
                break;
        root.right = tree(in,post,j+1,n);        
        root.left = tree(in,post,x,j-1);
        return root;
    }
}