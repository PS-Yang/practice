package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Solution914 {
	public boolean hasGroupsSizeX(int[] deck) {
		if(deck.length<2)
			return false;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int d:deck)
			map.put(d, map.getOrDefault(d, 0)+1);
		Object[] obj=map.values().toArray();
		Arrays.sort(obj);
		int min=(int) obj[0];
		for(int x=2;x<=min;x++)
		{
			boolean flag=true;
			for(int i=0;i<obj.length;i++)
			{
				if((int)obj[i]%x!=0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				return flag;
		}
		
		return false;
    }
}
