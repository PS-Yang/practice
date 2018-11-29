package practice;

public class Solution543 {
	private int len=0;
	public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return len;
    }
	public int depth(TreeNode t){
		if(t==null)
			return 0;
		int L=depth(t.left);
		int R=depth(t.right);
		len=Math.max(L+R, len);
		return Math.max(L,R)+1;
	}
}
