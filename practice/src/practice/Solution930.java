package practice;

import java.util.ArrayList;

public class Solution930 {
	public int numSubarraysWithSum(int[] A, int S) {
        int ans=0;
        int sum_start=0,sum_end=0;
        int i_start=0,i_end=0;
		for(int i=0;i<A.length;i++)
		{
			sum_start=sum_start+A[i];
			while(i_start<i && sum_start>S)
				sum_start=sum_start-A[i_start++];
			
			sum_end=sum_end+A[i];
			while(i_end<i && (sum_end>S || (sum_end==S && A[i_end]==0)))
				sum_end=sum_end-A[i_end++];
			
			if(sum_start==S)
				ans=ans+i_end-i_start+1;
			
		}
		return ans;
    }
}
