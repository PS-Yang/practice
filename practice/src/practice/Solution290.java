package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Solution290 {
	public boolean wordPattern(String pattern, String str) {
		String strs[]=str.split(" ");
		if(pattern.length()!=strs.length)
			return false;
		HashMap<String,String> map=new HashMap<>();
		HashSet<String> value=new HashSet<>();
		int idx=0;
        for(String s:strs)
        {
        	String key=pattern.charAt(idx)+"";
        	if(map.containsKey(key))
        	{
        		if(!map.get(key).equals(s))
        			return false;
        	}
        	else
        	{
        		map.put(key, s);
        		if(!value.add(s))
        			return false;
        	}
        	idx++;
        }
        
        return true;
    }
}
