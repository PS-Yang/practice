package practice;

import java.util.TreeMap;


public class Solution975 {
	//sol2
	public int oddEvenJumps(int[] A) {
        int len=A.length,count=1;
        boolean high[]=new boolean[len];
        boolean low[]=new boolean[len];
        high[len-1]=true;
        low[len-1]=true;
        TreeMap<Integer, Integer> map=new TreeMap<>();
        map.put(A[len-1], len-1);
        for (int i = len-2; i >= 0; i--) 
        {
			Integer hi=map.ceilingKey(A[i]), lo=map.floorKey(A[i]);
			if(hi!=null)
				high[i]=low[map.get(hi)];
			if(lo!=null)
				low[i]=high[map.get(lo)];
			if(high[i])
				count++;
			map.put(A[i], i);
		}
        return count;
    }
	// Wrong Answer 看錯題目 要跳到最小值
//	public int oddEvenJumps(int[] A) {
//        int count=1;
//        for (int i = 0; i < A.length; i++) 
//        {
//			int prev=A[i];
//			int times=1;
//			for (int j = i+1; j < A.length; j++) 
//			{
//				if(times==1 && prev<=A[j])
//				{
//					prev=A[j];
//					times=0;
//					if(j==A.length-1)
//						count++;
//				}
//				else if(times==0 && prev>=A[j])
//				{
//					prev=A[j];
//					times=1;
//					if(j==A.length-1)
//						count++;
//				}
//			}
//			
//		}
//        return count;
//    }
}
