package practice;

public class Solution724 {
	public int pivotIndex(int[] nums) {
        int sum=0;
		for (int n:nums) 
			sum+=n;
		int i=0, left=0;
		for (; i < nums.length; i++) 
		{
			if(i>0)
				left+=nums[i-1];
			sum-=nums[i];
			if(left==sum)
				break;
		}
		return i==nums.length ? -1 : i;
    }
}
