package practice;

public class Solution404 {
	//sol2
	public int sumOfLeftLeaves(TreeNode root) {
		if(root==null)
			return 0;
		int ans=0;
		if(root.left!=null)
		{
			if(root.left.left==null && root.left.right==null)
				ans=ans+root.left.val;
			else
				ans=ans+sumOfLeftLeaves(root.left);
		}
		ans=ans+sumOfLeftLeaves(root.right);
		return ans;
    }
	
//	//sol1
//	public int sumOfLeftLeaves(TreeNode root) {
//		return sum(root,false);
//    }
//	
//	private int sum(TreeNode root,boolean flag){
//		if(root==null)
//			return 0;
//		if(root.left==null && root.right==null && flag)
//			return root.val;
//		else
//			return sum(root.left,true)+sum(root.right,false);
//	}
}
