package practice;

import java.util.HashSet;

public class Solution956 {
	//sol2
//	public int tallestBillboard(int[] rods) {
//		int dp[]=new int [5001];
//		Arrays.fill(dp, -10000);
//		dp[0]=0;
//		for(int r:rods)
//		{
//			int cur[]=dp.clone();
//			for(int i=0;i+r<5001;i++)
//			{
//				dp[i+r]=Math.max(cur[i],dp[i+r]);
//				dp[Math.abs(i-r)]=Math.max(dp[Math.abs(i-r)], cur[i]+Math.min(i, r));
//			}
//		}
//			
//		return dp[0];
//    }
	//sol1
	public int tallestBillboard(int[] rods) {
		int N=rods.length;
		boolean dp[][]=new boolean[N+1][10001];
		int max[][]=new int[N+1][10001];
		dp[0][5000] = true;
		for(int i=0;i<N;i++)
			for(int j=0;j<10001;j++)
			{
				if(j-rods[i]>=0 && dp[i][j-rods[i]])
				{
					dp[i+1][j]=true;
					max[i+1][j]=Math.max(max[i+1][j], max[i][j-rods[i]]+rods[i]);
				}
				if(j+rods[i]<10001 && dp[i][j+rods[i]])
				{
					dp[i+1][j]=true;
					max[i+1][j]=Math.max(max[i+1][j], max[i][j+rods[i]]);
				}
				if(dp[i][j])
				{
					dp[i+1][j]=true;
					max[i+1][j]=Math.max(max[i+1][j], max[i][j]);
				}
			}
		return max[N][5000];
    }
}
