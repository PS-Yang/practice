package practice;

public class Solution1080 {
	// using recursion , the top node will wait the leaf node answer
	public TreeNode sufficientSubset(TreeNode root, int limit) {
		if (root.left == null && root.right == null)  // if (root.lefr == root.right)
			return root.val < limit ? null : root; 
		if (root.left!=null)
			root.left=sufficientSubset(root.left, limit-root.val);
		if (root.right!=null)
			root.right=sufficientSubset(root.right, limit-root.val);
		
		return root.left==root.right ? null : root;
    }
}