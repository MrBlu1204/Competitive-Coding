class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> min;
    

    public MinStack() {
        stack = new LinkedList<Integer>();
        min = new LinkedList<Integer>();

    }
    
    public void push(int val) {
        stack.addLast(val);

        if(!min.isEmpty() && min.getLast() < val){
            min.addLast(min.getLast());
        }
        else{
            min.addLast(val);
        }
        
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.removeLast();
            min.removeLast();
        }
        
    }
    
    public int top() {
        return stack.getLast();
        
    }
    
    public int getMin() {
            return min.getLast();  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */