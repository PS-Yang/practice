package practice;

import java.util.HashMap;

public class Solution169 {
	//2. Moore voting algorithm
	public int majorityElement(int[] nums) {
		int count=0,ans=0;
		for(int num:nums)
		{
			if(count==0)
				ans=num;
			if(num!=ans)
				count--;
			else
				count++;
		}
        return ans;
    }
	//1. using hash
//	public int majorityElement(int[] nums) {
//		int n=nums.length/2;
//		HashMap<Integer,Integer> map=new HashMap<>();
//		int ans=0;
//		for(int num:nums)
//		{
//			int count=map.getOrDefault(num, 0)+1;
//			map.put(num, count);
//			if(count>n)
//			{
//				ans=num;
//				break;
//			}
//		}
//        return ans;
//    }
	
}
