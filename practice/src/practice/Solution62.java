package practice;

public class Solution62 {
	//2 using dp.
	public int uniquePaths(int m, int n) {
       int dp[][]=new int[m][n];
       for(int i=0;i<m;i++)
    	   dp[i][0]=1;
       for(int i=0;i<n;i++)
    	   dp[0][i]=1;
       for(int i=1;i<m;i++)
    	   for(int j=1;j<n;j++)
    		   dp[i][j]=dp[i-1][j]+dp[i][j-1];
       return dp[m-1][n-1];		
    }
	//1 total!/(m!*n!)
//	public int uniquePaths(int m, int n) {
//        long ans=1;
//        int max=Math.max(m-1, n-1);
//        int min=Math.min(m-1, n-1);
////        System.out.println((m-1)+" "+(n-1)+" "+(m+n-2));
//        for(int i=max+1;i<=m+n-2;i++)
//        	ans=ans*i;
//        for(int i=1;i<=min;i++)
//        	ans=ans/i;
//		return (int)ans;		
//    }
}
