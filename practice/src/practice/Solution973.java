package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Solution973 {
	//sol3 O(NlogN) using PriorityQueue
	public int[][] kClosest(int[][] points, int K) {
		PriorityQueue<int[]> queue=new PriorityQueue<>(K,Comparator.comparing(p -> p[0]*p[0]+p[1]*p[1]));
        for(int p[]:points)
        	queue.offer(p);
        
        int ans[][]=new int [K][2];
        int i=0;
        while (i<K) 
			ans[i++]=queue.poll();
        return ans;
    }
	
		// sol4 O(N)
//	 	private int[][] points;
//	    public int[][] kClosest(int[][] points, int K) {
//	        this.points = points;
//	        work(0, points.length - 1, K);
//	        return Arrays.copyOfRange(points, 0, K);
//	    }
//
//	    public void work(int i, int j, int K) {
//	        if (i >= j) return;
//	        int oi = i, oj = j;
//	        int pivot = dist(ThreadLocalRandom.current().nextInt(i, j));
//
//	        while (i < j) {
//	            while (i < j && dist(i) < pivot) i++;
//	            while (i < j && dist(j) > pivot) j--;
//	            swap(i, j);
//	        }
//
//	        if (K <= i - oi + 1)
//	            work(oi, i, K);
//	        else
//	            work(i+1, oj, K - (i - oi + 1));
//	    }
//
//	    public int dist(int i) {
//	        return points[i][0] * points[i][0] + points[i][1] * points[i][1];
//	    }
//
//	    public void swap(int i, int j) {
//	        int t0 = points[i][0], t1 = points[i][1];
//	        points[i][0] = points[j][0];
//	        points[i][1] = points[j][1];
//	        points[j][0] = t0;
//	        points[j][1] = t1;
//	    }
	//sol2 O(NlogN)
//	public int[][] kClosest(int[][] points, int K) {
//		Arrays.sort(points, Comparator.comparing(p -> p[0]*p[0]+p[1]*p[1]));
//		return Arrays.copyOfRange(points, 0, K);
//    }
	//sol1
//	public int[][] kClosest(int[][] points, int K) {
//		int ans[][]=new int[K][2];
//		int min[]=new int [K];
//		Arrays.fill(min, Integer.MAX_VALUE);
//        for(int p[]:points)
//        {
//        	int dis=p[0]*p[0]+p[1]*p[1];
//        	for (int i = 0; i < K; i++) 
//				if(dis<min[i])
//				{
//					for (int j = K-1; j >i ; j--) 
//					{
//						min[j]=min[j-1];
//						ans[j][0]=ans[j-1][0];
//						ans[j][1]=ans[j-1][1];
//						
//					}
//					min[i]=dis;
//					ans[i][0]=p[0];
//					ans[i][1]=p[1];
//					break;
//				}
//        }
//        return ans;
//    }
}
