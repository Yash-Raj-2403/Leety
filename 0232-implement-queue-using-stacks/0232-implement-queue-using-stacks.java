class MyQueue {
    Stack<Integer> stk;
    public MyQueue() {
        stk = new Stack<>();
    }
    
    public void push(int x) {
        stk.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<>();

        while (stk.size() > 1) {
            temp.push(stk.pop());
        }
        int front = stk.pop();
        while (!temp.isEmpty()) {
            stk.push(temp.pop());
        }
        return front;
    }
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (stk.size() > 1) {
            temp.push(stk.pop());
        }
        int front = stk.peek();
        while (!temp.isEmpty()) {
            stk.push(temp.pop());
        }
        return front;
    }
    
    public boolean empty() {
        return stk.isEmpty();

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */