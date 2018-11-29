package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution501 {
	//sol2 fixed from sol1 using in-order  Space O(1)  time O(N)
	private List<Integer> ans=new LinkedList<>();
	private int count=1;
	private int  max=0;
	private Integer prev=null;
	
	public int[] findMode(TreeNode root) {
		if(root==null)
			return new int[0];
		count(root);
		
		int num[]=new int [ans.size()];
		for(int i=0;i<ans.size();i++)
			num[i]=ans.get(i);
		return num;
    }
	public void count(TreeNode root) {
		if(root==null)
			return;
		count(root.left);
		
		if(prev!=null && root.val==prev)
			count++;
		else
			count=1;

		if(count>max)
		{
			max=count;
			ans.clear();
			ans.add(root.val);
		}
		else if(count==max)
			ans.add(root.val);
		
		prev=root.val;
		count(root.right);
    }
	
	
	// sol3 using stack time O(N) spaceO(N)
//	public int[] findMode(TreeNode root) {
//		if(root==null)
//			return new int[0];
//		
//		List<Integer> ans=new LinkedList<>();
//		Stack<TreeNode> st=new Stack<>();
//		TreeNode node=root;
//		TreeNode prev=null;
//		int count=1;
//		int max=0;
//		while( !st.isEmpty() || node!=null)
//		{
//			while(node!=null)
//			{
//				st.push(node);
//				node=node.right;
//			}
//			node=st.pop();
//			if(prev!=null && prev.val==node.val)
//				count++;
//			else
//				count=1;
//			if(count>max)
//			{
//				max=count;
//				ans.clear();
//				ans.add(node.val);
//			}
//			else if(count==max)
//				ans.add(node.val);
//			prev=node;
//			node=node.left;
//		}		
//		int num[]=new int [ans.size()];
//		for(int i=0;i<ans.size();i++)
//			num[i]=ans.get(i);
//		return num;
//    }
	
	//sol 1
//	private List<Integer> ans=new LinkedList<>();
//	private int count=1;
//	private int  max=0;
//	private Integer prev=null;
//	public int[] findMode(TreeNode root) {
//		if(root==null)
//			return new int[0];
//		findMode(root.left);
//		
//		if(prev!=null)
//		{
//			if(root.val==prev)
//				count++;
//			else
//				count=1;
//		}
//		if(count>max)
//		{
//			max=count;
//			ans.clear();
//			ans.add(root.val);
//		}
//		else if(count==max)
//			ans.add(root.val);
//		
//		prev=root.val;
//		
//		findMode(root.right);
//		
////		int a[]=new int [ans.size()];
////		for(int i=0;i<ans.size();i++)
////			a[i]=ans.get(i);
////		return a;
//        return ans.stream().mapToInt(i -> i).toArray();
//    }
}
