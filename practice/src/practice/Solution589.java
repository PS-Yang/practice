package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution589 {
	//sol2
	private List<Integer> ans=new LinkedList<>();
	public List<Integer> preorder(Node root) {
		if(root==null)
			return ans;
		ans.add(root.val);
		for(Node n:root.children)
			preorder(n);
		return ans;     
    }
	//sol1 iterative
//	public List<Integer> preorder(Node root) {
//		List<Integer> ans=new LinkedList<>();
//		if(root==null)
//			return ans;
//        Stack<Node> st=new Stack<>();
//        st.add(root);
//        while(!st.isEmpty())
//        {
//        	Node n=st.pop();
//        	ans.add(n.val);
//        	for(int i=n.children.size()-1;i>=0;i--)
//        		st.push(n.children.get(i));
//        	
//        }
//        return ans;
//    }
}
