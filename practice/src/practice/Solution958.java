package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution958 {
	
	//sol2
	public boolean isCompleteTree(TreeNode root) {
		Queue<TreeNode> que=new LinkedList<>();
		que.add(root);
		while(que.peek()!=null)
		{
			TreeNode tmp=que.poll();
			que.offer(tmp.left);
			que.offer(tmp.right);
		}
		while(!que.isEmpty() && que.peek()==null)
			que.poll();
		return que.isEmpty();
    }
	//sol1
//	public boolean isCompleteTree(TreeNode root) {
//		if(root==null)
//			return false;
//		int h=0;
//		TreeNode tmp=root;
//		while(tmp!=null)
//		{
//			h++;
//			tmp=tmp.left;
//		}
//		Queue<TreeNode> que=new LinkedList<>();
//		que.add(root);
//		int curh=1;
//		while(h>=curh)
//		{
//			int n=que.size();
//			boolean flag=true;
//			for(int i=0;i<n;i++)
//			{
//				TreeNode cur=que.poll();
//				if(h-1>curh && (cur.left==null || cur.right==null))
//					return false;
//				
//				if(cur.left!=null)
//					que.add(cur.left);
//				if(cur.right!=null)
//					que.add(cur.right);
//				
//				if(curh+1==h)
//				{
//					if(!flag &&(cur.left!=null || cur.right!=null))
//						return false;
//					if(cur.left==null && cur.right!=null)
//						return false;
//					if(cur.left==null || cur.right==null)
//						flag=false;
//				}
//				
//			}
//			curh++;
//		}
//		return que.isEmpty();
//    }
}
