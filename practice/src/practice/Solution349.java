package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int n:nums1)
        	set.add(n);
        for(int n:nums2)
        {
        	if(set.contains(n))
        		ans.add(n);
        }
//        return arr.stream().mapToInt(i -> i).toArray();
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
