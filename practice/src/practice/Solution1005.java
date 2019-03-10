package practice;

import java.util.Arrays;

public class Solution1005 {
	//sol2
	public int largestSumAfterKNegations(int[] A, int K) {
		Arrays.sort(A);
		for (int i = 0; i < A.length && K>0 && A[i]<0 ; i++,K--) 
			A[i]=-A[i];
		
		int sum=0,min=Integer.MAX_VALUE;
        for (int a:A)
        {
        	sum+=a;
        	min=Math.min(a, min);
        }
        return sum-(K%2)*min*2;
    }
	//sol1
//	public int largestSumAfterKNegations(int[] A, int K) {
//		while (K!=0) 
//		{
//			Arrays.sort(A);
//			K--;
//			A[0]=-A[0];
//		}
//		int sum=0;
//        for (int a:A) 
//			sum+=a;
//        return sum;
//    }
}
