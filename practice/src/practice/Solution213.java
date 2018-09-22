package practice;

public class Solution213 {
	//分成兩邊考慮，包含第一個的MAX與包涵最後一個MAX
	public int rob(int[] nums) {
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		if(nums.length==2)
			return Math.max(nums[0], nums[1]);
		//包含第一個的情況
		int prev=nums[0];
		int max=Math.max(prev, nums[1]);
		int temp;
		for(int i=2;i<nums.length-1;i++)
		{
			temp=max;
			max=Math.max(max, prev+nums[i]);
			prev=temp;
		}
		
		prev=nums[1];
		int maxlast=Math.max(prev, nums[2]);;
		for(int i=3;i<nums.length;i++)
		{	
			temp=maxlast;
			maxlast=Math.max(maxlast, prev+nums[i]);
			prev=temp;
		}
	    return Math.max(max, maxlast);
	}
}
