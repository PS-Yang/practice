package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution234 {
	public boolean isPalindrome(ListNode head) {
		ListNode fast=head;
		ListNode slow=head;
		ListNode tmp=head;
        while(fast!=null && fast.next!=null)
        {
        	fast=fast.next.next;
        	slow=slow.next;
        }
        if(fast!=null)
        	slow=slow.next;
        slow=reverseList(slow);
        fast=head;
        while(slow!=null)
        {
        	if(slow.val!=fast.val)
        		return false;
        	fast=fast.next;
        	slow=slow.next;
        }
        return true;
    }
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
//	// sol 2.
//	public boolean isPalindrome(ListNode head) {
//        List<Integer> list=new ArrayList<Integer>();
//        while(head!=null)
//        {
//        	list.add(head.val);
//        	head=head.next;
//        }
//        int i=0;
//        int j=list.size()-1;
//        System.out.println(list);
//        while(i<j)
//        {
//        	if(!list.get(i).equals(list.get(j)))
//        		return false;
//        	i++;
//        	j--;
//        }
//        return true;
//    }
}
