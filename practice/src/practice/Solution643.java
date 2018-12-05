package practice;

public class Solution643 {
	public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double sum=0;
        for(;i<k;i++)
        	sum+=nums[i];
        double max=sum;
        for(;i<nums.length;i++)
        {
        	sum+=nums[i]-nums[i-k];
        	max=Math.max(max, sum);
        }
        return max/k;
    }
}
