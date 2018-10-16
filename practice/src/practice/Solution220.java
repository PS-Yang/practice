package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Solution220 {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if(nums.length==0 || k<1 || t<0)
			return false;
		HashMap<Long,Long> map =new HashMap<>();
		for(int i=0;i<nums.length;i++)
        {
        	long value=(long)nums[i]-Integer.MIN_VALUE; //long 正規化
        	long key=value/((long)t+1);
        	if(map.containsKey(key) 
            		|| (map.containsKey(key-1) && value-map.get(key-1)<=t)
            			|| (map.containsKey(key+1) && map.get(key+1)-value<=t))
            		return true;
			if(i>=k)
			{
				long num=((long)(nums[i-k])-Integer.MIN_VALUE)/((long)t+1);
				map.remove(num);
			}
        	map.put(key, value);
        }
        return false;
    }
}
