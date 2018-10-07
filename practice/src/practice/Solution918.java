package practice;

public class Solution918 {
	public int maxSubarraySumCircular(int[] A) {
		if(A.length==1)
			return A[0];
		int max=-30001;
		int sum=0;
		int total=0;
		int minsum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++)
		{
			sum=Math.max(A[i], sum+A[i]);
			max=Math.max(max, sum);
			minsum=Math.min(A[i], minsum+A[i]);
			min=Math.min(min, minsum);
			total=total+A[i];
		}
		if(max>0)
			max=Math.max(total-min,max);
		return max;
    }
	
}
