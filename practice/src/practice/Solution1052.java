package practice;

public class Solution1052 {
	public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int ans=0,cur=0,max=0,i=0;
        while (i<grumpy.length)
        {
        	if(grumpy[i]==0)
				ans+=customers[i];
        	if(grumpy[i]==1)
        		cur+=customers[i];
        	if(i>=X && grumpy[i-X]==1)
				cur-=customers[i-X];
			i++;
			max=Math.max(max,cur);
		}
        ans+=max;
        return ans;
    }

}
