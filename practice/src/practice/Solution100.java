package practice;

public class Solution100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null)
			return true;
		else if (p==null || q==null)
			return false;
		else if(p.val!=q.val)
			return false;
		else
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
//	public boolean issame(TreeNode p, TreeNode q){
//		while(p!=null && q!=null)
//		{
//			if(p.left!=null && q.left!=null && p.left.val!=q.left.val)
//				return false;
//			if(p.right!=null && q.right!=null && p.right.val!=q.right.val)
//				return false;
//		}
//		return true;
//	}
}
