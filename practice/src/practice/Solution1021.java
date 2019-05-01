package practice;

import java.util.Stack;

public class Solution1021 {
	//sol2
	public String removeOuterParentheses(String S) {
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(char c: S.toCharArray()) 
		{
			if(c=='(' && count++ > 0)
                sb.append(c);
			if(c==')' && count-- > 1)
				sb.append(c);
		} 
		
		return sb.toString();
    }
	//sol1
//	public String removeOuterParentheses(String S) {
//		Stack<String> st=new Stack<>();
//		StringBuilder sb=new StringBuilder();
//		int begin=0;
//		for (int i = 0; i < S.length(); i++) 
//		{
//			if(st.isEmpty())
//				begin=i;
//			if (S.charAt(i)=='(') 
//				st.push(S.charAt(i)+"");
//			if (S.charAt(i)==')') 
//				st.pop();
//			if(st.isEmpty())
//				sb.append(S.substring(begin+1, i));
//		} 
//		
//		return sb.toString();
//    }
}
