package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        int i=0;
        for(String s:list1)
        	map.put(s, i++);
        
        ArrayList<String> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        
        for(int j=0;j<list2.length;j++)
        {
        	int idx1=map.getOrDefault(list2[j], -1);
        	if(idx1!=-1)
        	{
        		int idx=idx1+j;
        		if(idx<min)
            	{
            		min=idx;
            		ans.clear();
            		ans.add(list2[j]);
            	}
            	else if(idx==min)
            		ans.add(list2[j]);
        	}
        }
        return ans.toArray(new String[0]);
    }
//	public String[] findRestaurant(String[] list1, String[] list2) {
//        HashMap<String,Integer> maplist1=new HashMap<>();
//        HashMap<String,Integer> map=new HashMap<>();
//        int i=0;
//        for(String s:list1)
//        	maplist1.put(s, i++);
//        i=0;
//        for(String s:list2)
//        	if(maplist1.containsKey(s))
//        		map.put(s, maplist1.get(s)+(i++));
//        ArrayList<String> ans=new ArrayList<>();
//        int min=Integer.MAX_VALUE;
//        for(String k:map.keySet())
//        {
//        	if(map.get(k)<min)
//        	{
//        		min=map.get(k);
//        		ans.clear();
//        		ans.add(k);
//        	}
//        	else if(map.get(k)==min)
//        		ans.add(k);
//        }
//        return ans.toArray(new String[0]);
//    }
}
