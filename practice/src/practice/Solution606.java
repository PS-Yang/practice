package practice;

public class Solution606 {
	//sol2
	public String tree2str(TreeNode t) {
        if(t==null)
        	return "";
        if(t.left==null && t.right==null)
            return t.val+"";
        if(t.right==null)
            return t.val+"("+tree2str(t.left)+")";
        return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
		
    }
	//sol1
//	private StringBuilder sb=new StringBuilder();
//	public String tree2str(TreeNode t) {
//        if(t==null)
//        	return sb.toString();
//		sb.append(t.val);
//		if(t.left!=null)
//		{
//			sb.append("(");
//			tree2str(t.left);
//			sb.append(")");
//		}
//		if(t.right!=null)
//			sb.append("()");
//		if(t.right!=null)
//		{
//			sb.append("(");
//			tree2str(t.right);
//			sb.append(")");
//		}
//		return sb.toString();
//    }
}
