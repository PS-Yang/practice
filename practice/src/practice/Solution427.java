package practice;

public class Solution427 {
	public Node construct(int[][] grid) {
		return generate(0,0,grid.length,grid);
    }
	public Node generate(int x,int y,int len,int[][] grid){
		if(len==1)
			return new Node(grid[x][y]!=0,true,null,null,null,null);
		Node ans=new Node();
		Node topleft=generate(x,y,len/2,grid);
		Node topright=generate(x,y+len/2,len/2,grid);
		Node bottonleft=generate(x+len/2,y,len/2,grid);
		Node bottonright=generate(x+len/2,y+len/2,len/2,grid);
		if(topleft.isLeaf && topright.isLeaf && bottonleft.isLeaf && bottonright.isLeaf &&
			topleft.val==topright.val && topright.val==bottonleft.val && bottonleft.val==bottonright.val)
		{
			ans.isLeaf=true;
			ans.val=topleft.val;
		}
		else
		{
			ans.bottomLeft=bottonleft;
			ans.bottomRight=bottonright;
			ans.topLeft=topleft;
			ans.topRight=topright;
		}
		return ans;
	}
}
