class MyQueue {
    ArrayList<Integer> out;
    ArrayList<Integer> in;
    /** Initialize your data structure here. */
    public MyQueue() {
        out = new ArrayList<>();
        in = new ArrayList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(out.isEmpty()){
            int size = in.size();
            for(int i=0;i<size;i++){
                int v = in.remove(in.size()-1);
                out.add(v);
            }
        }
        return out.remove(out.size()-1);
    }
    
    /** Get the front element. */
    public int peek() {
        if(out.isEmpty()){
            int size = in.size();
            for(int i=0;i<size;i++){
                int v = in.remove(in.size()-1);
                out.add(v);
            }
        }
        return out.get(out.size()-1);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (out.isEmpty() && in.isEmpty());
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
