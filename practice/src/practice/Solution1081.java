package practice;

import java.util.Stack;

public class Solution1081 {
	public String smallestSubsequence(String text) {
        Stack<Integer> stack=new Stack<>();
        int loc[]=new int [26];
        boolean seen[]=new boolean[26];
        for (int i = 0; i < text.length(); i++) 
        	loc[text.charAt(i)-'a']=i;
        for (int i = 0; i < text.length(); i++) 
        {
        	int num=text.charAt(i)-'a';
        	if(seen[num])
        		continue;
        	while (!stack.isEmpty() && stack.peek() > num && i<loc[stack.peek()]) 
        		seen[stack.pop()]=false;
        	stack.push(num);
        	seen[num]=true;
		}
        
        StringBuilder sb=new StringBuilder();
        for (int i:stack) 
			sb.append((char)(i+'a'));
		return sb.toString();
    }
}
