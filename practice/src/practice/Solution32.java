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
	
//	public int longestValidParentheses(String s) {
//        int max=0;
//        Stack<String> stack=new Stack<String>();
//        int temp=0;
//        boolean flag=true;
//        int index=-1;
//		for(int i=0;i<s.length();i++)
//		{
//			String str=s.charAt(i)+"";
//			if(!stack.empty()  && stack.peek().equals("(") && str.equals(")"))
//			{
//				temp=temp+2;
//				stack.pop();
//			}
//			else 
//			{
//				stack.push(str);
//				if(str.equals(")"))
//					temp=0;
//			}
//			if(temp>max)
//				max=temp;
//		}
//		return max;
//    }
	
	
//	 public int longestValidParentheses(String s) {
//	        Stack<Integer> stack = new Stack<Integer>();
//	        int max=0;
//	        int left = -1;
//	        for(int j=0;j<s.length();j++){
//	            if(s.charAt(j)=='(') stack.push(j);            
//	            else {
//	                if (stack.isEmpty()) left=j;
//	                else{
//	                    stack.pop();
//	                    if(stack.isEmpty()) max=Math.max(max,j-left);
//	                    else max=Math.max(max,j-stack.peek());
//	                }
//	            }
//	        }
//	        return max;
//	    }
}
