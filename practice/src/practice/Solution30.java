package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Solution30 {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> ans=new ArrayList<>();
		if(s.equals("") || words.length==0)
			return ans;
		int num=words.length;
		if(s.length()<num*words[0].length())
			return ans;
		HashMap<String,Integer> wordmap=new HashMap<>();
		
		for(int i=0;i<num;i++)
		{
			if(wordmap.containsKey(words[i]))
				wordmap.put(words[i], wordmap.get(words[i])+1);
			else
				wordmap.put(words[i], 1);
		}
		int len=words[0].length();
		int totallen=len*num;
		
		for(int i=0;i<=s.length()-totallen;i++)
		{
			int index=i;
			HashMap<String,Integer> temp=new HashMap<>();
			temp.putAll(wordmap);
			while(index+len<=s.length())
			{
				String substr=s.substring(index,index+len);
				if(temp.containsKey(substr))
				{
					int n=temp.get(substr);
					if(n==1)
						temp.remove(substr);
					else
						temp.put(substr,n-1);
				}
				else
					break;
				index=index+len;
			}
			if(temp.isEmpty())
				ans.add(i);
		}
		return ans;
    }
}
