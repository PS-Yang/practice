package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Solution945 {
	//sol3 O(N)
	public int minIncrementForUnique(int[] A) {
		if(A.length==0)
			return 0;
		int num[]=new int [80001];
		for(int n:A)
			num[n]++;
		int count=0;
		int take=0;
		for(int i=0;i<80000;i++)
		{
			if(num[i]>1)
			{
				take=take+num[i]-1;
				count=count-i*(num[i]-1);
			}
			else if(take>0 && num[i]==0)
			{
				take--;
				count=count+i;
			}
				
		}
		return count;
	}
	//sol2 time complete O(NlogN)
//	public int minIncrementForUnique(int[] A) {
//		if(A.length==0)
//			return 0;
//		Arrays.sort(A);
//		int count=0;
//		int cur=A[0]+1;
//		for(int i=1;i<A.length;i++)
//		{
//			if(cur<A[i])
//				cur=A[i];
//			else
//				count=count+cur-A[i];
//			cur++;
//		}
//		return count;
//	}
	
	//sol1 in contest => time O(N*N)
//	public int minIncrementForUnique(int[] A) {
//		if(A.length==0)
//			return 0;
//		int count=0;
//		int num[]=new int [80001];
//		num[A[0]]=1;
//		for(int i=1;i<A.length;i++)
//		{
//			int tmp=0;
//			while(num[A[i]+tmp]==1) 
//				tmp++;
//			num[A[i]+tmp]=1;
//			count=count+tmp;
//		}
//		return count;
//	}
}
