package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Solution205 {
	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length())
			return false;
		if(s == null || s.length() <= 1) 
			return true;
		HashMap<Character,Character> map=new HashMap<Character,Character>();
		
        for(int i=0;i<s.length();i++)
        {
        	if(map.get(s.charAt(i))==null)
        	{
        		if(!map.containsValue(t.charAt(i)))
        			 map.put(s.charAt(i), t.charAt(i));
                else 
                	return false;
        	}
        	else if(map.get(s.charAt(i))!=t.charAt(i))
        	{
        		return false;
        	}
        }
        return true;
    }
//	public boolean isIsomorphic(String s, String t) {
//		if(s.length()!=t.length())
//			return false;
//		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
//		int count=0;
//		StringBuilder sb=new StringBuilder();
//		StringBuilder sb2=new StringBuilder();
//        for(char c:s.toCharArray())
//        {
//        	int idx=map.getOrDefault(c, -1);
//        	if(idx==-1)
//        	{
//        		map.put(c, count);
//        		sb.append(count);
//        		count++;
//        	}
//        	else
//        		sb.append(idx);
//        }
//        map.clear();
//        count=0;
//        for(char c:t.toCharArray())
//        {
//        	int idx=map.getOrDefault(c, -1);
//        	if(idx==-1)
//        	{
//        		map.put(c, count);
//        		sb2.append(count);
//        		count++;
//        	}
//        	else
//        		sb2.append(idx);
//        }
//        if(sb.toString().equals(sb2.toString()))
//        	return true;
//        else
//        	return false;
//    }
}
