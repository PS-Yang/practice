package practice;

public class Solution26 {
	public int removeDuplicates(int[] nums) {
		if(nums.length==0)
			return 0;
		int ans=1;
		for(int i=1;i<nums.length;i++)
		{
			if(nums[ans-1]!=nums[i])
			{
				nums[ans]=nums[i];
				ans++;
			}
		}
		return ans;
    }
}
