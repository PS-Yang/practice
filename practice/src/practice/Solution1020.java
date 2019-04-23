package practice;

public class Solution1020 {
	
	//sol1
	public int numEnclaves(int[][] A) {
		int count=0;
        for (int i = 0; i < A.length; i++) 
			for (int j = 0; j < A[i].length; j++) 
				if (A[i][j]==1 && (i==0 || j==0 || i==A.length-1 || j==A[i].length-1)) 
					dfs(A,i,j);
        for (int i = 0; i < A.length; i++) 
			for (int j = 0; j < A[i].length; j++) 
				if(A[i][j]==1)
					count++;
        return count;
    }
	private void dfs(int[][]A,int x,int y) {
		if(x<0 || x>=A.length || y<0 || y>=A[x].length || A[x][y]==0)
			return ;
		A[x][y]=0;
		dfs(A, x-1, y);
		dfs(A, x+1, y);
		dfs(A, x, y-1);
		dfs(A, x, y+1);
	}
}
