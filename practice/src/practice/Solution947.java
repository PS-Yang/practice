package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Solution947 {
	
	private int parent[]=new int [20000];
	public int removeStones(int[][] stones) {
		for(int i=0;i<20000;i++)
			parent[i]=i;
		
		for(int stone[]:stones)
			parent[find(stone[0])]=find(stone[1]+10000);
		
		HashSet<Integer> par=new HashSet<>();
		for(int stone[]:stones)
			par.add(find(stone[0]));

		return stones.length-par.size();
  	}
	public int find(int x) {
		if(parent[x]!=x)
			  parent[x]=find(parent[x]);
		return parent[x]; 
	}

	//sol1
//	private int[] parent=new int[20000];
//	public int removeStones(int[][] stones) {
//		for (int i=0;i<20000;i++)
//	         parent[i]=i;
//		
//		int N=stones.length;
//		for(int []stone:stones)
//			union(stone[0],stone[1]+10000);
//		
//		HashSet<Integer> set=new HashSet<>();
//		for(int []stone:stones)
//			set.add(find(stone[0]));
//		
//		return N-set.size();	
//	}
//	
//	public int find(int x) {
//	      if(parent[x]!=x)
//	    	  parent[x]=find(parent[x]);
//	      return parent[x];
//	}
//	
//	public void union(int x,int y) {
//		parent[find(x)]=find(y);
//	}  

  



//	public int removeStones(int[][] stones) {
//		int N=stones.length;
//		int parent[]=new int[N];
//		for(int i=0;i<N;i++)
//			parent[i]=i;
//		for(int i=0;i<N;i++)
//			for(int j=0;j<N;j++)
//				if( parent[i]!=parent[j] && (stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]) )
//				{
//					if(parent[j]>parent[i])
//						parent[j]=parent[i];
//					else
//						parent[i]=parent[j];
//				}
//					
//		
//		HashSet<Integer> set=new HashSet<>();
//		for(int i=0;i<N;i++)
//			set.add(parent[i]);
//		return N-set.size();
//    }

}
