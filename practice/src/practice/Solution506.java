package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution506 {
	//sol1 O(nlogn)
	public String[] findRelativeRanks(int[] nums) {
		HashMap<Integer,Integer> map=new HashMap<>(); //value => index;
		for(int i=0;i<nums.length;i++)
			map.put(nums[i], i);
		Arrays.sort(nums); 
		String ans[]=new String[nums.length];
		int count=1;
		for(int i=nums.length-1;i>=0;i--)
		{
			if(i==nums.length-1)
				ans[map.get(nums[i])]="Gold Medal";
			else if(i==nums.length-2)
				ans[map.get(nums[i])]="Silver Medal";
			else if(i==nums.length-3)
				ans[map.get(nums[i])]="Bronze Medal";
			else
				ans[map.get(nums[i])]=""+count;
			count++;
		}
		return ans;
    }
}
