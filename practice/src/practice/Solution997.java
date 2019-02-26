package practice;

import java.util.HashSet;

public class Solution997 {
	//sol2
	public int findJudge(int N, int[][] trust) {
        int count[]=new int [N+1];
        for (int t[]:trust) 
        {
        	count[t[1]]++;
        	count[t[0]]--;
        }
		for (int i = 1; i < count.length; i++) 
			if(count[i]==N-1)
				return i;
		return -1;
    }
	//sol1
//	public int findJudge(int N, int[][] trust) {
//        int count[]=new int [N+1];
//        HashSet<Integer> set=new HashSet<>();
//        for (int t[]:trust) 
//        {
//        	count[t[1]]++;
//        	set.add(t[0]);
//        }
//			
//		for (int i = 1; i < count.length; i++) 
//			if(count[i]==N-1 && !set.contains(i))
//				return i;
//		
//		
//		return -1;
//    }
}
