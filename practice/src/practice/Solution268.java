package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Solution268 {
	//2 using hashset
	public int missingNumber(int[] nums) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int n:nums)
			set.add(n);
		int i=0;
		for(;i<nums.length;i++)
			if(set.add(i))
				break;
		return i;
    }
//	//1. using sort
//	public int missingNumber(int[] nums) {
//		Arrays.sort(nums);		
//		int i=0;
//		for(i=0;i<nums.length;i++)
//			if(i!=nums[i])
//				break;
//		return i;
//    }
}
