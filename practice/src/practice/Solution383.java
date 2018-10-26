package practice;

import java.util.HashSet;

public class Solution383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length()>magazine.length())
			return false;
		int num[]=new int[26];
		
        for(Character c:ransomNote.toCharArray())
        	num[c-'a']++;
        for(Character c:magazine.toCharArray())
        	num[c-'a']--;
        for(int n:num)
        {
        	if(n>0)
        		return false;
        }
        return true;
    }
}
