package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution669 {
	
	//sol1
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if(root==null)
			return root;
        if(root.val>R)
        	return trimBST(root.left,L,R);
        if(root.val<L)
        	return trimBST(root.right,L,R);
        root.left=trimBST(root.left,L,R);
        root.right=trimBST(root.right,L,R);
        return root;
    }
	//sol2
//	public TreeNode trimBST(TreeNode root, int L, int R) {
//        if(root==null)
//        	return null;
//        
//        while(root.val>R || root.val<L)
//        {
//        	if(root.val>R)
//        		root=root.left;
//        	if(root.val<L)
//        		root=root.right;
//        }
//        TreeNode tmp=root;
//        while(tmp!=null)
//        {
//        	while(tmp.left!=null && tmp.left.val<L)
//        		tmp.left=tmp.left.right;
//        	tmp=tmp.left;
//        }
//        tmp=root;
//        while(tmp!=null)
//        {
//        	while(tmp.right!=null && tmp.right.val>R)
//        		tmp.right=tmp.right.left;
//        	tmp=tmp.right;
//        }
//		return root;
//    }
}
