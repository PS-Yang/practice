package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution919 {
	
	private List<TreeNode> tree;
	public Solution919(TreeNode root) {
		tree=new ArrayList<>();
		tree.add(root);
		for(int i=0;i<tree.size();++i)
		{
			if(tree.get(i).left!=null)
				tree.add(tree.get(i).left);
			if(tree.get(i).right!=null)
				tree.add(tree.get(i).right);
		}
//		for(TreeNode t:tree)
//	        System.out.print(t.val);
//		 System.out.println();
    }
    
    public int insert(int v) {
    	int N=tree.size();
        TreeNode node=new TreeNode(v);
        tree.add(node);
        if (N % 2 == 1)
            tree.get((N - 1) / 2).left = node;
        else
            tree.get((N - 1) / 2).right = node;
        return tree.get((N - 1) / 2).val;
    }
    
    public TreeNode get_root() {
        return tree.get(0);
    }
}
