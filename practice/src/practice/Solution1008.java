package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1008 {
	//sol2
	private int i=0;
	public TreeNode bstFromPreorder(int[] preorder) {
        return tree(preorder,Integer.MAX_VALUE);
    }
	public TreeNode tree(int[] num,int bound) {
		if(num.length==i || num[i] > bound)
			return null;
		TreeNode root=new TreeNode(num[i++]);
		root.left=tree(num, root.val);
		root.right=tree(num, bound);
		return root;
	}
	//sol1 
//	public TreeNode bstFromPreorder(int[] preorder) {
//        TreeNode ans=new TreeNode(preorder[0]);
//        int num=preorder[0];
//        Queue<Integer> left=new LinkedList<>();
//        Queue<Integer> right=new LinkedList<>();
//		for (int i = 1; i < preorder.length; i++) 
//		{
//			if(preorder[i]<num)
//				left.add(preorder[i]);
//			else 
//				right.add(preorder[i]);
//		}
//		if(left.size()>0)
//			ans.left=new TreeNode(left.poll());
//		if(left.size()>0)
//			tree(left,ans.left);
//		if(right.size()>0)
//			ans.right=new TreeNode(right.poll());
//		if(right.size()>0)
//			tree(right,ans.right);
//		return ans;
//    }
//	public void tree(Queue<Integer> q,TreeNode root){
//		Queue<Integer> left=new LinkedList<>();
//        Queue<Integer> right=new LinkedList<>();
//		while (q.size()>0) {
//			int n=q.poll();
//			if(n<root.val)
//				left.add(n);
//			else 
//				right.add(n);
//		}
//		if(left.size()>0)
//			root.left=new TreeNode(left.poll());
//		if(left.size()>0)
//			tree(left,root.left);
//		if(right.size()>0)
//			root.right=new TreeNode(right.poll());
//		if(right.size()>0)
//			tree(right,root.right);
//	}
}
