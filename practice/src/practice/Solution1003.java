package practice;

import java.util.Stack;

public class Solution1003 {
	//sol2
	public boolean isValid(String S) {
		Stack<Character> stack=new Stack<>();
		for (Character c:S.toCharArray()) 
		{
			if(c=='c')
			{
				if(stack.isEmpty()|| stack.pop()!='b')
					return false;
				if(stack.isEmpty()|| stack.pop()!='a')
					return false;
			}
			else 
				stack.push(c);
			
		}
		return stack.isEmpty();	
	}
	//sol1
//	public boolean isValid(String S) {
//		String str="abc";
//		while (S.contains(str)) 
//			S=S.replace(str, "");
//		return S.isEmpty();	
//	}
}
