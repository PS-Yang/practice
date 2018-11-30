package practice;

public class Solution563 {
	private int sum=0;
	public int findTilt(TreeNode root) {
		sum(root);
		return sum;
    }
	
	public int sum(TreeNode root){
		if(root==null)
			return 0;
		int right=sum(root.right);
		int left=sum(root.left);
		sum=sum+Math.abs(right-left);
		return root.val+right+left;
	}
	
	//sol 1
//	public int findTilt(TreeNode root) {
//		if(root==null)
//			return 0;
//		return Math.abs(sum(root.right)-sum(root.left))+findTilt(root.left)+findTilt(root.right);
//    }
//	
//	public int sum(TreeNode root){
//		if(root==null)
//			return 0;
//		else
//			return root.val+sum(root.left)+sum(root.right);
//	}
}
