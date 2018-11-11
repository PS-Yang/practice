package practice;

import java.util.Arrays;
import java.util.HashMap;

public class Solution937 {
	
	//sol1 in contest
	public String[] reorderLogFiles(String[] logs) {
		String ans[]=new String[logs.length];
		String tmp[]=new String[logs.length];
		HashMap<String,String> map=new HashMap<>();
		int idx=0;
		int idxtmp=0;
		for(String s:logs)
		{
			int n=s.split(" ")[1].charAt(0)-'0';
			if(n>=0 && n<=9)
			{
				tmp[idxtmp]=s;
				idxtmp++;
			}
			else
			{
				ans[idx]=s.substring(s.indexOf(" "));
				map.put(s.substring(s.indexOf(" ")), s);
				idx++;
			}
		}
		Arrays.sort(ans,0,idx);
		int j=0;
		for(int i=0;i<logs.length;i++)
		{
			if(ans[i]!=null)
				ans[i]=map.get(ans[i]);
			else
			{
				ans[i]=tmp[j];
				j++;
			}
		}
		return ans;
	}
}
