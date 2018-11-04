package practice;

public class Solution414 {
	public int thirdMax(int[] nums) {
		if(nums.length<=0)
			return 0;
		if(nums.length<3)
		{
			int tmp=Integer.MIN_VALUE;
			for(int n:nums)
				tmp=Math.max(tmp, n);
			return tmp;
		}
		Integer max=null;// 1 max
		Integer max2=null;//2th max
		Integer max3=null;//3rd max
        
        for(Integer n:nums)
        {
        	if(n.equals(max) || n.equals(max2)|| n.equals(max3))
        		continue;
        	if(max==null || n>max)
        	{
        		max3=max2;
    			max2=max;
    			max=n;
        	}
        	else if(max2==null || n>max2)
        	{
        		max3=max2;
        		max2=n;
        	}
        	else if(max3==null || n>max3)
        	{
        		max3=n;
        	}
        }
        if(max3==null)
        	return max;
        else
        	return max3;
//      return max3 == null ? max : max;
    }
}
