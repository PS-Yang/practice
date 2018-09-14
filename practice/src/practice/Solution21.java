package practice;

public class Solution21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(0);
		ListNode temp=ans;
        while(l1!=null && l2!=null)
        {
        	if(l1.val<l2.val)
        	{
        		temp.next=l1;
        		l1=l1.next;
        	}
        	else
        	{
        		temp.next=l2;
        		l2=l2.next;
        	}
        	temp=temp.next;
        }
        if(l1==null)
        	temp.next=l2;
        else
        	temp.next=l1;
        return ans.next;
    }
	
//遞回寫法
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		if(l1 == null) 
//			return l2;
//		else if(l2 == null) 
//			return l1;
//		else if(l1.val < l2.val)
//		{
//			l1.next = mergeTwoLists(l1.next, l2);
//			return l1;
//		} 
//		else
//		{
//			l2.next = mergeTwoLists(l1, l2.next);
//			return l2;
//		}
//    }
	

//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode ans=new ListNode(0);
//		ListNode temp=ans;
//        while(l1!=null || l2!=null)
//        {
//        	if(l2==null || (l1!=null && l1.val<l2.val))
//        	{
//        		temp.next=l1;
//        		l1=l1.next;
//        	}
//        	else
//        	{
//        		temp.next=l2;
//        		l2=l2.next;
//        	}
//        	temp=temp.next;
//        }
//        return ans.next;
//    }
}
