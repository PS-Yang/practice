package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution967 {
	//sol2
	public int[] numsSameConsecDiff(int N, int K) {
		List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) 
			list.add(i);
		for (int i = 1; i < N; i++) 
		{
			List<Integer> tmp=new ArrayList<>();
			for (int num:list) 
			{
				int x=num%10;
				if(num==0)
					continue;
				if(x+K<10)
					tmp.add(num*10+x+K);
				if(K>0 && x-K >=0 )
					tmp.add(num*10+x-K);
			}
			list=tmp;
		}       
		int ans[]=new int [list.size()];
        for (int i = 0; i < ans.length; i++) 
			ans[i]=list.get(i);
        return ans;
//		return list.stream().mapToInt(j->j).toArray();
    }
	//sol1
//	public int[] numsSameConsecDiff(int N, int K) {
//        HashSet<Integer> set=new HashSet<>();
//        for (int i = 0; i < 10; i++) 
//			set.add(i);
//		for (int i = 1; i < N; i++) 
//		{
//			HashSet<Integer> tmp=new HashSet<>();
//			tmp.addAll(set);
//			set.clear();
//			for (int num:tmp) 
//			{
//				if(num==0)
//					continue;
//				if(num%10-K > -1 && num%10-K < 10 )
//					set.add(num*10+num%10-K);
//				if(num%10+K > -1 && num%10+K < 10 )
//					set.add(num*10+num%10+K);
//				
//			}
//		}        
//		int ans[]=new int [set.size()];
//		int i=0;
//        for (int n:set) 
//			ans[i++]=n;
//        return ans;
//    }

}
