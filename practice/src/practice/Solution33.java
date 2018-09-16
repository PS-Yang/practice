package practice;

public class Solution33 {
	public int search(int[] nums, int target) {
		if(nums.length==0)
			return -1;
		int begin=0;
		int end=nums.length-1;
		while(begin<=end)
		{
			int mid=(begin+end)/2;
			if(nums[mid]==target)
				return mid;
			if(nums[begin]<=nums[mid] ) //前半段有排序
			{
				if(target <= nums[mid] && target>=nums[begin])
					end = mid-1;
				else
					begin=mid+1;
			}
			if(nums[mid]<=nums[end] ) //後半段有排序
			{
				if(target <= nums[end] && target>=nums[mid])
					begin=mid+1;	
				else
					end=mid-1;
			}
		}
        return -1;
    }
	
}
