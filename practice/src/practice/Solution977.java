package practice;

import java.util.Arrays;

public class Solution977 {
	//sol2 
	public int[] sortedSquares(int[] A) {
		int ans[]=new int [A.length];
		int i=0,j=A.length-1;
        for (int k = ans.length-1; k >= 0; k--) 
        {
			if(Math.abs(A[i])>Math.abs(A[j]))
			{
				ans[k]=A[i]*A[i];
				i++;
			}
			else 
			{
				ans[k]=A[j]*A[j];
				j--;
			}
		}

		return ans;
    }
	//sol1 O(NlogN)
//	public int[] sortedSquares(int[] A) {
//        for (int i = 0; i < A.length; i++) 
//			A[i]=A[i]*A[i];
//		Arrays.sort(A);
//		return A;
//    }
}
