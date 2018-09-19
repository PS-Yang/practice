package practice2;

import java.util.Arrays;

public class SolutionC17_1 {
	public int solution(int[] A) {
        // write your code in Java SE 8
		int dpsum[]=new int [A.length];
		dpsum[0]=A[0];
		for(int i=1;i<A.length;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int die=1;die<=6;die++)
			{
				if(i-die>=0)
					max=Math.max(max, A[i]+dpsum[i-die]);
			}
			dpsum[i]=max;
		}
		return dpsum[A.length-1];
    }
	public int solution2(int[] A) {
        // write your code in Java SE 8
		if(A.length==0)
			return 0;
		if(A.length==1)
			return Math.abs(A[0]);
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			A[i]=Math.abs(A[i]);
			max=Math.max(max, A[i]);
			sum=sum+A[i];
		}
		int sumA=A[0];
		int sumB=A[1];
		for(int i=2;i<A.length;i++)
		{
			if(sumA<sumB)
				sumA=sumA+A[i];
			else
				sumB=sumB+A[i];
		}
		int currentmin=Math.abs(sumA - sumB);
		sumA=A[0]+A[1];
		sumB=0;
		for(int i=2;i<A.length;i++)
		{
			if(sumA<sumB)
				sumA=sumA+A[i];
			else
				sumB=sumB+A[i];
		}
		return currentmin=Math.min(currentmin, Math.abs(sumA - sumB));
		
//		int[] dp=new int[A.length];
//		dp[0]=Math.abs(A[0]);
//		for(int i=1;i<A.length;i++)
//		{
//			dp[i]=Math.min(Math.abs(dp[i-1]-A[i]), Math.abs(dp[i-1]+A[i]));
//		}
//		return dp[A.length-1];
    }
}
