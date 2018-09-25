package practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution909 {
	public int snakesAndLadders(int[][] board) {
		int n=board.length;
		if(n<3)
			return 1;
		int number[]=new int[n*n+1];
		int index=1;
		for(int i=board.length-1;i>=0;i--)
		{
			if((i%2==1 && n%2==0) || (i%2==0 && n%2==1))
			{
				for(int j=0;j<board.length;j++)
				{
					number[index]=board[i][j];
					index++;
				}
			}
			else
			{
				for(int j=board.length-1;j>=0;j--)
				{
					number[index]=board[i][j];
					index++;
				}
			}
		}
		int step=0;
		Queue<Integer> que=new LinkedList<>();
		que.offer(1);
		boolean flag=true;
		while(flag && step<=n*n)
		{
			step++;
			Object obj;
			Queue<Integer> temp=new LinkedList<>();
			HashSet<Integer> set=new HashSet<>();
			while((obj = que.poll()) != null)
			{
				int num= (Integer) obj;
				for(int i=1;i<=6;i++)
				{
					int tempnum=num+i;
					if(tempnum<=n*n)
					{
						if(number[tempnum]!=-1)
							tempnum=number[tempnum];
						if(set.add(tempnum))
							temp.offer(tempnum);
						if(tempnum==n*n)
							flag=false;
					}
				}
			}
			que.addAll(temp);
//			System.out.println(step);
		}
		if(!flag)
			return step;
		else
			return -1;
    }
//	public int snakesAndLadders(int[][] board) {
//		int n=board.length;
//		if(n<3)
//			return 1;
//		int number[]=new int[n*n+1];
//		int index=1;
//		for(int i=board.length-1;i>=0;i--)
//		{
//			if((i%2==1 && n%2==0) || (i%2==0 && n%2==1))
//			{
//				for(int j=0;j<board.length;j++)
//				{
//					number[index]=board[i][j];
//					index++;
//				}
//			}
//			else
//			{
//				for(int j=board.length-1;j>=0;j--)
//				{
//					number[index]=board[i][j];
//					index++;
//				}
//			}
//		}
//		int step=0;
//		Queue<Integer> que=new LinkedList<>();
//		que.offer(1);
//		boolean flag=true;
//		while(flag && step<n)
//		{
//			step++;
//			Object obj;
//			Queue<Integer> temp=new LinkedList<>();
//			HashSet<Integer> set=new HashSet<>();
//			while((obj = que.poll()) != null)
//			{
//				int num= (Integer) obj;
//				for(int i=1;i<=6;i++)
//				{
//					if(num+i<=n*n)
//					{
//						if(number[num+i]==-1)
//						{
//							if(set.add(num+i))
//								temp.offer(num+i);
//							if(num+i==n*n)
//								flag=false;
//						}
//						else
//						{
//							if(set.add(number[num+i]))
//								temp.offer(number[num+i]);
//							if(number[num+i]==n*n)
//								flag=false;
//						}
//					}
//				}
//			}
//			que.addAll(temp);
//			System.out.println(step);
//		}
//		if(step>=n)
//			return -1;
//		else
//			return step;
//    }
}
