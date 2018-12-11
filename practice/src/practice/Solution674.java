package practice;

public class Solution674 {
	public int findLengthOfLCIS(int[] nums) {
		if(nums.length==0)
			return 0;
        int ans=1,cur=0;
        for(int i=0;i<nums.length-1;i++)
        {
        	if(nums[i]<nums[i+1])
        		ans=Math.max(ans, ++cur);
        	else
        		cur=1;
        }
        return ans;
    }
}
