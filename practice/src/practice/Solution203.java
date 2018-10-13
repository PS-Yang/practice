package practice;

public class Solution203 {
	public ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) 
			head = head.next;
		ListNode ans=new ListNode(0);
		ans.next=head;
		while(ans.next!=null)
		{
			if(ans.next.val==val)
				ans.next=ans.next.next;
			else
				ans=ans.next;
		}
		return head;
    }
}
