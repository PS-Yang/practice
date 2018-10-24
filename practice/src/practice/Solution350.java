package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int n:nums1)
        	map.put(n, map.getOrDefault(n, 0)+1);
        	
        for(int n:nums2)
        {
        	int value=map.getOrDefault(n, 0);
        	if(value!=0)
        	{
        		ans.add(n);
        		map.put(n, value-1);
        	}
        }
        int ansr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            ansr[i]=ans.get(i);
        }
        return ansr;
//      return arr.stream().mapToInt(i -> i).toArray();
//      return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
