package practice;

public class Solution931 {
	public int minFallingPathSum(int[][] A) {
		if(A.length==1)
			return A[0][0];
		//first row not change.   
		//min of A[i-1][j-1] , A[i-1][j] , A[i-1][j+1]
		int ans=Integer.MAX_VALUE;
		for(int i=1;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				A[i][j]=A[i][j]+Math.min(A[i-1][Math.max(0,j-1)], Math.min(A[i-1][j], A[i-1][Math.min(A.length-1,j+1)]));
				if(i==A.length-1)
					ans=Math.min(ans, A[i][j]);
			}
		}
        return ans;
    }
}
