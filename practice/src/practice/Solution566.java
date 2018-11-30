package practice;

public class Solution566 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row=nums.length;
        int column=nums[0].length;
        if(row*column!=r*c)
        	return nums;
        int ans[][]=new int[r][c];
        int i=0,j=0;
        for(int num[]:nums)
        	for(int n:num)
        	{
        		ans[i][j]=n;
        		j++;
        		if(j==c)
        		{
        			i++;
        			j=0;
        		}
        	}
        return ans;
    }
}
