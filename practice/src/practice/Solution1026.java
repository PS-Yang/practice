package practice;

public class Solution1026 {
	//sol2
	public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode root, int mn, int mx) {
        if (root == null) return mx - mn;
        mx = Math.max(mx, root.val);
        mn = Math.min(mn, root.val);
        return Math.max(dfs(root.left, mn, mx), dfs(root.right, mn, mx));
    }
	//sol1
//	private int ans=-1;
//	public int maxAncestorDiff(TreeNode root) {
//		maxAncess(root,-1,-1);
//		return ans;
//    }
//	private void maxAncess(TreeNode root,int min,int max) {
//		if(min==-1)
//		{
//			min=root.val;
//			max=root.val;
//		}
//		else 
//		{
//			ans=Math.max(ans, Math.abs(root.val-min));
//			ans=Math.max(ans, Math.abs(root.val-max));
//			min=Math.min(min, root.val);
//			max=Math.max(max, root.val);
//		}
//		if(root.left!=null)
//			maxAncess(root.left,min,max);
//		if(root.right!=null)
//			maxAncess(root.right,min,max);	
//	}

}
