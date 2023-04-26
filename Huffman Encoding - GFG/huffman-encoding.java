//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            int N = S.length();
            Solution ob = new Solution();
            String[] element = br.readLine().trim().split("\\s+");
		    int[] f = new int[N];
		    for(int i = 0; i < N; i++){
		        f[i] = Integer.parseInt(element[i]);
		    }
            ArrayList<String> res  = ob.huffmanCodes(S,f,N);
            for(int i = 0; i < res.size(); i++)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
	class Node{
		char data;
		int fq;
		Node left;
		Node right;

		Node(char data, int fq){
			this.data = data;
			this.fq = fq;
		}
	}
    public ArrayList<String> huffmanCodes(String str, int fq[], int n){
		PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> (a.fq < b.fq?-1:1));
        for(int i=0; i<n; i++){
			char ch = str.charAt(i);
			int occ = fq[i];
			pq.add(new Node(ch, occ));
		}

		// Constructring the Huffman Tree:
		while(pq.size() > 1){
			Node n1 = pq.poll(); // Smaller One
			Node n2 = pq.poll(); // Larger One

			// Creating a Custom Node:
			Node nnode = new Node('*', n1.fq+n2.fq);
			nnode.left = n1;
			nnode.right = n2;

			// Adding to the pq:
			pq.add(nnode);
		}
        Node root = pq.peek();

		// Constructing the Path:
		ArrayList<String> ans = new ArrayList<>();
		construct(root, ans,"");
		return ans;
    }
	private void construct(Node root, ArrayList<String> ans, String psf){
		// Base Case:
		if(root.left == null && root.right == null){
			ans.add(psf);
			return;
		}

		// Recursive Call:
		construct(root.left, ans, psf+'0');
		construct(root.right, ans, psf+'1');
	}
}