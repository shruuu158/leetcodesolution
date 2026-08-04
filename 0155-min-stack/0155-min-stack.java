class MinStack {
    class pair{
        int val;
        int min;
        pair(int val,int min){
            this.val=val;
            this.min=min;
        }
    }
    Stack<pair> stack;

    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int value) {
       if(stack.isEmpty()){
        stack.push(new pair(value,value));
       }else{
        int min=Math.min(value,stack.peek().min);
        stack.push(new pair(value,min));
       }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
          return stack.peek().min;
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