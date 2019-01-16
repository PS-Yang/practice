package practice;

import java.util.TreeMap;


public class Solution975 {
	//sol2
	public int oddEvenJumps(int[] A) {
		int count=1,n=A.length;
		boolean odd[]=new boolean[n]; 
		boolean even[]=new boolean[n];
		odd[n-1]=true; //最後一個為True
		even[n-1]=true;//最後一個為True
		TreeMap<Integer, Integer> map=new TreeMap<>();
		map.put(A[n-1], n-1);
		for (int i = n-2; i >= 0; i--) 
		{
			Integer floor=map.floorKey(A[i]); //返回最小的>=A[i]的Key值
			Integer ceil=map.ceilingKey(A[i]); //返回最大的<=A[i]的Key值
			if (ceil!=null)
				odd[i]=even[map.get(ceil)];
			if (floor!=null)
				even[i]=odd[map.get(floor)];
			if (odd[i]) 
				count++;
			map.put(A[i], i);
		}
		return count;
	}
	//sol2
//	public int oddEvenJumps(int[] A) {
//        int len=A.length,count=1;
//        boolean high[]=new boolean[len];
//        boolean low[]=new boolean[len];
//        high[len-1]=true;
//        low[len-1]=true;
//        TreeMap<Integer, Integer> map=new TreeMap<>();
//        map.put(A[len-1], len-1);
//        for (int i = len-2; i >= 0; i--) 
//        {
//			Integer hi=map.ceilingKey(A[i]); //返回最小的>=A[i]的Key值
//			Integer lo=map.floorKey(A[i]);	 //返回最大的<=A[i]的Key值
//			if(hi!=null)
//				high[i]=low[map.get(hi)];
//			if(lo!=null)
//				low[i]=high[map.get(lo)];
//			if(high[i])
//				count++;
//			map.put(A[i], i);
//		}
//        return count;
//    }
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
