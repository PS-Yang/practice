package practice;

public class Solution908 {
	public int smallestRangeI(int[] A, int K){
		if(A.length<2)
			return 0;
		int max=A[0];
		int min=A[0];
		for(int i=1;i<A.length;i++)
		{
			if(max<A[i])
				max=A[i];
			if(min>A[i])
				min=A[i];
		}
		int sum=max-min;
		if(sum>2*K)
			return sum-2*K;
		else 
			return 0;
	}
//	public int smallestRangeI(int[] A, int K){
//		
//		if(A.length<2)
//			return 0;
//		int max=Math.max(A[0], A[1]);
//		int min=Math.min(A[0], A[1]);
//		for(int i=2;i<A.length;i++)
//		{
//			if(max<A[i])
//				max=A[i];
//			if(min>A[i])
//				min=A[i];
//		}
//		int sum=max-min;
//		if(sum>2*K)
//			return sum-2*K;
//		else 
//			return 0;
//	}

}
