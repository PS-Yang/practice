package practice;

import java.util.Stack;

public class Solution538 {
	//sol 1 recursive 
	 private int sum=0;
	 public TreeNode convertBST(TreeNode root) {
		 if(root==null)
			 return null;
		 
		 convertBST(root.right);
		 sum=sum+root.val;
		 root.val=sum;
		 convertBST(root.left);
		 
		 return root;
	 }
	 //sol2 using stack
//	 public TreeNode convertBST(TreeNode root) {
//		 if(root==null)
//			 return null;
//		 int sum=0;
//		 TreeNode node=root;
//		 Stack<TreeNode> st=new Stack<>();
//		 
//		 while(!st.isEmpty() || node!=null)
//		 {
//			 while(node!=null) //將右邊的點放進STACK
//			 {
//				 st.add(node);
//				 node=node.right;
//			 }
//			 node=st.pop();
//			 sum=sum+node.val;
//			 node.val=sum;
//			 node=node.left;
//		 }
//		 
//		 return root;
//	 }
	
}
