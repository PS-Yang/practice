package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Solution960 {
	//sol2
	public int minDeletionSize(String[] A) {
		int len=A[0].length(),ans=0;
		//dp array是在某位置排序正常的最長長度
		int dp[]=new int [len];
		Arrays.fill(dp, 1);
		for(int i=1;i<len;i++)
		{
			for(int j=0;j<i;j++)
			{
				int k=0;
				for(;k<A.length;k++)
					if(A[k].charAt(i)<A[k].charAt(j))
						break;
				if(k==A.length && dp[i]<dp[j]+1)
					dp[i]=dp[j]+1;	
			}
			ans=Math.max(ans, dp[i]);
		}
			
		return len-ans;
    }
	//sol1
//	public int minDeletionSize(String[] A) {
//		int len=A[0].length(),k,ans=len-1;
//		int dp[]=new int [len];
//		Arrays.fill(dp, 1);
//		for(int j=0;j<len;j++)
//		{
//			for(int i=0;i<j;i++)
//			{
//				for(k=0;k<A.length;k++)
//					if(A[k].charAt(i)>A[k].charAt(j))
//						break;
//				if(k==A.length && dp[i]+1>dp[j])
//					dp[j]=dp[i]+1;
//			}
//			ans=Math.min(ans, len-dp[j]);
//		}
//		return ans;
//    }
}
