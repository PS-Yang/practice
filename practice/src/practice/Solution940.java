package practice;

import java.util.HashSet;

public class Solution940 {
	public int distinctSubseqII(String S) {
        int MOD=1000000007;
        int dp[]=new int[S.length()+1];
        dp[0]=1;
        int last[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        
        for(int i=0;i<S.length();i++)
        {
        	int n=S.charAt(i)-'a';
        	dp[i+1]=dp[i]*2%MOD;
        	if(last[n]>=0)
        		dp[i+1]=dp[i+1]-dp[last[n]];
        	dp[i+1]=dp[i+1]%MOD;
        	last[n]=i;
        }	
        dp[S.length()]--;
        if(dp[S.length()]<0)
        	dp[S.length()]=dp[S.length()]+MOD;
        return dp[S.length()];
//        return dp[S.length()]<0 ? dp[S.length()]+MOD:dp[S.length()];
    }
}
