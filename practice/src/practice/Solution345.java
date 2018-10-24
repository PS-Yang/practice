package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Solution345 {
	//sol2 using char array
	public String reverseVowels(String s) {
		if(s==null||s.length()==0)
			return "";
		HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		char c[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
        	while(i<s.length() && !set.contains(s.charAt(i)))
        		i++;
        	while(j>=0 && !set.contains(s.charAt(j)))
        		j--;
        	if(i>=j)
        		break;
        	char tmp=s.charAt(i);
        	c[i]=c[j];
        	c[j]=tmp;
        	i++;
        	j--;
        }
        return new String(c);
    }
	//sol1 using StringBuilder.
//	public String reverseVowels(String s) {
//		if(s==null||s.length()==0)
//			return "";
//		HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
//		StringBuilder ans=new StringBuilder();
//		ans.append(s);
//        int i=0;
//        int j=s.length()-1;
//        while(i<j)
//        {
//        	while(i<s.length() && !set.contains(s.charAt(i)))
//        		i++;
//        	while(j>=0 && !set.contains(s.charAt(j)))
//        		j--;
//        	if(i>=j)
//        		break;
//        	char tmp=s.charAt(i);
//        	ans.setCharAt(i, s.charAt(j));
//        	ans.setCharAt(j, tmp);
//        	i++;
//        	j--;
//        }
//        return ans.toString();
//    }
}
