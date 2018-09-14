package practice;

import java.util.Stack;

public class Solution20 {
	public boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		
		for(char c:s.toCharArray())
		{
			if(c==' ')
				continue;
			else if(c=='(' || c== '[' || c== '{')
				stack.push(c);
			else if (c==')' && !stack.isEmpty() && stack.peek()=='(')
				stack.pop();
			else if (c==']' && !stack.isEmpty() && stack.peek()=='[')
				stack.pop();
			else if (c=='}' && !stack.isEmpty() && stack.peek()=='{')
				stack.pop();
			else
				return false;
		}
		return stack.isEmpty();
    }
	
//網路解法 先將符號轉換
//	public boolean isValid(String s) {
//		Stack<Character> stack=new Stack<>();
//		
//		for(char c:s.toCharArray())
//		{
//			if(c==' ')
//				continue;
//			else if(c=='(')   //先將符號轉換
//				stack.push(')');
//			else if(c== '[')
//				stack.push(']');
//			else if(c== '{')
//				stack.push('}');
//			else if(stack.isEmpty() || stack.pop()!=c)
//				return false;
//		}
//		return stack.isEmpty();
//    }

////	1版
//	public boolean isValid(String s) {
//		Stack<Character> stack=new Stack<>();
//		for(char c:s.toCharArray())
//		{
//			if(c==' ')
//				continue;
//			else if(c=='(' || c== '[' || c== '{')
//				stack.add(c);
//			else if (c==')')
//			{
//				if(stack.isEmpty() || stack.pop()!='(')
//					return false;
//			}
//			else if (c==']' )
//			{
//				if(stack.isEmpty() || stack.pop()!='[' )
//					return false;
//			}
//			else if (c=='}' )
//			{
//				if(stack.isEmpty() || stack.pop()!='{')
//					return false;
//			}
//		}
//		return stack.isEmpty();
//    }
}
