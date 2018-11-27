package practice;

import java.util.HashMap;
import java.util.Iterator;

public class Solution532 {
	
	public int findPairs(int[] nums, int k) {
		if(k<0 || nums.length==0 || nums==null)
			return 0;
		HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        	map.put(n, map.getOrDefault(n, 0)+1);
        
        int ans=0;
        Iterator<Integer> iter=map.keySet().iterator();
        while(iter.hasNext())
        {
        	int n=iter.next();
        	int count=map.getOrDefault(n+k, -1);
        	
        	if(k==0 && count>1)
    			ans++;
        	else if(k!=0 && count!=-1)
        		ans++;	
        }
		return ans;
    }
	//sol1 
//	public int findPairs(int[] nums, int k) {
//		if(k<0)
//			return 0;
//		HashMap<Integer,Integer> map=new HashMap<>();
//        for(int n:nums)
//        	map.put(n, map.getOrDefault(n, 0)+1);
//        int ans=0;
//        Iterator<Integer> iter=map.keySet().iterator();
//        while(iter.hasNext())
//        {
//        	int n=iter.next();
//        	int count=map.getOrDefault(n+k, -1);
//        	
//        	if(k==0 && count>1)
//    			ans++;
//        	else if(k!=0 && count!=-1)
//        		ans++;
//        }
//		return ans;
//    }
}
