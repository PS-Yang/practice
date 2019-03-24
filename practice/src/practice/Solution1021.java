package practice;


public class Solution1021 {
	public int maxScoreSightseeingPair(int[] A) {
		int max=0,cur=0;
		for (int a : A) {
			max=Math.max(max, a+cur);
			cur=Math.max(cur, a)-1;
		}
        return max;
    }
	//sol1
//	public int maxScoreSightseeingPair(int[] A) {
//		PriorityQueue queue = new PriorityQueue<Integer>(20,Collections.reverseOrder());  
//        for (int i = 1; i < A.length; i++) 
//        	queue.offer(A[i]-i);
//        
//        int max=-1;
//        for (int i = 0; i < A.length-1; i++) {
//			max=Math.max(max, A[i]+i+(int)queue.peek());
//			queue.remove(A[i+1]-(i+1));
//		}
//        return max;
//    }
}
