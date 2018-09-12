package practice;



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode l3=new ListNode(0);
        ListNode cur=l3;
        while(l1!=null || l2!=null || carry!=0)
        {
            if(l1!=null && l2!=null)
                sum=carry+l1.val+l2.val;
            else if (l1!=null)
                sum=carry+l1.val;  
            else if (l2!=null)
                sum=carry+l2.val;  
            else
                sum=carry+0;
            // System.out.println(sum%10);
            cur.next=new ListNode(sum%10);
            carry=sum/10;
            if(l1!=null)l1=l1.next;
	        if(l2!=null)l2=l2.next;
            cur=cur.next;
        }

        return l3.next;
        
       
    }
}
