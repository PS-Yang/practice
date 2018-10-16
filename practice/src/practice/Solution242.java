package practice;

import java.util.HashMap;

public class Solution242 {
	public boolean isAnagram(String s, String t) {
        int num[]=new int[26];
		for(char c:s.toCharArray())
			num[c-'a']++;
		for(char c:t.toCharArray())
			num[c-'a']--;
		for(int n:num)
			if(n!=0)
				return false;
		return true;
    }
//	//1. using hashmap
//	public boolean isAnagram(String s, String t) {
//        HashMap<Character,Integer> map=new HashMap<>();
//		for(char c:s.toCharArray())
//			map.put(c, map.getOrDefault(c, 0)+1);
//		for(char c:t.toCharArray())
//		{
//			int n=map.getOrDefault(c, 0);
//			if(n==-1 || map.size()==0)
//				return false;
//			if(n==1)
//				map.remove(c);
//			if(n>1)
//				map.put(c, n-1);
//		}
//		if(map.size()==0)
//			return true;
//		else
//			return false;
//    }
}
