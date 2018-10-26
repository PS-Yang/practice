package practice;

public class Solution389 {
	public char findTheDifference(String s, String t) {
		int num[]=new int[26];
		for(Character c:s.toCharArray())
        	num[c-'a']++;
		char ans='a';
		for(Character c:t.toCharArray())
		{
			if(--num[c-'a']<0)
			{
				ans=c;
				break;
			}
		}
		return ans;
    }
}
