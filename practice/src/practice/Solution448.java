package practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution448 {
	//sol 1
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new LinkedList<>();
        if(nums.length==0)
        	return ans;
        for(int i=0;i<nums.length;i++)
        {
        	int tmp=Math.abs(nums[i])-1;
        	if(nums[tmp]>0)
        		nums[tmp]=-nums[tmp];
        }
        for(int i=0;i<nums.length;i++)
        	if(nums[i]>0)
        		ans.add(i+1);
        	
        return ans;
    }
}
