package practice;

import java.util.Arrays;
import java.util.HashSet;


public class Solution720 {
	public String longestWord(String[] words) {
        HashSet<String> set=new HashSet<>();
        Arrays.sort(words);
        String ans="";
        for(String s:words)
        	if(s.length()==1 || set.contains(s.substring(0, s.length() - 1)))
        	{
        		ans= s.length() >ans.length() ? s:ans;
        		set.add(s);
        	}
        return ans;
    }
}
