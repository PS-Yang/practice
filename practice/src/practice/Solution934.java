package practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution934 {
	public int shortestBridge(int[][] A) {		
		Queue<int[]> q=new LinkedList<>();
		HashSet<Integer> seen=new HashSet<>();
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				if(A[i][j]==1)
				{
					seen.add(i*A.length+j);
				}
			}
		}
		System.out.println(seen);
		int ans=0;
		return ans;
    }
}
