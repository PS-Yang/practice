package practice;

public class Solution598 {
	public int maxCount(int m, int n, int[][] ops) {
		if(ops==null || ops.length==0)
			return m*n;
		int minx=Integer.MAX_VALUE;
		int miny=Integer.MAX_VALUE;
        for(int num[]:ops)
        {
        	minx=Math.min(minx, num[0]);
        	miny=Math.min(miny, num[1]);
        }
        	
        
        return minx*miny;
    }
}
