package practice;

import java.util.Stack;

public class Solution946 {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> st=new Stack<>();
        int idx=0;
		for(int n:pushed)
		{
			st.push(n);
			while(!st.isEmpty() && st.peek()==popped[idx])
			{
				st.pop();
				idx++;
			}
		}
			
		return idx==popped.length;
    }
}
