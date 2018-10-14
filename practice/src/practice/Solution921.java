package practice;

import java.util.Stack;

public class Solution921 {
	//1. time(N) space(1) 
	public int minAddToMakeValid(String S) {
        int left=0;
        int right=0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)=='(')
				left++;
			else // 括號為')'的情況下
			{
				if(left==0)
					right++;
				else if(left>0)
					left--;	
			}
		}
		return right+left;
    }
//	//1. time(N) space(N) 
//	public int minAddToMakeValid(String S) {
//        Stack<Integer> stack=new Stack<>();
//        int count=0;
//		for(int i=0;i<S.length();i++)
//		{
//			if(S.charAt(i)=='(')
//				stack.push(i);
//			else // 括號為')'的情況下
//			{
//				if(stack.empty())
//					count++;
//				else  
//					stack.pop();	
//			}
//		}
//		return stack.size()+count;
//    }
}
