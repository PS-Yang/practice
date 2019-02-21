package practice;


import java.util.LinkedList;
import java.util.Queue;



public class Solution994 {
	//sol1
	public int orangesRotting(int[][] grid) {
        int m=grid.length, n=grid[0].length,total=0,count=0;
        Queue<int[]> queue=new LinkedList<int[]>();
        for (int i = 0; i < m; i++) 
        {
			for (int j = 0; j < n; j++) 
			{
				if(grid[i][j]==1)
					total++;
				if(grid[i][j]==2)
					queue.offer(new int[]{i,j});
			}
		}
        if(total==0)
        	return 0;
        int arr[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while (!queue.isEmpty()) 
        {
			count++;
			int size=queue.size();
			for (int i = 0; i < size; i++) 
			{
				int tmp[]=queue.poll();
				for (int a[]:arr) 
				{
					int x=tmp[0]+a[0];
					int y=tmp[1]+a[1];
					if(x<0 || x>=m || y<0 || y>=n || grid[x][y]==2 || grid[x][y]==0)
						continue;
					grid[x][y]=2;
					queue.offer(new int[]{x , y});
					total--;
				}
			}
		}
       
        return total==0?count-1:-1;
    }
}
