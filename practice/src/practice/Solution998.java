package practice;

public class Solution998 {
	//sol3
	public TreeNode insertIntoMaxTree(TreeNode root, int val) {
		if (root != null && root.val > val) 
		{
            root.right = insertIntoMaxTree(root.right, val);
            return root;
        }
        TreeNode node = new TreeNode(val);
        node.left = root;
        return node;
    }
	//sol2  fixed form sol1
//	public TreeNode insertIntoMaxTree(TreeNode root, int val) {
//		TreeNode ans=null;
//		if(root==null)
//			return new TreeNode(val);
//		if(root.val<val)
//		{
//			ans=new TreeNode(val);
//			ans.left=root;
//			return ans;
//		}
//		root.right=insertIntoMaxTree(root.right, val);
//        return root;
//    }
	//sol1 in contest
//	public TreeNode insertIntoMaxTree(TreeNode root, int val) {
//		TreeNode ans=null;
//		if(root==null)
//		{
//			ans=new TreeNode(val);
//			return ans;
//		}
//		if(root.val<val)
//		{
//			ans=new TreeNode(val);
//			ans.left=root;
//			return ans;
//		}
//		if(root.right==null || (root.left!=null && val>root.left.val) || (root.right!=null && val<root.val))
//			root.right=insertIntoMaxTree(root.right, val);
//		else
//			root.left=insertIntoMaxTree(root.left,val);		
//        return root;
//    }
}
