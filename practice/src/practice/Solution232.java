package practice;

import java.util.Stack;

public class Solution232 {
	//2. 使用兩個stack
	private Stack<Integer> s;
	private Stack<Integer> s2;
	private int front;
	/** Initialize your data structure here. */
    public Solution232() {
        s=new Stack<>();
        s2=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	if (s.empty())
            front = x;
        s.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(s2.isEmpty())
    	{
    		while(!s.isEmpty())
    			s2.push(s.pop());
    	}
        return s2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	if(!s2.isEmpty())
    	{
    		return s2.peek();
    	}
    	return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty() && s2.isEmpty();
    }
	
	
	
	// 1. sol1 修改push
//	private Stack<Integer> s;
//	/** Initialize your data structure here. */
//    public Solution232() {
//        s=new Stack<>();
//    }
//    
//    /** Push element x to the back of queue. */
//    public void push(int x) {
//        Stack<Integer> tmp=new Stack<>();
//        
//        while(!s.isEmpty())
//        	tmp.push(s.pop());
//        s.push(x);
//        while(!tmp.empty())
//            s.push(tmp.pop());
//    }
//    
//    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//        return s.pop();
//    }
//    
//    /** Get the front element. */
//    public int peek() {
//        return s.peek();
//    }
//    
//    /** Returns whether the queue is empty. */
//    public boolean empty() {
//        return s.isEmpty();
//    }

}
