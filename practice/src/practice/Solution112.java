package practice;

public class Solution112 {
	public boolean hasPathSum(TreeNode root, int sum) {
			if(root==null)
				return false;
			else if(sum-root.val==0 && root.right==null && root.left==null)
        		return true;
        	else
        		return hasPathSum(root.left,sum-root.val) ||hasPathSum(root.right,sum-root.val);	
    }
}
