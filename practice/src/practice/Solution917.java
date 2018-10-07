package practice;

import java.util.Stack;

public class Solution917 {
	public String reverseOnlyLetters(String S) {
        Stack<Character> st=new Stack<>();
		for(char c:S.toCharArray())
		{
			if( (c-'A'>=0 && c-'A'<26) || (c-'A'>31 && c-'A'<58))
			{
				st.push(c);
			}
		}
		StringBuilder ans=new StringBuilder();
		for(char c:S.toCharArray())
		{
			if( (c-'A'>=0 && c-'A'<26) || (c-'A'>31 && c-'A'<58))
			{
				ans.append(st.pop());
			}
			else
				ans.append(c);
		}
		return ans.toString();
    }
}
