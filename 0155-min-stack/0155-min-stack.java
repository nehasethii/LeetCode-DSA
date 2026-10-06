class MinStack {
    Stack<Integer[]> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        int prev = Integer.MAX_VALUE;
        if(!st.empty()){
            prev = st.peek()[1];
        }
        st.push(new Integer[]{value,Math.min(prev, value)});
    }
    
    public void pop() {
        if(!st.empty()){
            st.pop();
        }
    }
    
    public int top() {
        if(!st.empty()){
            return st.peek()[0];
        }
        return -1;
    }
    
    public int getMin() {
        if(!st.empty()){
            return st.peek()[1];
        }
        return -1;
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