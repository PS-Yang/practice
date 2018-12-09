package practice;

import java.util.HashMap;

public class Solution953 {
	public boolean isAlienSorted(String[] words, String order) {
		HashMap<Character,Integer> map=new HashMap<>();
		int count=0;
		for(char c:order.toCharArray())
			map.put(c, count++);
		int N=words.length;
		for(int i=0;i<N-1;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
				if(j>words[i+1].length()-1)
					return false;
				if(words[i].charAt(j)!=words[i+1].charAt(j))
				{
					if(map.get(words[i].charAt(j))<map.get(words[i+1].charAt(j)))
						break;
					else
						return false;
				}
			}
		}
		return true;
    }

//	public boolean isAlienSorted(String[] words, String order) {
//		
//		HashMap<Character,Integer> map=new HashMap<>();
//		int count=0;
//		for(char c:order.toCharArray())
//			map.put(c, count++);
//		
//        int N=words.length;
//		for(int i=0;i<words[0].length();i++)
//		{
//			int prev=-1;
//			for(int j=0;j<N;j++)
//			{
//				int len=words[j].length();
//				if(i>len-1)
//					return false;
//				int n=map.get(words[j].charAt(i));
//				if(n>prev)
//					prev=n;
//				else
//					return false;
//			}
//		}
//		return true;
//    }
}
