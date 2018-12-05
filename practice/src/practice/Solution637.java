package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution637 {
	
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> ans=new LinkedList<>();
        if(root==null)
        	return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
        	int N=q.size();
        	long sum=0;
        	for(int i=0;i<N;i++)
        	{
        		TreeNode t=q.poll();
        		sum+=(long)t.val;
        		if(t.left!=null)
        			q.offer(t.left);
        		if(t.right!=null)
        			q.offer(t.right);
        	}
        	ans.add( (double)sum/N);
        	
        }
		return ans;
    }
}
