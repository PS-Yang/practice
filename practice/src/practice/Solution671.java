package practice;

public class Solution671 {
	//sol1
	private int small=Integer.MAX_VALUE;
	private int small2=Integer.MAX_VALUE;
	public int findSecondMinimumValue(TreeNode root) {
		if(root==null)
			return -1;
        if(root!=null)
        {
        	if(root.val<small)
        	{
        		small2=small;
            	small=root.val;
        	}
        	else if (root.val<small2 && root.val>small)
        		small2=root.val;
        }
        if(root.left!=null)
        	findSecondMinimumValue(root.left);
        
        if(root.right!=null)
        	findSecondMinimumValue(root.right);
        return small2==Integer.MAX_VALUE ? -1:small2;
    }
	
	//sol2
//	public int findSecondMinimumValue(TreeNode root) {
//		if(root==null || (root.left==null && root.right==null))
//			return -1;
//        int left=root.left.val;
//        int right=root.right.val;
//        if(left==root.val)
//        	left=findSecondMinimumValue(root.left);
//        if(right==root.val)
//        	right=findSecondMinimumValue(root.right);
//        
//        if(left!=-1 && right!=-1)
//        	return Math.min(left, right);
//        else if(left!=-1)
//        	return left;
//        else
//        	return right;
//    }
}
