//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
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
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    private static void mapParents(Node root, HashMap<Node, Node> parent){
        // Base Case:
        if(root == null) return;
        
        // Mapping each node's child with itself: If Present.
        if(root.left != null) parent.put(root.left, root);
        if(root.right != null) parent.put(root.right, root);
        
        // Recursive Call:
        // Calling the Left Sub-Tree:
        mapParents(root.left, parent);
        // Calling the Right Sub-Tree:
        mapParents(root.right, parent);
    }
    
    private static Node find(Node root, int target){
        // Base Case:
        if(root == null || root.data == target) 
            return root;
        
        // Recursive Call:
        Node filc = find(root.left, target);
        if(filc != null) return filc;
        
        Node firc = find(root.right, target);
        if(firc != null) return firc;
        
        return null;
    }
    
    public static int minTime(Node root, int target) {
        // Task-1: First as in the Question it is said that the target node could be anyone of the give tree.
        // So, I have to Also sometime access its parent node from the child node, which is not possible if I don't maintain a mapping.
        // Hence, Mapping each node with it's parent is the Task-1:
        HashMap<Node, Node> parent = new HashMap<>();
        mapParents(root, parent);
        
        // Task-2: Getting the src node:
        Node src = find(root, target);
        
        // Task-3: We have to maintain a Set DS to for Check Sum, If one node is visited once we shouldn't operate on it again,
        HashSet<Node> visited = new HashSet<>();
        // Putting the src to the Set:
        visited.add(src);
        
        // Task-4: We have to maintain a Queue to Traverse in a Tree:
        Queue<Node> q = new LinkedList<>();
        // Also, Putting the src to the que:
        q.add(src);
        
        // Task-5: Now Traverse the Tree Level Wise:
        int level = 0;
        while(q.size() != 0){
            int size = q.size();
            while(size-- > 0){
                Node rnode = q.poll();
                // Case-1: Left Sub-Tree:
                if(rnode.left != null && !visited.contains(rnode.left)){
                    q.add(rnode.left);
                    visited.add(rnode.left);
                }
                // Case-2: Right Sub-Tree:
                if(rnode.right != null && !visited.contains(rnode.right)){
                    q.add(rnode.right);
                    visited.add(rnode.right);
                }
                // Case-3: Parent Node:
                if(parent.containsKey(rnode) && !visited.contains(parent.get(rnode))){
                    q.add(parent.get(rnode));
                    visited.add(parent.get(rnode));
                }
            }
            level++;
        }
        
        // Returning the level which is also the time in this Question:
        return level -1;
    }
}