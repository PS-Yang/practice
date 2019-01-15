package practice;

import java.util.Arrays;
import java.util.Collections;

public class Solution976 {
	
	public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-1; i > 1; i--) 
			if(A[i-1]+A[i-2]>A[i])
				return A[i]+A[i-1]+A[i-2];
        return 0;
    }
	//sol1
//	public int largestPerimeter(int[] A) {
//        Arrays.sort(A);
//        int max=0;
//        for (int i = A.length-1; i > 1; i--) 
//        {
//			if(A[i]+A[i-1]>A[i-2] && A[i]+A[i-2] >A[i-1] && A[i-1]+A[i-2]>A[i])
//			{
//				max=A[i]+A[i-1]+A[i-2];
//				break;
//			}
//		}
//        return max;
//    }
}
