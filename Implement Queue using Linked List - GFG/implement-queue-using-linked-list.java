//{ Driver Code Starts
import java.util.*;
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class GfG {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}





// } Driver Code Ends


/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode head, tail;

    //Function to push an element into the queue.
    void push(int a)
    {
        QueueNode newNode = new QueueNode(a);
        // If the LL is empty:
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    //Function to pop head element from the queue.
    int pop()
    {
        // Edge Case:
        if(head == null)
            return -1;

        QueueNode curr = head;

        head = head.next;
        return curr.data;
    }
}




