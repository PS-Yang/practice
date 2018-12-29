package practice;

public class Solution707 {
    //sol1
    private class ListNode {
		int val;
		ListNode next;
		ListNode prev;
		ListNode(int x) { 
			val = x; 
		}  
	}
	private ListNode head;
	private ListNode end;
	private int size;
	/** Initialize your data structure here. */
    public Solution707() {
    	head = new ListNode(0);
        end = new ListNode(0);
        head.next = end;
        end.prev = head;
        size=0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size || index <0)
        	return -1;
        ListNode cur=head;
        for (int i = 0; i <= index; i++) {
			cur=cur.next;
		}
        return cur.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	addAtIndex(0,val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	addAtIndex(size,val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	if (index < 0 || index > size) return;
    	ListNode cur=head;
        for (int i = 0; i < index; i++) {
			cur=cur.next;
		}
        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        newNode.next.prev = newNode;
        cur.next = newNode;
        newNode.prev = cur;
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if (index < 0 || index >=size) 
    		return;
    	ListNode cur=head;
        for (int i = 0; i <= index; i++) {
			cur=cur.next;
		}
        cur.next.prev = cur.prev;
        cur.prev.next = cur.next;
        size--;
    }
	
//	private class ListNode {
//		int val;
//		ListNode next;
//		ListNode(int x) { 
//			val = x; 
//		}  
//	}
//	private ListNode head;
//	private ListNode end;
//	private int size;
//	/** Initialize your data structure here. */
//    public Solution707() {
//    	head = null;
//        end = null;	
//        size=0;
//    }
//    
//    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
//    public int get(int index) {
//        if(index>=size || index <0)
//        	return -1;
//        ListNode cur=head;
//        for (int i = 0; i <= index; i++) 
//			cur=cur.next;
//        
//        return cur.val;
//    }
//    
//    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
//    public void addAtHead(int val) {
//    	ListNode cur=new ListNode(val);
//    	cur.next=head;
//    	head=cur;
//    	if (end==null) 
//			end=cur;
//		size++;
//    }
//    
//    /** Append a node of value val to the last element of the linked list. */
//    public void addAtTail(int val) {
//    	ListNode cur=new ListNode(val);
//    	if(end!=null)
//    		end.next=cur;
//    	if(end==null)
//    		head=cur;
//    	end = cur;
//		size++;
//    }
//    
//    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
//    public void addAtIndex(int index, int val) {
//    	if (index < 0 || index > size) return;
//    	if(index==0)
//    		addAtHead(val);
//    	else if(index==size)
//    		addAtTail(val);
//    	else 
//    	{
//    		ListNode cur=head;
//            for (int i = 0; i < index; i++) 
//    			cur=cur.next;
//
//            ListNode tmp = new ListNode(val);
//            ListNode save = cur;
//            cur = cur.next;
//            
//            save.next = tmp;
//            tmp.next = cur;
//            size++;
//		}
//    }
//    
//    /** Delete the index-th node in the linked list, if the index is valid. */
//    public void deleteAtIndex(int index) {
//    	if (index < 0 || index >=size) 
//    		return;
//    	ListNode cur=head;
//    	if (index == 0) 
//            head.next = head.next.next;
//        else 
//        {
//        	ListNode ith = head;
//            for (int i = 0; i < index-1; i++) 
//            	ith = ith.next;
//            if (index == size - 1) 
//            {
//                end = ith;
//                end.next = null;
//                size--;
//                return;
//            }
//            ListNode nekMinnit = ith.next;
//            ith.next = nekMinnit.next;
//        }
//        size--;
//    }
}

