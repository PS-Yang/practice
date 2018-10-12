package practice;

import java.util.HashMap;

public class Solution160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null)
			return null;
		ListNode a=headA; //a為 headA,headB
		ListNode b=headB; //b為 headB,headA
		while(a!=b)
		{
			if(a==null) //headA結束補上headB
				a=headB;
			else
				a=a.next;
			if(b==null)//headB結束補上headA
				b=headA;
			else
				b=b.next;
		}		
		return a;
    }
}
