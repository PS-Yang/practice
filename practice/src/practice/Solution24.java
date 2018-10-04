package practice;

public class Solution24 {
	public ListNode swapPairs(ListNode head) {
		ListNode ans=new ListNode(0);
		ans.next=head;
		ListNode tmp=ans;
		while(tmp.next!=null && tmp.next.next!=null)
		{
			ListNode one=tmp.next;
			ListNode two=tmp.next.next;
			one.next=two.next;
			tmp.next=two;
			tmp.next.next=one;
			tmp=tmp.next.next;
		}
		return ans.next;
    }
}
