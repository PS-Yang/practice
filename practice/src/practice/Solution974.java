package practice;

import java.util.HashMap;


public class Solution974 {
	//sol3 change hashmap => int array
	public int subarraysDivByK(int[] A, int K) {
		int remain[]=new int [K];// remainder -> frequence
		remain[0]++;
        int count=0,cursum=0;
        for (int n : A) 
        {
			cursum=(cursum+n%K+K)%K;//避免負數
			int freq=remain[cursum]++;
			count+=freq;
		}
        return count;
    }
	//sol2 using hashMap
//	public int subarraysDivByK(int[] A, int K) {
//		HashMap<Integer, Integer> map=new HashMap<>();// remainder -> frequence
//		map.put(0, 1);
//        int count=0,cursum=0;
//        for (int n : A) 
//        {
//			cursum=(cursum+n%K+K)%K;//避免負數
//			int freq=map.getOrDefault(cursum, 0);
//			count+=freq;
//			map.put(cursum, freq+1);
//		}
//        return count;
//    }
	//sol1 Time Limit Exceeded
//	public int subarraysDivByK(int[] A, int K) {
//  int count=0;
//  int sum[]=new int [A.length];
//  for (int i = 0; i < A.length; i++) 
//  {
//		sum[i]=sum[i]+A[i];
//		if(sum[i]%K==0)
//			count++;
//	}
//  int j=0;
//  while(j<A.length)
//  {
//  	for (int i = j+1; i < A.length; i++) 
//      {
//      	sum[i]=sum[i]-A[j];
//			if(sum[i]%K==0)
//				count++;
//      }
//  	j++;
//  }
//  
//  return count;
//}
}
