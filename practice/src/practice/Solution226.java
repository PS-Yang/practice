package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution226 {
	//1. Iterative
	public TreeNode invertTree(TreeNode root) {
		if(root==null || (root.left==null && root.right==null))
			return root;
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode t=q.poll();
			TreeNode left=t.left;
			TreeNode right=t.right;
			t.right=left;
			t.left=right;
			if(left!=null)
			   q.add(left);
			if(right!=null)
			   q.add(right);
		}
			
		
        return root; 
    }
//	//2. sol2 疊代
//	public TreeNode invertTree(TreeNode root) {
//		if(root==null || (root.left==null && root.right==null))
//			return root;
//		TreeNode right = invertTree(root.right);
//	    TreeNode left = invertTree(root.left);
//	    root.left = right;
//	    root.right = left;
//        return root; 
//    }
	
}
