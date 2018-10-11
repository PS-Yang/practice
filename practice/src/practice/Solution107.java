package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution107 {
	//2.sol
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		if(root==null)
			return ans;
		q.add(root);
		while(!q.isEmpty())
		{
			int size=q.size();
			List<Integer> tmp=new ArrayList<Integer>();
			for(int i=0;i<size;i++)
			{
				TreeNode t=q.poll();
				if(t.left!=null)
					q.add(t.left);
				if(t.right!=null)
					q.add(t.right);
				tmp.add(t.val);
			}
			ans.add(tmp);
		}
		Collections.reverse(ans);
		return ans;
    }
//	//1版
//	public List<List<Integer>> levelOrderBottom(TreeNode root) {
//		List<List<Integer>> ans=new ArrayList<List<Integer>>();
//		if(root==null)
//			return ans;
//		Queue<TreeNode> q=new LinkedList<TreeNode>();
//		HashMap<TreeNode,Integer> maplen=new HashMap<>();
//		HashMap<Integer,List<Integer>> maplist=new HashMap<>();
//		q.add(root);
//		maplen.put(root, 1);
//		while(!q.isEmpty())
//		{
//			TreeNode t=q.poll();
//			int len=maplen.get(t);
//			List<Integer> tmp=maplist.getOrDefault(len, new ArrayList<Integer>());
//			tmp.add(t.val);
//			maplist.put(len, tmp);
//			if(t.left!=null)
//			{
//				q.add(t.left);
//				maplen.put(t.left, len+1);
//			}
//			if(t.right!=null)
//			{
//				q.add(t.right);
//				maplen.put(t.right, len+1);
//			}
//		}
//		ans.addAll(maplist.values());
//		Collections.reverse(ans);
//		return ans;
//    }
}
