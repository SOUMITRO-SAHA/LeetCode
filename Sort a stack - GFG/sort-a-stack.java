//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s){
		// Calling Helper Function:
		helper(s); // This function will sort the stack
		
		// returning the stack
		return s;
	}
	private void helper(Stack<Integer> s){
	    // Base Case:
	    if(s.isEmpty()){
	        return;
	    }
	    
	    // Recursive Call:
	    int ele = s.pop();
	    helper(s); // Recursive call itself for the remaining elements:
	    insertedInSortedPosition(ele, s); // This will insert the element into the sorted position
	}
	
	private void insertedInSortedPosition(int x, Stack<Integer> s){
	    // Inserting into the correct Position
	    if(s.isEmpty() || s.peek() < x){
	        s.push(x); // Inserting at the correct position
	        return;
	    }
	    // Else s.peek is having larger element so remove it form the stack
	    // and call the same method.
	    int y = s.pop();
	    insertedInSortedPosition(x, s);
	    // Now add y to the stack:
	    s.push(y); // Restored the popped element.
	}
}