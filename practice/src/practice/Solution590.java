package practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution590 {
	//sol3
	public List<Integer> postorder(Node root) {
		List<Integer> ans=new LinkedList<>();
		if(root==null)
			return ans;
        Stack<Node> st=new Stack<>();
        st.add(root);
        while(!st.isEmpty())
        {
        	Node n=st.pop();
        	ans.add(n.val);
        	for(Node node:n.children)
        		st.push(node);
        	
        }
        Collections.reverse(ans);
        return ans;
    }
//	//sol2 recursive
//	private List<Integer> ans=new LinkedList<>();
//	public List<Integer> postorder(Node root) {
//        if(root==null)
//        	return ans;
//        
//		for(Node n:root.children)
//			postorder(n);
//		
//		ans.add(root.val);
//		return ans;
//    }
	//sol1 recursive
//	private List<Integer> ans=new LinkedList<>();
//	public List<Integer> postorder(Node root) {
//        if(root==null)
//        	return ans;
//        help(root);
//		Collections.reverse(ans);
//		return ans;
//    }
//	public void help(Node root){
//		ans.add(root.val);
//        List<Node> child=root.children;
//		for(int i=child.size()-1;i>=0;i--)
//			help(child.get(i));
//	}
}
