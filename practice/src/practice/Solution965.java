package practice;

public class Solution965 {
	//sol2
	public boolean isUnivalTree(TreeNode root) {
		return  (root.left==null || (root.val == root.left.val && isUnivalTree(root.left)))
				&& (root.right==null || (root.val == root.right.val && isUnivalTree(root.right)));
       
    }
	//sol1
//	public boolean isUnivalTree(TreeNode root) {
//        if (root==null) 
//			return true;
//        if(root.left!=null && root.val!=root.left.val)
//        	return false;
//        else if(root.right!=null && root.val!=root.right.val)
//        	return false;
//        else 
//        	return isUnivalTree(root.right) && isUnivalTree(root.left);
//    }
}
