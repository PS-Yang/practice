package practice;

public class Solution661 {
	
	public int[][] imageSmoother(int[][] M) {
		int r=M.length;
        int c=M[0].length;
        int ans[][]=new int [r][c];
        
        for(int i=0;i<r;i++)
        	for(int j=0;j<c;j++)
        	{
        		int count=0;
        		for(int l=i-1;l<=i+1;l++)
        			for(int m=j-1;m<=j+1;m++)
        				if(l>=0 && l<r && m>=0 && m<c)
        				{
        					ans[i][j]+=M[l][m];
        					count++;
        				}		
        		ans[i][j]/=count;	
        	}
        	
        return ans;
    }
}
