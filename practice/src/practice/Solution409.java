package practice;

import java.util.HashSet;

public class Solution409 {
	public int longestPalindrome(String s) {
		HashSet<Character> set=new HashSet<>();
		int len=0;
		for(Character c:s.toCharArray())
		{
			if(!set.add(c))
			{
				set.remove(c);
				len=len+2;
			}
		}
		if(set.size()!=0)
			return len+1;
		else
			return len;
    }
}
