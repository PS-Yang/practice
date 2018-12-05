package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Solution645 {
	public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans[]=new int [2];
        for(int i=1;i<=nums.length;i++)
        	set.add(i);
        for(int n:nums)
        	if(!set.remove(n))
        		ans[0]=n;
        
        for(int n:set)
        	ans[1]=n;
        
        return ans;        
    }
}
