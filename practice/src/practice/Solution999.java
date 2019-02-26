package practice;

public class Solution999 {
	//sol2
	public int numRookCaptures(char[][] board) {
        int x0 = 0, y0 = 0;
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++) 
			{
				if(board[i][j]=='R')
				{
					x0=i;
					y0=j;
				}
			}
		}
		int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
		int count=0;
		for (int d[]:dir) 
		{
			for (int x = x0+d[0] , y= y0+d[1]; x>=0 && x < 8 && y>=0 && y<8; x+=d[0],y+=d[1] ) 
			{
				if(board[x][y]=='p')
					count++;
				if(board[x][y]!='.')
					break;
			}

		}
		return count;
    }
	
	//sol1
//	public int numRookCaptures(char[][] board) {
//        int count=0;
//		for (int i = 0; i < board.length; i++) 
//		{
//			for (int j = 0; j < board[i].length; j++) 
//			{
//				if(board[i][j]=='R')
//				{
//					int lx=i-1,rx=i+1,ty=j-1,dy=j+1;
//					while (lx>=0 && board[lx][j]=='.') 
//						lx--;
//					if(lx>=0 && board[lx][j]=='p')
//						count++;
//					while (rx<8 && board[rx][j]=='.') 
//						rx++;
//					if(rx<8 && board[rx][j]=='p')
//						count++;
//					
//					while (ty>=0 && board[i][ty]=='.') 
//						ty--;
//					if(ty>=0 && board[i][ty]=='p')
//						count++;
//					while (dy<8 && board[i][dy]=='.') 
//						dy++;
//					if(dy<8 && board[i][dy]=='p')
//						count++;
//				}
//			}
//		}
//		
//		return count;
//    }
}
