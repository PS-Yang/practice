package practice;

public class Solution303 {
	 private int[] ans;
	 public Solution303(int[] nums) {
		 ans=new int [nums.length];
		 if(nums.length!=0)
			 ans[0]=nums[0];
		 for(int i=1;i<nums.length;i++)
			 ans[i]=ans[i-1]+nums[i];
	}
	    
	public int sumRange(int i, int j) {
		if(i!=0)
			return ans[j]-ans[i-1];
		else
			return ans[j];
	}
//	private int[] ans;
//	 public Solution303(int[] nums) {
//		 ans=new int [nums.length+1];
//		 for(int i=0;i<nums.length;i++)
//			 ans[i+1]=ans[i]+nums[i];
//	}
//	    
//	public int sumRange(int i, int j) {
//			return ans[j+1]-ans[i];
//	}
}
