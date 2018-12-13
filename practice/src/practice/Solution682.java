package practice;

import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;


public class Solution682 {
	//sol3 using stack
	public int calPoints(String[] ops) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(String s:ops)
        {
        	
        	if(s.equals("C"))
        	{
        		sum-=st.pop();
        	}
        	else if(s.equals("D"))
        	{	
        		st.push(st.peek()*2);
        		sum+=st.peek();
        	}
        	else if(s.equals("+"))
        	{	
        		int a=st.pop();
        		int cur=a+st.peek();
        		sum+=cur;
        		st.push(a);
        		st.push(cur);
        	}
        	else
        	{
        		st.push(Integer.parseInt(s));
        		sum+=Integer.parseInt(s);
        	}
        }
        return sum;
    }
	//sol2 using linkedlist
//	public int calPoints(String[] ops) {
//        int sum=0;
//        LinkedList<Integer> list=new LinkedList<>();
//        for(String s:ops)
//        {
//        	int idx=list.size()-1;
//        	if(s.equals("C"))
//        		sum-=list.removeLast();
//        	else if(s.equals("D"))
//        	{	
//        		list.add(list.peekLast()*2);
//        		sum+=list.getLast();
//        	}
//        	else if(s.equals("+"))
//        	{	
//        		int tmp=list.get(idx)+list.get(idx-1);
//        		sum+=tmp;
//        		list.add(tmp);
//        	}
//        	else
//        	{
//        		list.add(Integer.parseInt(s));
//        		sum+=Integer.parseInt(s);
//        	}
//        }
//        return sum;
//    }
	//sol1 using arraylist
//	public int calPoints(String[] ops) {
//        int sum=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        for(String s:ops)
//        {
//        	int idx=list.size()-1;
//        	if(s.equals("C"))
//        	{	
//        		sum-=list.get(idx);
//        		list.remove(idx);
//        	}
//        	else if(s.equals("D"))
//        	{	
//        		sum+=list.get(idx)*2;
//        		list.add(list.get(idx)*2);
//        	}
//        	else if(s.equals("+"))
//        	{	
//        		int tmp=list.get(idx)+list.get(idx-1);
//        		sum+=tmp;
//        		list.add(tmp);
//        	}
//        	else
//        	{
//        		list.add(Integer.parseInt(s));
//        		sum+=Integer.parseInt(s);
//        	}
//        }
//        return sum;
//    }
}
