package practice;

import java.util.Stack;

public class Solution687 {
	//sol1
	private int count=0;
	public int longestUnivaluePath(TreeNode root) {
        if(root==null)
        	return 0;
        path(root,root.val);
        return count;
    }
	private int path(TreeNode root,int cur){
		if(root==null)
			return 0;
		int left=path(root.left,root.val);
		int right=path(root.right,root.val);
		int tmp=0;
		count=Math.max(count, left+right);
		if(root.val==cur)
			tmp=Math.max(left, right)+1;
		return tmp;
	}
}
