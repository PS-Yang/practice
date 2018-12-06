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
		 }
		 return count<=1;
	 }
//	 public boolean checkPossibility(int[] nums) {
//		 int prev=nums[0];
//		 int count=0;
//		 for(int i=1;i<nums.length;i++)
//		 {
//			 if(nums[i]>prev)
//			 {
//				 nums[i-1]=nums[i];
//				 nums[i]=prev;
//				 count++;
//			 }
//				 
//			 prev=nums[i];	 
//		 }
//		 return count==1;
//	 }
}
