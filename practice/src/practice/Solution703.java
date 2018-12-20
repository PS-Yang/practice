package practice;

import java.util.PriorityQueue;

public class Solution703 {
	//sol1
	private PriorityQueue<Integer> que;
	private int k=0;
	public Solution703(int k, int[] nums) {
        this.k=k;
        que=new PriorityQueue<>(k);
		for(int n:nums)
        	add(n);
    }
    
    public int add(int val) {
    	
        if(que.size()<k)
        	que.offer(val);
        else if(que.peek()<val)
        {
        	que.poll();
        	que.offer(val);
        }
    	return que.peek();
    }
}
