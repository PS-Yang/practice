package practice;

import java.util.HashMap;
import java.util.Map;


public class Solution1027 {
	
	// example
//		    0	1	2	3	4
//			9	4	7	2	10
//	0	9		-5	-2	-7	1
//	1	4			3	-2	6
//	2	7				-5	3
//	3	2					8
//	4	10	
	//sol2
	public int longestArithSeqLength(int[] A) {
	       int count = 2;
	        Map<Integer, Integer> map[]=new Map[A.length];
	        for(int i=0; i < A.length ; i++)
	        {
	        	map[i]=new HashMap<>();
	            for (int j=0; j < i ; j++) 
	            {
	            	int dif= A[i] - A[j];
	            	int cur= map[j].getOrDefault(dif,1)+1;
	            	map[i].put(dif,cur);
	            	count=Math.max(count,cur);
	            }
	        }
	        return count;
	      
	}
	
	
	//sol1 O(N^3)
//	public int longestArithSeqLength(int[] A) {
//        int count = 0;
//        for(int i=0; i < A.length ; i++)
//        {
//            for (int j=i+1; j < A.length ; j++) 
//            {
//            	int dif=A[j]-A[i] , cur = A[j] , tmpcount=2;
//            	for (int k=j+1; k < A.length ; k++) 
//            	{
//            		if(A[k] == cur + dif)
//            		{
//            			cur = A[k];
//            			tmpcount++;
//            		}
//            	}
//            	count=Math.max(count,tmpcount);
//            }
//        }
//        return count;
//    }
}
