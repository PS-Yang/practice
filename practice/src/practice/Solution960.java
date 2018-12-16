package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Solution960 {
	//sol1
	public int minDeletionSize(String[] A) {
		int len=A[0].length(),k,ans=len-1;
		int dp[]=new int [len];
		Arrays.fill(dp, 1);
		for(int j=0;j<len;j++)
		{
			for(int i=0;i<j;i++)
			{
				for(k=0;k<A.length;k++)
					if(A[k].charAt(i)>A[k].charAt(j))
						break;
				if(k==A.length && dp[i]+1>dp[j])
					dp[j]=dp[i]+1;
			}
			ans=Math.min(ans, len-dp[j]);
		}
		return ans;
    }
}
