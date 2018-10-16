package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution225 {
	/** Initialize your data structure here. */
	private Queue<Integer> que;
    public Solution225() {
        que=new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	Queue<Integer> tmp=new LinkedList<>();
    	tmp.add(x);
    	while(!que.isEmpty())
    		tmp.add(que.poll());
    	que=tmp;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return que.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return que.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
       return que.isEmpty();
    }
	//1.
//	/** Initialize your data structure here. */
//	private LinkedList<Integer> que;
//    public Solution225() {
//        que=new LinkedList<>();
//    }
//    
//    /** Push element x onto stack. */
//    public void push(int x) {
//        que.add(0, x);
//    }
//    
//    /** Removes the element on top of the stack and returns that element. */
//    public int pop() {
//        return que.poll();
//    }
//    
//    /** Get the top element. */
//    public int top() {
//        return que.peek();
//    }
//    
//    /** Returns whether the stack is empty. */
//    public boolean empty() {
//       return que.isEmpty();
//    }
}