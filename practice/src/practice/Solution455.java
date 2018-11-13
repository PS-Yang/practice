package practice;

import java.util.Arrays;
import java.util.HashMap;

public class Solution455 {
	//sol2 time O(nlogn)
	public int findContentChildren(int[] g, int[] s) {
		if(g.length==0 || s.length==0)
			return 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int i=0;
		int j=0;
		while(i<g.length && j<s.length)
		{
			if(g[i]<=s[j])
				i++;
			j++;
		}
		return i;
    }
//	//sol1 time O(nlogn)
//	public int findContentChildren(int[] g, int[] s) {
//		if(g.length==0 || s.length==0)
//			return 0;
//		int ans=0;
//		Arrays.sort(g);
//		Arrays.sort(s);
//		int i=g.length-1;
//		int j=s.length-1;
//		while(i>=0 && j>=0)
//		{
//			if(g[i]>s[j])
//				i--;
//			else
//			{
//				i--;
//				j--;
//				ans++;
//			}
//		}
//		return ans;
//    }
}
