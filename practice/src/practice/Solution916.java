package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution916 {
	public List<String> wordSubsets(String[] A, String[] B) {
        List<String> ans=new ArrayList<>();
//		HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        int total[]=new int [26];
        int temp[]=new int [26];
		for(String b:B)
		{
			temp=new int [26];
			for(char c:b.toCharArray())
				temp[c-'a']++;
			for(int i=0;i<26;i++)
				total[i]=Math.max(temp[i], total[i]);
		}
		for(String a:A)
		{
			temp=new int [26];
			for(char c:a.toCharArray())
				temp[c-'a']++;
			int i=0;
			for(i=0;i<26;i++)
			{
				if(temp[i]<total[i])
					break;
			}
			if(i==26)
				ans.add(a);
		}
		return ans;
    }
}
