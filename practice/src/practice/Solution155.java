package practice;

import java.util.Iterator;
import java.util.Stack;

public class Solution155 {
	private Stack<Integer> st=new Stack<>();
	private Stack<Integer> min=new Stack<>(); //store min
	public Solution155() {
		
    }
    
    public void push(int x) {
    	st.push(x);
    	if(min.isEmpty())
    		min.push(x);
    	else if(min.peek()>=x)
    		min.push(x);
    }
    
    public void pop() {
        int n=st.pop();
        if(n==min.peek())
        	min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
    	return min.peek();
    }

}
