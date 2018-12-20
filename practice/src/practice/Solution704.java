package practice;

public class Solution704 {
	public int search(int[] nums, int target) {
        int i=0,j=nums.length-1,mid;
        while(i<=j)
        {
        	mid=i+(j-i)/2;
        	if(nums[mid]>target)
        		j=mid-1;
        	else if(nums[mid]<target)
        		i=mid+1;
        	else 
        		return mid;
        }
        
        return -1; 
    }
}
