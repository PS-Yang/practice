package practice;

import java.util.Arrays;

public class Solution706 {
    final ListNode[] nodes = new ListNode[10000];

	/** Initialize your data structure here. */
    public Solution706() {
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int i=key%nodes.length;
        if(nodes[i]==null)
        	nodes[i]=new ListNode(-1,-1);
        ListNode prev=find(nodes[i],key);
        if(prev.next==null)
            prev.next=new ListNode(key, value);
        else 
        	prev.next.val=value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
    	int i=key%nodes.length;
    	if(nodes[i]==null)
    		return -1;
    	ListNode node=find(nodes[i],key);
    	return node.next==null ? -1 : node.next.val;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
    	int i=key%nodes.length;
    	if(nodes[i]==null)
    		return ;
    	ListNode prev=find(nodes[i],key);
        if (prev.next==null) 
        	return;
        prev.next=prev.next.next;
    }
    
    ListNode find(ListNode bucket, int key) {
        ListNode node=bucket, prev=null;
        while(node!=null && node.key!=key) {
            prev=node;
            node=node.next;
        }
        return prev;
    }

    class ListNode {
        int key,val;
        ListNode next;

        ListNode(int key, int val) {
            this.key=key;
            this.val=val;
        }
    }
	//sol2
//	private int size=1000;
//	private int bucket=1001;
//	private int map[][]=new int [bucket][];
//	/** Initialize your data structure here. */
//    public Solution706() {
//        
//    }
//    
//    /** value will always be non-negative. */
//    public void put(int key, int value) {
//        int mapkey=key%bucket;
//        if(map[mapkey]==null)
//        {
//        	map[mapkey]=new int [size];
//        	Arrays.fill(map[mapkey], -1);
//        }	
//        map[mapkey][key/size]=value;
//    }
//    
//    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
//    public int get(int key) {
//    	int mapkey=key%bucket;
//    	if(map[mapkey]!=null)
//    		return map[mapkey][key/size];
//    	else
//    		return -1;
//    }
//    
//    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
//    public void remove(int key) {
//    	int mapkey=key%bucket;
//        if(map[mapkey]!=null)
//        	map[mapkey][key/size]=-1;
//    }
	//sol1
//	private int map[]=new int [1000001];
//	/** Initialize your data structure here. */
//    public Solution706() {
//        Arrays.fill(map, -1);
//    }
//    
//    /** value will always be non-negative. */
//    public void put(int key, int value) {
//        map[key]=value;
//    }
//    
//    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
//    public int get(int key) {
//    	return map[key];
//    }
//    
//    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
//    public void remove(int key) {
//    	map[key]=-1;
//    }
}
