package practice;

import java.util.HashSet;

public class Solution575 {
	public int distributeCandies(int[] candies) {
        HashSet<Integer> set=new HashSet<>();
        int N=candies.length/2;
        for(int c:candies)
        	set.add(c);
        return set.size()>N ? N : set.size();
//        return Math.min(set.size(), N);
    }
}
