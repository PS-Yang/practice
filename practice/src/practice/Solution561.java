package practice;

import java.util.Arrays;

public class Solution561 {
//  //1.array sort and find.
	public int arrayPairSum(int[] nums) {
        int sum=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i=i+2)
			sum=sum+nums[i];
		return sum;
    }
//	//2.not sort , count number of occurrences
//	public int arrayPairSum(int[] nums) {
//		int  countnums[] = new int[20001];
//		//consider nums's range in  [-10000, 10000], so +10000.
//		for (int i = 0; i < nums.length; i++) 
//			countnums[nums[i]+10000]++;
//		int sum = 0;
//		boolean odd = true;
//		for (int i = 0; i < countnums.length; i++) 
//		{
//			while (countnums[i] > 0) 
//			{
//				if (odd) 
//					sum =sum+i-10000;
//				odd = !odd;
//				countnums[i]--;
//			}	
//		}
//		return sum;
//	}
}
