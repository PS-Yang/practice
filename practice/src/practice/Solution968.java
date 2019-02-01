package practice;

import java.util.HashMap;
import java.util.Stack;

public class Solution968 {
	private int ans=0;
	public int minCameraCover(TreeNode root) {
		if(root==null)
			return ans;
		dsp(root);
		return ans==0 ? 1:ans;
    }
	private int dsp(TreeNode root) {
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
			return 0;

		int left=dsp(root.left);
		int right=dsp(root.right);
    	if( left==0 && right==0 )
    	{
    		root.val=1;
    		ans++;
    		return 1;
    	}
    	else if( (left== 1 && right==0)|| (left== 0 && right==1))
    	{
    		root.val=1;
    		ans++;
    		return 1;
    	}
    	else if( left== 1 || right==1)
    	{
    		root.val=2;
    		return 2;
    	}
    	else 
    	{
    		root.val=1;
    		ans++;
    		return 1;
    	}
    		
	}
	
	//sol1
//	private int ans=0;
//	public int minCameraCover(TreeNode root) {
//		return (dsp(root)<1 ? 1:0)+ans;
//    }
//	private int dsp(TreeNode root) {
//		int left= root.left!=null ? dsp(root.left) : 2;
//		int right=root.right!=null ? dsp(root.right) : 2;
//		
//    	if( left==0 || right==0 )
//    	{
//    		ans++;
//    		return 1;
//    	}
//    	return left == 1 || right == 1 ? 2:0;
//	}
	
	
//	public int minCameraCover(TreeNode root) {
//		if(root.right==null && root.left==null)
//			return 1;
////        HashMap<TreeNode, Integer> map=new HashMap<>(); //
//        Stack<TreeNode> st=new Stack<>();
//        TreeNode cur=root;
//        int ans=0;
//        while(!st.isEmpty() || cur!=null)
//        {
//        	while(cur!=null)
//        	{
//        		st.add(cur);
//        		cur=cur.left;
//        	}
//        	
//        	cur=st.pop();
//        	int left=-1,right=-1;
//        	if(cur.left!=null)
//        		left=cur.left.val;
//        	if(cur.right!=null)
//        		right=cur.right.val;
//        	if( left==0 || right==0 )
//        	{
//        		cur.val=1;
//        		ans++;
//        	}
//        	cur=cur.right;
//        }
//		return ans;
//    }
}
