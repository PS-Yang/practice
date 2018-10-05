package practice;

public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		int begin=0;
		int end=nums.length-1;
		int ans=0;
		while(begin<=end)
		{
			int mid=(begin+end)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]>target)
			{
				end=mid-1;
				ans=mid;
			}
			else
			{
				begin=mid+1;
				ans=begin;
			}
		}
		if(ans==-1)
			return 0;
		return ans;
    }
}
