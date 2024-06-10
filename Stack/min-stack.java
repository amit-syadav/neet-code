class MinStack {

     
    int[] stack;
    int[] min;
    int s_i = 0;
    int m_i = 0;


    public MinStack() {
        stack = new int[30000];
        min = new int[30000];
        
    }
    
    public void push(int val) {
        stack[s_i] = val;
        s_i++;
 
        if( m_i == 0  || (min[m_i -1] > stack[s_i-1]))
            min[m_i] =stack[s_i-1];
        else
            min[m_i] = min[m_i-1];

        m_i++;
    }
    
    public void pop() {
        s_i --;
        m_i--;

    }
    
    public int top() {
        return stack[s_i-1];
    }
    
    public int getMin() {
        return min[m_i-1];
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */