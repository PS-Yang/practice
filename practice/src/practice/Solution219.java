package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Solution219 {
	//2. using hash set
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
        	if(i>k)
        		set.remove(nums[i-k-1]);
        	if(!set.add(nums[i]))
        		return true;
        }
        return false;
    }
//	//1. using hashmap
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		HashMap<Integer,Integer> map =new HashMap<>();
//        for(int i=0;i<nums.length;i++)
//        {
//        	int idx=map.getOrDefault(nums[i], -1);
//        	if(idx!=-1 && i-idx<k+1)
//        		return true;
//        	else 
//        		map.put(nums[i], i);
//        }
//        return false;
//		
//    }
}
