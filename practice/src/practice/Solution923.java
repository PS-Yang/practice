package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution923 {
	//2.Time Complexity: O(N+W^2) Space Complexity: O(W)
	public int threeSumMulti(int[] A, int target) {
		int MOD=1000000007;
		long count[]=new long[101];
		for(int a:A)
			count[a]++;
		long ans=0;
		//x!=y!=z
		for (int x = 0; x <= 98; x++)
		{
			 for (int y = x+1; y <= 99; y++) 
			 {
				 int z = target - x - y;
	             if (y < z && z <= 100) 
	             {
	            	 ans = ans+ count[x] * count[y] * count[z];
	                 ans = ans % MOD;
	             }
	         }
		}
        //x=y!=z
		for (int x = 0; x <= 99; x++)
		{
			 int z = target - 2*x;
             if (x < z && z <= 100) 
             {
            	 ans = ans+ count[x] * (count[x]-1) / 2 * count[z];
                 ans = ans % MOD;
             } 
		}
		//x!=y==z
		for (int x = 0; x <= 99; x++)
		{
			 if (target % 2 == x % 2) 
			 {
				 int y = (target - x) / 2;
	             if (x < y && y <= 100) 
	             {
	            	 ans = ans+ count[x] * count[y] * (count[y] - 1) / 2;
	            	 ans = ans % MOD;
	             }
	         }
		}
		//x=y=z
		if(target%3==0)
		{
			int x=target/3;
			if (x <= 100) 
			{
				ans = ans+ count[x] * (count[x] - 1) * (count[x] - 2) / 6;
           	 	ans = ans % MOD;
			}
		}
        return (int)ans;
    }
//	//1.Time Complexity: O(N^2) Space Complexity: O(1)
//	public int threeSumMulti(int[] A, int target) {
//		int MOD=1000000007;
//		long count=0;
//		Arrays.sort(A);	
//        for(int i=0;i<A.length-2;i++)
//        {
//			int mid=i+1;
//        	int end=A.length-1;
//        	while(mid<end)
//			{
//				 if(A[i]+A[mid]+A[end]==target)
//				 {
//					 if(A[mid]!=A[end])
//					 {
//						 int left=1,right=1;
//						 while (mid < end && A[mid] == A[mid+1]) 
//						 {
//							 mid++;
//							 left++;
//						 }
//		                 while (mid < end && A[end] == A[end-1]) 
//		                 {
//		                	 end--;
//		                	 right++;
//		                 }
//		                 count=count+left*right;
//		                 count=count%MOD;
//		                 mid++;
//						 end--;
//					 }
//					 else
//					 {
//						 int total=end-mid+1;
//						 count=count+total*(total-1)/2;
//						 count=count%MOD;
//						 break;
//					 }
//				 }
//				 else if (A[i]+A[mid]+A[end]<target) 
//					 mid++;
//	             else 
//	            	 end--;
//			}
//        }
//        return (int)count;
//    }
}
