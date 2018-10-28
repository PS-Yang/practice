package practice;

public class Solution404 {
	public int sumOfLeftLeaves(TreeNode root) {
		return sum(root,false);
    }
	
	private int sum(TreeNode root,boolean flag){
		if(root==null)
			return 0;
		if(root.left==null && root.right==null && flag)
			return root.val;
		else
			return sum(root.left,true)+sum(root.right,false);
	}
}
