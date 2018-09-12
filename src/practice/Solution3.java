package practice;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
      	int max=0;
		for(int i=0;i<s.length();i++)
		{
			Set<String> set=new HashSet<String>();
			int j=i+1;
			set.add(s.substring(i,j));
			while(j<s.length() &&!set.contains(s.substring(j,j+1)))
			{
				set.add(s.substring(j,j+1));
				j++;
			}
			if(i<j-1)
				i=j-2;
			if(max<set.size())
				max=set.size();
			
		}
        return max;
    }
}
