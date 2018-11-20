package practice;

public class Solution485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int n:nums)
        {
        	if(n==1)
        		count++;
        	else
        	{
        		max=Math.max(count, max);
        		count=0;
        	}
        }
        max=Math.max(count, max);
        return max;
    }
}
