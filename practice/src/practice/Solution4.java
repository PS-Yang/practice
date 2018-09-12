package practice;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
		int i=-1,j=-1,count=0;
		int mid[]={0,0};
		while(count<=size/2)
		{
			if(i>=nums1.length-1)
			{
				mid[1]=mid[0];
				mid[0]=nums2[j+1];
				j++;
			}
			else if (j>=nums2.length-1)
			{
				mid[1]=mid[0];
				mid[0]=nums1[i+1];
				i++;
			}
			else if(nums1[i+1]<nums2[j+1])
			{
				mid[1]=mid[0];
				mid[0]=nums1[i+1];
				i++;
			}
			else
			{
				mid[1]=mid[0];
				mid[0]=nums2[j+1];
				j++;
			}
//			System.out.println(i+" "+j);	
			count++;
		}
		if(size%2==1)
            return (double)mid[0];
		else
			return (double)(mid[0]+mid[1])/2;

    }
}
