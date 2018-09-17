package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution41 {
	public int firstMissingPositive(int[] nums) {
		if(nums.length==0)
			return 1;
		for(int i=0;i<nums.length;i++)
		{
			while(nums[i]>0 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]  )
			{
				int temp=nums[nums[i]-1];
				nums[nums[i]-1]=nums[i];
				nums[i]=temp;
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=i+1)
				return i+1;
		}
		return nums.length+1;
    }
//	//Hashset but space > O(1)
//	public int firstMissingPositive(int[] nums) {
//		int ans=1;
//		if(nums.length==0)
//			return ans;
//		HashSet<Integer> set=new HashSet<Integer>();
//		int size=0;
//		for(int i=0;i<nums.length;i++)
//		{
//			if(nums[i]>0 && set.add(nums[i]))
//			{
//				size++;
//			}
//		}
//		for(int i=1;i<=size+1;i++)
//		{
//			if(set.add(i))
//			{
//				ans=i;
//				break;
//			}
//		}
//        return ans;
//    }
}
