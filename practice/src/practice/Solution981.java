package practice;

import java.util.HashMap;
import java.util.TreeMap;

public class Solution981 {
	//sol2
	private HashMap<String, TreeMap<Integer, String>> map;
 	public Solution981() {
 		map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
    	if(!map.containsKey(key))
    		map.put(key, new TreeMap<>());
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
    	TreeMap<Integer, String> treeMap=map.get(key);
    	if(treeMap==null)
    		return "";
    	Integer t=treeMap.floorKey(timestamp);
		return t==null ? "" : treeMap.get(t);
    }
    //sol1
//		private HashMap<String, HashMap<Integer, String>> map=new HashMap<>();
//	 	public Solution981() {
//	        
//	    }
//	    
//	    public void set(String key, String value, int timestamp) {
//	    	HashMap<Integer, String> tmp = map.getOrDefault(key, new HashMap<>());
//	    	tmp.put(timestamp, value);
//	        map.put(key,tmp);
//	    }
//	    
//	    public String get(String key, int timestamp) {
//	    	HashMap<Integer, String> tmp= map.getOrDefault(key, new HashMap<>());
//	    	if (tmp.isEmpty()) 
//				return "";
//	    	while (timestamp>0) 
//	    	{
//				if (tmp.containsKey(timestamp)) 
//					return tmp.get(timestamp);
//	    		timestamp--;
//			}
//	    	return "";
//	    }
}
