package practice;

public class Solution70 {
	//using dp
	public int climbStairs(int n) {
		int[] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
      	for(int i=2;i<=n;i++)
      		dp[i]=dp[i-1]+dp[i-2];
      	return dp[n];
    }
//	//遞回
//	public int climbStairs(int n) {
//        if(n==1)
//        	return 1;
//        else if(n==2)
//        	return 2;
//        else
//        	return climbStairs(n-1)+climbStairs(n-2);
//    }
}
