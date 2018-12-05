package practice;

import java.util.HashSet;

public class Solution653 {
	//sol2
	public boolean findTarget(TreeNode root, int k) {
        if(root==null)
        	return false;
        HashSet<Integer> set=new HashSet<>();
        return find(root,k,set);
    }
	public boolean find(TreeNode root, int k ,HashSet<Integer> set) {
		if(root==null)
			return false;
		if(set.contains(k-root.val))
			return true;
		set.add(root.val);
		return find(root.left,k,set) || find(root.right,k,set);
	}
//	//sol1 
//	public boolean findTarget(TreeNode root, int k) {
//        if(root==null)
//        	return false;
//        ArrayList<Integer> list=new ArrayList<>();
//        Stack<TreeNode>  s=new Stack<>();
//        TreeNode node=root;
//        while(!s.isEmpty() || node!=null)
//        {
//        	while(node!=null)
//        	{
//        		s.push(node);
//        		node=node.left;
//        	}
//        	node=s.pop();
//        	list.add(node.val);
//        	node=node.right;
//        }
//        int i=0;
//        int j=list.size()-1;
//        while(i<j)
//        {
//        	if(list.get(i)+list.get(j)==k)
//        		return true;
//        	else if(list.get(i)+list.get(j)<k)
//        		i++;
//        	else
//        		j--;
//        }
//        return false;
//    }
}
