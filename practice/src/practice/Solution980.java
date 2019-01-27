package practice;



public class Solution980 {
	private int ans=0,startx=-1,starty=-1,endx=-1,endy=-1,len=0;
	public int uniquePathsIII(int[][] grid) {
        for (int i = 0; i < grid.length; i++) 
        	for (int j = 0; j < grid[0].length; j++) 
        	{
        		if (grid[i][j]==0) 
					len++;
        		else if(grid[i][j]==2)
				{
					endx=i;
					endy=j;
					len++;
				}
				else if(grid[i][j]==1)
				{
					startx=i;
					starty=j;
				}
			}
        System.out.println(len);
        path(grid,startx,starty);
        
        return ans;
    }
	private void path(int[][] grid,int x, int y) 
	{
		if(!(x<grid.length && x>=0 && y<grid[0].length && y>=0 && grid[x][y]>=0))
			return ;
		if(x==endx && y==endy && len==0)
		{
			ans++;
			return ;
		}
		grid[x][y]=-2;
		len--;
		path(grid,x+1,y);
		path(grid,x-1,y);
		path(grid,x,y+1);
		path(grid,x,y-1);
		grid[x][y] = 0;
		len++;
	}
}
