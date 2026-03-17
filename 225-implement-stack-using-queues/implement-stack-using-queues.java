class MyStack {
Queue<Integer> q1=new LinkedList<>();  
    public MyStack() {
       
    }
    
    public void push(int x) {
        q1.add(x);
    }
    public int pop() {
        for(int i=1;i< q1.size();i++){
            q1.add(q1.remove());
        }//isme bapus se element nahi dalege kyo ki pop m delete ho jata hai return k sath
        int val=q1.remove();
        return val;
    }
    
    public int top() {
        for( int i=1;i<q1.size();i++){
            q1.add(q1.remove());
        }// top matlab peek samaj lo peek m element remoe nhi hota bus pata chalta hai top m kon hai 
        int val=q1.peek();
        q1.add(q1.remove());
        return val;
    }
    public boolean empty() {
        return q1.size()==0;
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