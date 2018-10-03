package practice;

import java.util.Arrays;

public class Solution16 {
	public int threeSumClosest(int[] nums, int target) {
		int ans=0;
		if(nums.length<4)
		{
			for(int n:nums)
				ans=ans+n;
			return ans;
		}
        Arrays.sort(nums);
        ans=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++)
        {
        	int mid=i+1;
        	int end=nums.length-1;
        	while(mid<end)
        	{
        		int temp=nums[i]+nums[mid]+nums[end];
        		if(Math.abs(target-ans)>Math.abs(target-temp))
        			ans=temp;
        		if(temp==target)
        			return target;
        		else if(temp>target)
        			end--;
        		else
					mid++;
        		
        	}
        }
        return ans;
    }
}
