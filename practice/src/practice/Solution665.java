package practice;

import java.util.Arrays;

public class Solution665 {
	public boolean checkPossibility(int[] nums) {
		 int count=0;
		 for(int i=1;i<nums.length;i++)
		 {
			 if(nums[i]<nums[i-1])
			 {
				 count++;
				 if(i<2 || nums[i-2]<=nums[i])
					 nums[i-1]=nums[i];
				 else
					 nums[i]=nums[i-1];
				 
			 }
			 if(count>1)
				 return false;
		 }
		 return count<=1;
	 }
	//sol1
//	 public boolean checkPossibility(int[] nums) {
//		 int count=0;
//		 for(int i=1;i<nums.length;i++)
//		 {
//			 if(nums[i]<nums[i-1])
//			 {
//				 count++;
//				 if(i<2 || nums[i-2]<=nums[i])
//					 nums[i-1]=nums[i];
//				 else
//					 nums[i]=nums[i-1];
//				 
//			 }
//		 }
//		 return count<=1;
//	 }
}
