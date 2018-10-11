package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution110 {
	//2. 根據1下去修改 提早回傳 
	public boolean isBalanced(TreeNode root) {
			return height(root)!=-1;
    }
	public int height(TreeNode t){
		if(t==null)
			return 0;
		int left=height(t.left);
		if(left==-1)
			return -1;
		int right=height(t.right);
		if(right==-1)
			return -1;
		if(Math.abs(left-right)>1)
			return -1;
		return Math.max(left,right)+1;
	}
	
//	//1.利用題目104得解法
//	private boolean result=true;
//	public boolean isBalanced(TreeNode root) {
//		maxDepth(root);
//		return result;
//	}
//	public int maxDepth(TreeNode root) {
//		if(root==null)
//			return 0;
//		int l=maxDepth(root.left);
//		int r=maxDepth(root.right);
//		if(Math.abs(l-r)>1)
//			result=false;
//		return Math.max(r, l)+1;
//    }
}
