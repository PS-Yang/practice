package practice;

public class Solution34 {
	public int[] searchRange(int[] nums, int target) {
		int ans[]={-1,-1};
		if(nums.length==0)
			return ans;
		if(nums.length==1)
		{
			if(nums[0]==target)
				return new int[]{0, 0};
			else
				return ans;
		}
		ans[0]=findbegin(0,nums.length-1,nums,target);
		if(ans[0]!=-1)
			ans[1]=findend(0,nums.length-1,nums,target);
		return  ans;
    }
	private int findbegin(int begin,int end,int[] nums,int target){
		int index=-1;
		while(begin<=end)
		{
			int mid=(begin+end)/2;
			if(nums[mid]>=target)
				end=mid-1;
			else
				begin=mid+1;
			if(nums[mid]==target)
				index=mid;
		}
		return index;
	}
	private int findend(int begin,int end,int[] nums,int target){
		int index=-1;
		while(begin<=end)
		{
			int mid=(begin+end)/2;
			if(nums[mid]<=target)
				begin=mid+1;
			else
				end=mid-1;
			if(nums[mid]==target)
				index=mid;
		}
		return index;
	}
}
// //1版
//public int[] searchRange(int[] nums, int target) {
//	int ans[]={-1,-1};
//	if(nums.length==0)
//		return ans;
//    if(nums.length==1)
//	{
//		if(nums[0]==target)
//		{
//			ans[0]=0;
//			ans[1]=0;
//		}
//		return ans;
//	}
//	int begin=0;
//	int end=nums.length-1;
//	while(begin<=end)
//	{
//		int mid=(begin+end)/2;
//		if(nums[mid]==target)
//		{
//			ans[0]=mid;
//			ans[1]=mid;
//			while(ans[0]>0 && nums[ans[0]]==nums[ans[0]-1])
//				ans[0]--;
//			while(ans[1]<nums.length-1 && nums[ans[1]]==nums[ans[1]+1])
//				ans[1]++;
//            break;
//		}
//		else if(nums[mid]>target)
//			end=mid-1;
//		else
//			begin=mid+1;
//	}
//    return ans;
//}
