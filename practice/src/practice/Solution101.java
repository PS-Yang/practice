package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution101 {
		//1.遞回
		public boolean isSymmetric(TreeNode root) {
			return symmetric(root,root);
	    }
		public boolean symmetric(TreeNode l,TreeNode r){
			if(l==null && r==null)
				return true;
			else if(l==null || r==null)
				return false;
			else
				return l.val==r.val && symmetric(l.left,r.right) && symmetric(l.right,r.left);
		}
//	//2.非遞回
//	public boolean isSymmetric(TreeNode root) {
//		Queue<TreeNode> que=new LinkedList<TreeNode>();
//		que.add(root);
//		que.add(root);
//		while(!que.isEmpty())
//		{
//			TreeNode tl=que.poll();
//			TreeNode tr=que.poll();
//			if(tl==null && tr==null)
//				continue;
//			else if(tl==null || tr==null)
//				return false;
//			else if(tl.val!=tr.val)
//				return false;
//			que.add(tl.left);
//			que.add(tr.right);
//			que.add(tl.right);
//			que.add(tr.left);
//		}
//		return true;
//    }
	
}
