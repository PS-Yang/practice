package practice;

import java.util.Stack;

public class Solution979 {
	//前提 N個節點只會有N個印幣 => 代表的是最後每個節點的值都為1
	private int ans=0;
	public int distributeCoins(TreeNode root) {
		dfs(root);
		return ans;
	}
	private int dfs(TreeNode root) {
		if(root==null)
			return 0;
		int left=dfs(root.left), right=dfs(root.right);
		ans+=Math.abs(left)+Math.abs(right);
		return root.val+left+right-1;
	}
}




