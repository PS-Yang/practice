package practice;

public class Solution959 {
	private int count,n;
	private int parent[];
	public int regionsBySlashes(String[] grid) {
        n=grid.length;
        count=n*n*4;
        parent=new int [count];
        for(int i=0;i<count;i++)
        	parent[i]=i;
        // top:0 , right:1 , down:2 , left:3
        for(int i=0;i<n;i++)
        	for(int j=0;j<n;j++)
        	{
        		if(i>0)
        			union(number(i-1,j,2),number(i,j,0));
        		if(j>0)
        			union(number(i,j-1,1),number(i,j,3));
        		if(grid[i].charAt(j)!='/')
        		{
        			union(number(i,j,0),number(i,j,1));
        			union(number(i,j,2),number(i,j,3));
        		}
        		if(grid[i].charAt(j)!='\\')
        		{
        			union(number(i,j,0),number(i,j,3));
        			union(number(i,j,1),number(i,j,2));
        		}
        	}
        return count;
    }
	
	private int find(int x) {
		if(parent[x]!=x)
			  parent[x]=find(parent[x]);
		return parent[x]; 
	}
	private void union(int x,int y){
//		parent[find(x)]=find(y);
		int parx=find(x);
		int pary=find(y);
		if(parx!=pary)
		{
			parent[parx]=pary;
			count--;
		}
	}
	private int number(int i, int j, int k) {
	        return 4*(i*n+j)+k;
	}
}
