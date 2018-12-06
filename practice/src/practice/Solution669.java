package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution669 {
	public TreeNode trimBST(TreeNode root, int L, int R) {
        Queue<TreeNode> q=new LinkedList<>();
		TreeNode N=root;
        while(!q.isEmpty() || N!=null)
        {
        	while(N!=null && N.val>=L && N.val<=R)
        	{
        		q.add(N);
        		N=N.left;
        	}
        }
        
		return root;
    }
}
