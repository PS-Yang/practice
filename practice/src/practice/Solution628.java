package practice;

import java.util.Arrays;

public class Solution628 {
	//sol1 using sorting
	public int maximumProduct(int[] nums) {
		int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int n:nums)
        {
        	if(n>=max)
        	{
        		max3=max2;
        		max2=max;
        		max=n;
        	}
        	else if(n>=max2)
        	{
        		max3=max2;
        		max2=n;
        	}
        	else if(n>=max3)
        		max3=n;
        	if(n<=min)
        	{
        		min2=min;
        		min=n;
        	}
        	else if(n<=min2)
        		min2=n;
        }
        return Math.max(max*max2*max3, min*min2*max);
    }
	//sol1 using sorting
//	public int maximumProduct(int[] nums) {
//        Arrays.sort(nums);
//        int N=nums.length;
//        int max=Integer.MIN_VALUE;
//        max=Math.max(max, nums[N-1]*nums[N-2]*nums[N-3]);
//        max=Math.max(max, nums[0]*nums[1]*nums[N-1]);
//        return max;
//    }
}
