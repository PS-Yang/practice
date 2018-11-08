package practice;

import java.util.HashMap;

public class Solution447 {
	public int numberOfBoomerangs(int[][] points) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int ans=0;
		for(int[] i : points)
		{
			for(int[] j : points)
			{
				if(i!=j)
				{
					int d=(i[0]-j[0])*(i[0]-j[0])+(i[1]-j[1])*(i[1]-j[1]);
					map.put(d, map.getOrDefault(d, 0)+1);
				}
			}
			for(int value:map.values()) 
	            ans = ans+ value*(value-1);           
	        map.clear();
		}
        return ans;
    }
}
