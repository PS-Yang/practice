package practice;

public class Solution1004 {
	//sol2
//	public int longestOnes(int[] A, int K) {
//        int count=0,start=0,end=0,ans=0;
//        for (end = 0; end < A.length; end++) 
//        {
//        	if(A[end]==0)
//        		count++;
//        	while (count>K) 
//				if(A[start++]==0)
//					count--;
//			ans=Math.max(ans, end-start+1);
//		}
//        return ans;
//    }
	//sol1
	public int longestOnes(int[] A, int K) {
        int j=0,i;
        for (i = 0; i < A.length; i++) 
        {
        	if(A[i]==0)
        		K--;
        	if(K<0 && A[j++]==0)
        		K++;
		}
        return i-j;
    }
}
