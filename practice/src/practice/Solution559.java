package practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution559 {
	//sol2 recursion
	public int maxDepth(Node root) {
        if(root==null)
        	return 0;
        else if(root.children.isEmpty())
        	return 1;
        else
        {
        	List<Integer> depth=new LinkedList<>();
        	for(Node n:root.children)
        		depth.add(maxDepth(n));
        	return Collections.max(depth)+1;
        }
     
    }
//	//sol1 iterator
//	public int maxDepth(Node root) {
//        if(root==null)
//        	return 0;
//        Queue<Node> q=new LinkedList<>();
//        q.add(root);
//        int depth=0;
//        while(!q.isEmpty())
//        {
//        	int N=q.size();
//        	for(int i=0;i<N;i++)
//        	{
//        		Node n=q.poll();
//        		for(int j=0;j<n.children.size();j++)
//        			q.add(n.children.get(j));	
//        	}
//        	depth++;
//        }
//        return depth;
//    }
	
	//sol3
//	public int maxDepth(Node root) {
//        if(root==null)
//        	return 0;
//        if(root.children.isEmpty())
//        	return 1;
//        int max=0;
//    	for(Node n:root.children)
//    		max=Math.max(max, maxDepth(n)+1);
//        return max;
//    }
	

}
