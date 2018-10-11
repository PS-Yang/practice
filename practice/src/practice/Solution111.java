package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution111 {
	//2.遞回
	public int minDepth(TreeNode root) {
		if(root==null)
			return 0;
		else if(root.left==null || root.right==null)
			return Math.max(minDepth(root.left), minDepth(root.right))+1;
		else
			return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
//	//1.非遞回
//	public int minDepth(TreeNode root) {
//		if(root==null)
//			return 0;
//		Queue<TreeNode> q=new LinkedList<>();
//        q.add(root);
//        int len=1;
//        while(!q.isEmpty())
//        {
//        	int size=q.size();
//        	for(int i=0;i<size;i++)
//        	{
//        		TreeNode t=q.poll();
//        		if(t.left==null && t.right==null)
//        			return len;
//        		if(t.left!=null)
//        			q.add(t.left);
//        		if(t.right!=null)
//        			q.add(t.right);
//        	}
//        	len++;
//        }
//        return len;
//    }
}
