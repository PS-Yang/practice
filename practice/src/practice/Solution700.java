package practice;

public class Solution700 {
	//sol3
	public TreeNode searchBST(TreeNode root, int val) {
		while(root!=null && root.val!=val)
		{
			root= root.val>val ? root.left :root.right;
		}
		return root;
	}
	//sol2
//	public TreeNode searchBST(TreeNode root, int val) {
//		if(root==null)
//			return null;
//    	if(root.val==val)
//    		return root;
//    	else
//    	{
//    		if(root.val>val)
//        		return searchBST(root.left,val);
//    		else
//        		return searchBST(root.right,val);
//    	}
//	}
	//sol1
//	public TreeNode searchBST(TreeNode root, int val) {
//			if(root==null)
//    			return null;
//        	if(root.val==val)
//        		return root;
//        	
//        	TreeNode left=searchBST(root.left,val);
//        	if(left!=null && left.val==val)
//        		return left;
//        	TreeNode right=searchBST(root.right,val);
//        	if(right!=null && right.val==val)
//        		return right;
//        	return null;
//    }
}
