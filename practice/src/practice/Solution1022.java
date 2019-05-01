package practice;

public class Solution1022 {
	//sol2
	private int MOD = 1000000007;
	public int sumRootToLeaf(TreeNode root) {
		return strRootToLeaf(root,0);
    }
	
	public int strRootToLeaf(TreeNode root,int cur) {
		if(root==null)
			return 0;
        cur=(cur*2+root.val) % MOD;
        return root.left == root.right ? cur : strRootToLeaf(root.left,cur) + strRootToLeaf(root.right,cur);
    }
	//sol1
//	private int total = 0 ;
//	private int MOD = 1000000007;
//	public int sumRootToLeaf(TreeNode root) {
//		if(root!=null)
//			strRootToLeaf(root,0);
//		return total;
//    }
//	
//	public void strRootToLeaf(TreeNode root,int cur) {
//		if(root!=null)
//			cur= (cur+root.val)% MOD;
//        if(root.left!=null)
//        	strRootToLeaf(root.left,(cur*2)% MOD);
//        if(root.right!=null)
//        	strRootToLeaf(root.right,(cur*2)% MOD);
//        if(root.left==null && root.right==null)
//        	total= (total+cur) % MOD;
//    }
}
