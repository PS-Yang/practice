package practice;

import java.util.Iterator;
import java.util.TreeMap;

public class Solution954 {
	//sol2
	public boolean canReorderDoubled(int[] A) {
		TreeMap<Integer,Integer> map=new TreeMap<>();
		for(int a:A)
			map.put(a, map.getOrDefault(a, 0)+1);	
		for(int key:map.keySet())
		{
			int value=map.get(key);
			if(value==0)
				continue;
			int wantkey= key>=0 ? 2*key:key/2;
			int wantvalue=map.getOrDefault(wantkey, -1);
			
			if( (key<0 && key%2==1) || wantvalue==-1 || wantvalue<value)
				return false;
			map.put(wantkey, wantvalue-value);	
		}
		
		System.out.println(map);
		return true;
    }
	
	//sol1
//	public boolean canReorderDoubled(int[] A) {
//		Arrays.sort(A);
//		HashMap<Integer,Integer> map=new HashMap<>();
//		for(int a:A)
//		{
//			if(a<0)
//			{
//				int value=map.getOrDefault(2*a, -1);
//				if(value==-1)
//					map.put(a, map.getOrDefault(a, 0)+1);
//				else if(value>=2)
//					map.put(2*a, value-1);
//				else if (value==1)
//					map.remove(2*a);
//			}
//			else
//			{
//				int value=-2;
//				if(a%2==0)
//					value=map.getOrDefault(a/2, -1);
//				if(value<=-1)
//					map.put(a, map.getOrDefault(a, 0)+1);
//				else if(value>=2)
//					map.put(a/2, value-1);
//				else if (value==1)
//					map.remove(a/2);
//			}
//			
//		}
//		
//		System.out.println(map);
//		return map.isEmpty();
//    }
	

	
}
