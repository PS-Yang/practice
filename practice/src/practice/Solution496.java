package practice;

public class Solution496 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int [nums1.length];
		for(int i=0;i<nums1.length;i++)
		{
			int tmp=-1;
			boolean flag=false;
			for(int j=0; j<nums2.length;j++)
			{
				if(flag && nums2[j]>nums1[i])
				{
					tmp=nums2[j];
					break;
				}
				else if(nums1[i]==nums2[j])
					flag=true;			
			}
			ans[i]=tmp;
		}
			
		return ans;
    }
}
