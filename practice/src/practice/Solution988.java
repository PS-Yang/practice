package practice;

public class Solution988 {
	//	sol2
	private String ans="";
	public String smallestFromLeaf(TreeNode root) {
        if(root==null)
        	return ans;
		find(root,"");
		return ans;
    }
	private void find(TreeNode root,String tmp)
	{
		tmp=(char) (root.val+97)+tmp;
		if(root.left!=null)
			find(root.left,tmp);
		if(root.right!=null)
			find(root.right,tmp);
		if(root.left==null && root.right==null)
		{
			if(ans.equals(""))
				ans=tmp;
			else
			{
				if(ans.compareTo(tmp)>0)
					ans=tmp;
			}
		}	
	}
//	//	sol1
//	private String ans="";
//	public String smallestFromLeaf(TreeNode root) {
//        if(root==null)
//        	return ans;
//		find(root,"");
//		return ans;
//    }
//	private void find(TreeNode root,String tmp)
//	{
//		tmp=(char) (root.val+97)+tmp;
//		if(root.left!=null)
//			find(root.left,tmp);
//		if(root.right!=null)
//			find(root.right,tmp);
//		if(root.left==null && root.right==null)
//		{
//			if(ans.equals(""))
//				ans=tmp;
//			else
//			{
//				if(ans.compareTo(tmp)>0)
//					ans=tmp;
//			}
//		}	
//	}
}
