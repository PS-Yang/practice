package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Solution966 {
	//sol1
	public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> set=new HashSet<>();
        HashMap<String,String> maplow=new HashMap<>();
        HashMap<String,String> mapvowel=new HashMap<>();
        for (String s : wordlist) 
        {
        	set.add(s);
        	if(!maplow.containsKey(s.toLowerCase()))
        		maplow.put(s.toLowerCase(),s);
        	String tmp=toVowel(s.toLowerCase());
        	if(!mapvowel.containsKey(tmp))
        		mapvowel.put(tmp, s);
        }
		for (int i = 0; i < queries.length; i++) 
		{
			String que=queries[i];
			if(set.contains(que))
				continue;
			else if(maplow.containsKey(que.toLowerCase()))
				queries[i]=maplow.get(que.toLowerCase());
			else
			{
				String tmp=toVowel(que.toLowerCase());
				queries[i]=mapvowel.getOrDefault(tmp, "");
			}
		}
        return queries;
    }
	private String toVowel(String str){
		StringBuilder sb=new StringBuilder();
		for(char c:str.toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				sb.append('*');
			else 
				sb.append(c);
		}
		return sb.toString();
	}
}
