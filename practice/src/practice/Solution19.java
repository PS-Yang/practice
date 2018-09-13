package practice;

public class Solution19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode ans=new ListNode(0);
		ans.next=head;
        ListNode fast=ans;
        ListNode slow=ans;
        for(int i=0;i<n+1;i++)
        {
        	fast=fast.next;
        }
        
        while(fast.next!=null)
        {
        	fast=fast.next;
        	slow=slow.next;
        }
        slow.next=slow.next.next;
        return slow.next;
    }
}
