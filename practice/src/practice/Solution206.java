package practice;

public class Solution206 {
	public ListNode reverseList(ListNode head) {
		ListNode ans=null;
		ListNode cur=head;
        while(cur!=null)
        {
        	ListNode tmp=cur.next;
        	cur.next=ans;
        	ans=cur;
        	cur=tmp;
        }
        return ans;
    }
	
//	//2. 遞回
//	public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) 
//        	return head;
//        ListNode p = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return p;
//    }

}
