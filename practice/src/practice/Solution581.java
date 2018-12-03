package practice;

import java.util.Arrays;

public class Solution581 {
	//sol2 O(N)
	public int findUnsortedSubarray(int[] nums) {
		int n=nums.length;
		int begin=-1,end=-2;
		int min=nums[n-1],max=nums[0];
		
		for(int i=1;i<n;i++)
		{
			min=Math.min(min, nums[n-i-1]);
			max=Math.max(max, nums[i]);
			if(nums[i]<max)
				end=i;
			if(nums[n-i-1]>min)
				begin=n-i-1;
		}
		return end-begin+1 > 0 ? end-begin+1 : 0;
    }
	
	//sol1 using sort O(NlogN)
//	public int findUnsortedSubarray(int[] nums) {
//		int nums2[]=nums.clone();
//		Arrays.sort(nums2);
//		int begin=nums.length;
//		int end=-1;
//		for(int i=0;i<nums.length;i++)
//		{
//			if(nums[i]!=nums2[i])
//			{
//				begin=Math.min(begin, i);
//				end=Math.max(end, i);
//			}
//		}
//		return end-begin+1 > 0 ? end-begin+1 : 0;
//    }
}
