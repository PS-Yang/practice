package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution1019 {
	//sol2
	public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode cur=head;
        while (cur!=null) 
        {
			list.add(cur.val);
			cur=cur.next;
		}
        Stack<Integer> stack=new Stack<>();
        int ans[] = new int[list.size()];
        for (int i = 0; i < ans.length; i++)
        { 
        	while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) 
				ans[stack.pop()]=list.get(i);
        	stack.push(i);
        }
        return ans;
    }
	//sol1
//	public int[] nextLargerNodes(ListNode head) {
//        List<Integer> list=new ArrayList<>();
//        ListNode cur=head;
//        while (cur!=null) 
//        {
//        	int curval=cur.val;
//        	ListNode nextnode=cur;
//        	while (nextnode!=null) 
//            {
//        		if(nextnode.val>curval)
//        		{
//        			list.add(nextnode.val);
//        				break;
//        		}
//        			
//        		nextnode=nextnode.next;
//            }
//        	if(nextnode==null)
//        		list.add(0);
//        	cur=cur.next;
//		}
//        
//        int ans[] = new int[list.size()];
//        for (int i = 0; i < ans.length; i++) 
//			ans[i] = list.get(i);
//        return ans;
//    }
}
