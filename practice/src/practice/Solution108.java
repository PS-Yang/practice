package practice;

public class Solution108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length==0)
			return null;
		return BST(0,nums.length-1,nums);
    }
	public TreeNode BST(int begin,int end,int[] nums){
		if(begin>end)
			return null;
		int mid=(begin+end)/2;
		TreeNode root=new TreeNode(nums[mid]);
		root.left=BST(begin,mid-1,nums);
		root.right=BST(mid+1,end,nums);
        return root;
	}
}
