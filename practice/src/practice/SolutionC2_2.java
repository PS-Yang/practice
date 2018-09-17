package practice;

import java.util.HashSet;
import java.util.Iterator;

public class SolutionC2_2 {
	public int solution(int[] A) {
        // write your code in Java SE 8
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
		{
			if(!set.add(A[i]))
				set.remove(A[i]);
		}
		return set.iterator().next();
    }
}
