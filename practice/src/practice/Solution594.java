package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution594 {
	
	//sol1 using hashmap
	public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int n:nums)
        	map.put(n, map.getOrDefault(n, 0)+1);
        int max=0;
        
        for(int k:map.keySet())
        	if(map.containsKey(k+1))
        		max=Math.max(max,map.get(k)+map.get(k+1));
        
        return max;
    }
}
