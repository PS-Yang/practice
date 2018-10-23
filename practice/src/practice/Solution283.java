package practice;

import java.util.Arrays;

public class Solution283 {
	public void moveZeroes(int[] nums) {
		int idx=0;
		for(int n:nums)
		{
			if(n!=0)
				nums[idx++] = n;
		}
		while (idx < nums.length) 
	        nums[idx++] = 0;
    }
}
