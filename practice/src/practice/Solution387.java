package practice;

public class Solution387 {
	public int firstUniqChar(String s) {
		int num[]=new int[26];
		for(Character c:s.toCharArray())
        	num[c-'a']++;
        for(int i=0;i<s.toCharArray().length;i++)
        {
        	Character c=s.charAt(i);
        	if(num[c-'a']==1)
        		return i;
        }
        return -1;
    }
}
