package practice;

import java.util.Arrays;
import java.util.HashSet;


public class Solution961 {
	//sol
	public int repeatedNTimes(int[] A) {
		HashSet<Integer> set=new HashSet<>();
		for(int a:A)
			if(!set.add(a))
				return a;
        return -1;
    }
	//sol in contest 沒發現只有一個數字會重復
//	public int repeatedNTimes(int[] A) {
//		int num[]=new int [10001];
//		int mid=A.length/2;
//		for(int a:A)
//		{
//			num[a]++;
//			if(num[a]==mid)
//				return a;
//		}
//        return -1;
//    }
	
}
