package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-3;i++)
		{
			for(int j=i+1;j<nums.length-2;j++)
			{
				int mid=j+1;
				int end=nums.length-1;
				while(end>mid)
				{
					int temp=nums[i]+nums[j]+nums[mid]+nums[end];
					if(temp==target)
					{
						 ans.add(Arrays.asList(nums[i],nums[j],nums[mid], nums[end]));
						 while (mid < end && nums[mid] == nums[mid+1]) //若是mid與mid+1值一樣去除
							 mid++;
		                 while (mid < end && nums[end] == nums[end-1]) //若是end與end-1值一樣去除
		                	 end--;
		    			 mid++;
						 end--;
					 }
					 else if (temp < target) 
						 mid++;
		             else 
		            	 end--;
				}
				while (j<nums.length-2 && nums[j] == nums[j+1])
					 j++;
			}
		}
	 	return ans;
    }
}
