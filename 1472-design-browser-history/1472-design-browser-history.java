class BrowserHistory {
    Node head;
    Node tail;
    Node current;
    
    public BrowserHistory(String homepage) {
        Node newNode = new Node(homepage);
        
        newNode.prev = this.head;
        this.head = newNode;
        this.tail = newNode;
        this.current = this.tail;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        if(head == null){
            newNode.prev = this.head;
            this.head = newNode;
            this.tail = newNode;
            this.current = this.tail;
        }
        else{
            newNode.prev = this.current;
            this.current.next = newNode;
            this.current = newNode;
            this.tail = this.current;
        }
    }
    
    public String back(int steps) {
        Node temp = this.current;
        
        int i = 0;
        while(i < steps){
            if(temp.prev != null){
                temp = temp.prev;
                this.current = temp;
            }
            i++;
        }
        
        return temp.data;
    }
    
    public String forward(int steps) {
        Node temp = this.current;
        
        int i = 0;
        while(i < steps){
            if(temp.next != null){
                temp = temp.next;
                this.current = temp;
            }
            i++;
        }
        
        return temp.data;
    }
    
    class Node{
        String data;
        Node next;
        Node prev;
        
        Node(String data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */