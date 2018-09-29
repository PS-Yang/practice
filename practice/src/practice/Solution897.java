package practice;


public class Solution897 {
	public TreeNode increasingBST(TreeNode root) {	
        return BST(root,null);
    }
	public TreeNode BST(TreeNode root,TreeNode end){
		if(root==null)
			return end;
		TreeNode tmp=BST(root.left,root);
		root.left=null;
		root.right = BST(root.right, end);
		return tmp;
	}
}
