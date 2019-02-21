package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution993 {
	//sol 1
	HashMap<Integer, int[]> map=new HashMap<>();
	public boolean isCousins(TreeNode root, int x, int y) {
		find(root,-1,0);
		return map.get(x)[0]!=map.get(y)[0] && map.get(x)[1]==map.get(y)[1];
    }
	private void find(TreeNode root,int par ,int dep) {
		if(root==null)
			return ;
		map.put(root.val, new int []{par,dep});
		dep++;
		find(root.left,root.val,dep);
		find(root.right,root.val,dep);
	}
}
