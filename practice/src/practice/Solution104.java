package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution104 {
	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		else
			return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }

}
