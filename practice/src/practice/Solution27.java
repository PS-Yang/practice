package practice;

public class Solution27 {
	public int removeElement(int[] nums, int val) {
		if(nums.length==0)
			return 0;
		int idx=nums.length-1;
		int ans=nums.length;
		while(idx>=0 && nums[idx]==val)
		{
			idx--;
			ans--;
		}
		for(int i=0;i<ans;i++)
		{
			if(nums[i]==val)
			{
				int temp=nums[i];
				nums[i]=nums[idx];
				nums[idx]=temp;
				idx--;
				ans--;
			}
			while(nums[idx]==val)
			{
				idx--;
				ans--;
			}
		}
		return ans;
    }
}
