package practice;

public class Solution995 {
	//sol3 9ms
	public int minKBitFlips(int[] A, int K) {
        int count=0,flip=0,n=A.length;
        int fli[]=new int [n];
        for (int i = 0; i < n; i++) 
        {
        	if(i >= K)
        		flip ^= fli[i-K];
			if(flip == A[i])
			{
				if(i+K>A.length)
					return -1;
				flip ^= 1;
				fli[i]=1;
				count++;
			}
		}
        return count;
    }
	//sol2 142ms
//	public int minKBitFlips(int[] A, int K) {
//        int count=0;
//        for (int i=0;i<A.length;i++) 
//        {
//			if(A[i]==0)
//			{
//				if(i+K>A.length)
//					return -1;
//				flip(A,i,i+K);
//				count++;
//			}
//		}
//        return count;
//    }
//	// 142ms
//	private void flip(int[] A,int begin,int end){
//		for (int i = begin; i < end; i++) 
//			A[i]^=1;
//		
//	}
	//sol1
//	public int minKBitFlips(int[] A, int K) {
//        int count=0,i=0;
//        while (i<A.length) 
//        {
//			if(A[i]==1)
//				i++;
//			else
//			{
//				if(i+K>A.length)
//					return -1;
//				flip(A,i,i+K);
//				count++;
//			}
//		}
//        return count;
//    }
//	// 142ms
//	private void flip(int[] A,int begin,int end){
//		for (int i = begin; i < end; i++) 
//			A[i]^=1;
//		
//	}
	// 6972 ms
//	private void flip(int[] A,int begin,int end){
//		
//		for (int i = begin; i < end; i++) {
//			if(A[i]==0)
//				A[i]=1;
//			else 
//			A[i]=0;
//        }
//    }
}
