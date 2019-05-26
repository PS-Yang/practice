package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Solution1054 {
	//sol1
	public int[] rearrangeBarcodes(int[] barcodes) {
        int ans[]=new int[barcodes.length];
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int b:barcodes) 
			map.put(b, map.getOrDefault(b, 0)+1);
		PriorityQueue<Map.Entry<Integer, Integer>> queue=new PriorityQueue<>(
		  (a,b) -> b.getValue()-a.getValue() == 0 ? a.getKey() - b.getKey(): b.getValue() - a.getValue());
		queue.addAll(map.entrySet());		
        int i=0;
		while(!queue.isEmpty())
		{
			Map.Entry<Integer, Integer> tmp=queue.poll();
			int len=tmp.getValue();
			while(len>0)
			{
				ans[i]=tmp.getKey();
				i+=2;
				if(i>=ans.length)
					i=1;
				len--;
			}
		}  
		return ans;
    }
}
