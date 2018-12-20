package practice;

import java.util.LinkedList;
import java.util.List;

public class Solution705 {
		//sol2
		private int bucket=1000;
		private int size=1001;
		private boolean[][] set=new boolean[bucket][];
	 	public Solution705() {
	        
	    }
	    
	    public void add(int key) {
	    	int hashkey=key%bucket;
	    	if(set[hashkey]==null)
	    		set[hashkey]=new boolean[size];
	        set[hashkey][key/size]=true;
	    }
	    
	    public void remove(int key) {
	    	int hashkey=key%bucket;
	    	if(set[hashkey]!=null)
	    		set[hashkey][key/size]=false;
	    }
	    
	    /** Returns true if this set contains the specified element */
	    public boolean contains(int key) {
	    	int hashkey=key%bucket;
	        return set[hashkey]!=null && set[hashkey][key/size];
	    }
		    
//		//sol1
//		private boolean[] set=new boolean[1000001];
//	 	public Solution705() {
//	        
//	    }
//	    
//	    public void add(int key) {
//	        set[key]=true;
//	    }
//	    
//	    public void remove(int key) {
//	    	 set[key]=false;
//	    }
//	    
//	    /** Returns true if this set contains the specified element */
//	    public boolean contains(int key) {
//	        return set[key];
//	    }
}
