package practice;

import java.util.HashSet;

public class Solution945 {
//	public int minIncrementForUnique(int[] A) {
//		if(A.length==0)
//			return 0;
//		int count=0;
//		HashSet<Integer> set=new HashSet<>();
//		
//		for(int i=0;i<A.length;i++)
//		{
//			int tmp=0;
//			while(set.contains(tmp+A[i])) 
//				tmp++;
//			set.add(A[i]+tmp);
//			count=count+tmp;
//		}
//		return count;
//	}
	//sol1
	public int minIncrementForUnique(int[] A) {
		if(A.length==0)
			return 0;
		int count=0;
		int num[]=new int [80001];
		num[A[0]]=1;
		for(int i=1;i<A.length;i++)
		{
			int tmp=0;
			while(num[A[i]+tmp]==1) 
				tmp++;
			num[A[i]+tmp]=1;
			count=count+tmp;
		}
		return count;
	}
}
