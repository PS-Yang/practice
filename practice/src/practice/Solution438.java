package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution438 {
	//sol 2 time O(n)
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans=new ArrayList<>();
		if(s==null ||p==null||s.length() <p.length())
			return ans;
		
        int num[]=new int[26];
        for(Character c:p.toCharArray())
        	num[c-'a']++;
        int count=0;
        int left=0;
        int right=0;
        while(right<s.length())
        {
        	if(num[s.charAt(right++)-'a']-->=1)
        		count++;
        	if(count==p.length())
        		ans.add(left);
        	if((right-left)==p.length() && num[s.charAt(left++)-'a']++>=0)
        		count--;
        }
		return ans;
    }
	//sol 1
//	public List<Integer> findAnagrams(String s, String p) {
//		List<Integer> ans=new ArrayList<>();
//		if(s==null ||p==null||s.length() <p.length())
//			return ans;
//        int num[]=new int[26];
//        int len=p.length();
//        for(Character c:p.toCharArray())
//        	num[c-'a']++;
//        for(int i=0;i<=s.length()-len;i++)
//        {
//        	int tmp[]=new int[26];
//        	for(int k=0;k<tmp.length;k++)
//        		tmp[k]=num[k];
//        	int count=0;
//        	while(count<len)
//        	{
//        		Character c=s.charAt(i+count);
//        		tmp[c-'a']--;
//        		if(tmp[c-'a']<0)
//        			break;
//        		count++;
//        	}
//        	if(count==len)
//        		ans.add(i);
////        	for(int n:num)
////        		System.out.print(n);
////        	System.out.println();
//        }
//		return ans;
//    }
}
