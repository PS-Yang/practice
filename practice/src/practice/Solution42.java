package practice;

public class Solution42 {
	public int trap(int[] height) {
		if(height.length<1)
			return 0;
		int leftmax[]=new int [height.length];
		int rightmax[]=new int [height.length];
		leftmax[0]=height[0];
		for(int i=1;i<height.length;i++)
			leftmax[i]=Math.max(leftmax[i-1], height[i]);
		
		rightmax[height.length-1]=height[height.length-1];
		for(int i=height.length-2;i>=0;i--)
			rightmax[i]=Math.max(rightmax[i+1], height[i]);
		
		int ans=0;
		for(int i=0;i<height.length;i++)
		{
			int min=Math.min(leftmax[i], rightmax[i]);
			if(min>height[i])
				ans=ans+min-height[i];
		}
        return ans;
    }
}
