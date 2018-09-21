package practice;

import java.util.Stack;

public class Solution32 {
	
	public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer> stack=new Stack<>();
        int index=-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				stack.push(i);
			else // 括號為')'的情況下
			{
				if(stack.empty())//沒有'('可以POP 連續中斷 將 index改為i
					index=i;
				else  
				{
					stack.pop();
					if(stack.empty())
						max=Math.max(max, i-index);
					else
						max=Math.max(max, i-stack.peek());
				}	
				
			}
		}
		return max;
    }
}
