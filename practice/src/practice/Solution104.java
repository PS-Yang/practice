package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution104 {
	//1.遞回
	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		else
			return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
//	//2.非遞回
//	public int maxDepth(TreeNode root) {
//		Queue<TreeNode> q=new LinkedList<TreeNode>();
//		HashMap<TreeNode,Integer> map=new HashMap<>();
//		if(root==null)
//			return 0;
//		q.add(root);
//		map.put(root, 1);
//		int len=1;
//		while(!q.isEmpty())
//		{
//			TreeNode t=q.poll();
//			int n=map.get(t);
//			len=Math.max(n, len);
//			if(t.left!=null)
//			{
//				q.add(t.left);
//				map.put(t.left, n+1);
//			}
//				
//			if(t.right!=null)
//			{
//				q.add(t.right);
//				map.put(t.right, n+1);
//			}
//		}
//		return len;
//    }
}
