package practice;

import java.util.Stack;

public class Solution114 {
	//sol1
	public void flatten(TreeNode root) {
		if(root==null)
			return;
        TreeNode ans=new TreeNode(0);
        TreeNode cur=ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()) 
        {
        	TreeNode tmp=st.pop();
        	if(tmp.right!=null)
        		st.push(tmp.right);
        	if(tmp.left!=null)
        		st.push(tmp.left);
        	cur.left=null;
        	cur.right=tmp;
        	cur=cur.right;
		}
        root=ans.right;
    }
}
