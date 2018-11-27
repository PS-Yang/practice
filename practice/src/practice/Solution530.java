package practice;

import java.util.Stack;

public class Solution530 {
	//sol2
	private int min=Integer.MAX_VALUE;
	private Integer prev=null;
	public int getMinimumDifference(TreeNode root) {
		if(root==null)
			return min;
		getMinimumDifference(root.left);
		
		if(prev!=null)
			min=Math.min(min, root.val-prev);
			
		prev=root.val;
		
		getMinimumDifference(root.right);
		return min;
    }
	
	//sol 1
//	public int getMinimumDifference(TreeNode root) {
//        int ans=Integer.MAX_VALUE;
//        Stack<TreeNode> st=new Stack<>();
//        if(root!=null)
//        	st.add(root);
//        while(!st.isEmpty())
//        {
//        	TreeNode r=st.pop();
//        	TreeNode left=r.left;
//        	TreeNode right=r.right;
//        	if(left!=null)
//        		st.push(left);
//        	if(right!=null)
//        		st.push(right);
//        	while(left!=null)
//        	{
//        		ans=Math.min(ans, Math.abs(r.val-left.val));
//        		left=left.right;
//        	}
//        	while(right!=null)
//        	{
//        		ans=Math.min(ans, Math.abs(r.val-right.val));
//        		right=right.left;
//        	}
//        	
//        }
//        return ans;
//    }
}
