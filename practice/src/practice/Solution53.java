package practice;

public class Solution53 {
	// 2版 O(n) space O(1)
	public int maxSubArray(int[] nums) {
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		int max=nums[0];
		int sum=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			sum=Math.max(nums[i], sum+nums[i]);
			max=Math.max(max, sum);
		}
		return max;
	}	
	
//	// 3版 使用DP 概念差不多 O(N) space O(N)
//	public int maxSubArray(int[] nums) {
//		if(nums.length==0)
//			return 0;
//		if(nums.length==1)
//			return nums[0];
//		int dpsum[]=new int [nums.length];
//		int max=nums[0];
//		dpsum[0]=nums[0];
//		for(int i=1;i<nums.length;i++)
//		{
//			if(dpsum[i-1]>0) //檢查前面總合是否>0
//				dpsum[i]=dpsum[i-1]+nums[i];
//			else
//				dpsum[i]=nums[i];
//			if(max<dpsum[i])
//				max=dpsum[i];
//		}
//		return max;
//	}	
	
//	// 1版 O(n) space O(1)
//	public int maxSubArray(int[] nums) {
//		if(nums.length==0)
//			return 0;
//		if(nums.length==1)
//			return nums[0];
//		int max=nums[0];
//		int sum=nums[0];
//		for(int i=1;i<nums.length;i++)
//		{
//			if(sum+nums[i]>nums[i])
//				sum=sum+nums[i];
//			else 
//				sum=nums[i];
//			if(sum>max)
//				max=sum;
//		}
//		return max;
//	}	
	
//	// 4版 O(nlogn) divide 
//	public int maxSubArray(int[] nums) {
//		if(nums.length==0)
//			return 0;
//		if(nums.length==1)
//			return nums[0];
//		int max=0;
//		max=max(nums,0,nums.length-1);
//		return max;
//	}	
//	private int max(int[]nums,int begin,int end)
//	{
//		if(begin-end==0)
//			return nums[end];
//		int mid=(begin+end)/2;
//		int sum=0;
//		int left=max(nums,begin,mid);
//		int right=max(nums,mid+1,end);
//		int leftmax=Integer.MIN_VALUE;
//		int rieghtmax=Integer.MIN_VALUE;
//		for(int i=begin;i<mid;i++)
//		{
//			sum=sum+nums[i];
//			leftmax=Math.max(sum, leftmax);
//		}
//		sum=0;
//		for(int i=mid;i<end;i++)
//		{
//			sum=sum+nums[i];
//			rieghtmax=Math.max(sum, rieghtmax);
//		}
//		int ans=Math.max(left,right);
//		return Math.max(ans, leftmax+rieghtmax);
//	}
}
    

