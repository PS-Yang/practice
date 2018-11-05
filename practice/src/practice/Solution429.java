package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> ans =new ArrayList<>();
		if(root==null)
			return ans;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			int n=q.size();
			List<Integer> tmp=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				Node N=q.poll();
				tmp.add(N.val);
				if(N.children!=null)
					for(int j=0;j<N.children.size();j++)
						q.add(N.children.get(j));
			}
			ans.add(tmp);
		}
		
		
		
		
		return ans;
    }
}
