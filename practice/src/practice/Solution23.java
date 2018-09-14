package practice;

public class Solution23 {
//	 public ListNode mergeKLists(ListNode[] lists) {
//		 	if(lists.length==0)
//		 		return null;
//		 	else if(lists.length==1)
//		 		return lists[0];
//		 	ListNode[] temp=new ListNode[lists.length];
//		 	temp=lists;
//		 	int j=temp.length;
//		 	while(j>1)
//		 	{
//		 		int k=0;
//		 		for(int i=0;i<j;i=i+2)
//		 		{
//		 			if(i+1<j)
//		 				temp[k]=mergeTwoLists(temp[i], temp[i+1]);
//		 			else
//		 				temp[k]=temp[k];
//		 			k++;
//		 		}
//		 		if(j%2==0)
//		 			j=j/2;
//		 		else
//		 			j=j/2+1;
//		 	}	
//	        return temp[0];
//	 }
	 public ListNode mergeKLists(ListNode[] lists) {
		 	ListNode ans=new ListNode(0);
		 	if(lists.length==0)
		 		return null;
		 	else if(lists.length==1)
		 		return lists[0];
		 	ans=lists[0];
		 	for(int i=1;i<lists.length;i++)
		 		ans=mergeTwoLists(ans, lists[i]);
	        return ans;
	 }
	 
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
}
