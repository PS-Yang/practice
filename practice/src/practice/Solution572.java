package practice;

public class Solution572 {
	//sol2
	public boolean isSubtree(TreeNode s, TreeNode t) {
        return s!=null  && ( thesame(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t));
    }
	
	private boolean thesame(TreeNode s, TreeNode t){
		if(s==null && t==null)
			return true;
		if(s==null || t==null)
			return false;
		return s.val==t.val && thesame(s.left,t.left) && thesame(s.right,t.right);
	}
	//sol1
//	public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(s==null || t== null)
//        	return true;
//        String tree1=preorder(s);
//        String tree2=preorder(t);
//        return tree1.indexOf(tree2)!=-1;
//    }
//	
//	private String preorder(TreeNode n){
//		if(n==null)
//			return "null";
//		return "@"+n.val+"-"+preorder(n.left)+"-"+preorder(n.right);
//	}
}
