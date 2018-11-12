package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution938 {
	
	//sol2 
	public int rangeSumBST(TreeNode root, int L, int R) {
		if(root==null)
			return 0;
		int sum=0;
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode t=q.poll();
			if(t!=null)
			{
				if(t.val>=L && t.val<=R)
					sum=sum+t.val;
				if(L<t.val)
					q.add(t.left);
				if(t.val<R)
					q.add(t.right);
			}
			
		}
		return sum;
    }
	
	//sol1 in contest time O(N)
//	public int rangeSumBST(TreeNode root, int L, int R) {
//		if(root==null)
//			return 0;
//		int sum=0;
//		Queue<TreeNode> q=new LinkedList<>();
//		q.add(root);
//		while(!q.isEmpty())
//		{
//			int n=q.size();
//			for(int i=0;i<n;i++)
//			{
//				TreeNode t=q.poll();
//				if(t.val>=L && t.val<=R)
//					sum=sum+t.val;
//				if(t.left!=null)
//					q.add(t.left);
//				if(t.right!=null)
//					q.add(t.right);
//			}
//		}
//		
//		return sum;
//    }
}
