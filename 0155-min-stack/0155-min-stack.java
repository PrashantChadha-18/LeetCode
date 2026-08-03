class MinStack {
    Stack<Integer> stk;
    Stack<Integer> stk2;
    public MinStack() {
        stk=new Stack<>();
        stk2=new Stack<>();
    }
    
    public void push(int value) {
        stk.push(value);
        if(stk2.isEmpty() || value<=stk2.peek())
        {
            stk2.push(value);
        }
    }
    
    public void pop() {
        if(stk2.peek().equals(stk.peek()))
        {
            stk2.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return stk2.peek();
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