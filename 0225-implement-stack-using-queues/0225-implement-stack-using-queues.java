class MyStack {
    static private Queue<Integer> main;
    static private Queue<Integer> temp;
    public MyStack() {
        main = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        main.add(x);
    }
    
    public int pop() {
        while(main.size() != 1){
            temp.add(main.poll());
        }
        
        int popped = main.poll();
        
        while(temp.size() != 0){
            main.add(temp.poll());
        }
        
        return popped;
    }
    
    public int top() {
        while(main.size() != 1){
            temp.add(main.poll());
        }
        
        int peek = main.peek();
        // Adding the Last Element to the Temp:
        temp.add(main.poll());
        
        while(temp.size() != 0){
            main.add(temp.poll());
        }
        
        return peek;
    }
    
    public boolean empty() {
        return main.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */