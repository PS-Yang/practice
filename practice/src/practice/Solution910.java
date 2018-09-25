package practice;

import java.util.Arrays;

public class Solution910 {
	public int smallestRangeII(int[] A, int K) {
		if(A.length<2)
			return 0;
        Arrays.sort(A);
        int max=A[A.length-1];
        int min=A[0];
        int ans=max-min;
        for(int i=0;i<A.length-1;i++)
        {
           max=Math.max(A[i]+K ,A[A.length-1]-K);
           min=Math.min(A[i+1]-K,A[0]+K);
           ans=Math.min(ans,max-min);
        }
        return ans;
    }
}
