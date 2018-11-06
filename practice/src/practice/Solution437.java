package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution437 {
	public int pathSum(TreeNode root, int sum) {
		if(root==null)
			return 0; 
//		return tmppath(root,sum,true);
		return tmppath2(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
	//sol2
	public int tmppath2(TreeNode root, int sum) {
		if(root==null)
			return 0;
		else 
		{
			return sum==root.val?1:0
					+tmppath2(root.left,sum-root.val)+tmppath2(root.right,sum-root.val);
		}
	}
	
	//sol1
	 public int tmppath(TreeNode root, int sum, boolean flag) {
			if(root==null)
				return 0;
			else if(flag)
			{
				return  (sum==root.val?1:0)
						+tmppath(root.left,sum-root.val,false)+tmppath(root.right,sum-root.val,false)
						+tmppath(root.left,sum,true)+tmppath(root.right,sum,true);
			}
			else 
			{
				return (sum==root.val?1:0)
						+tmppath(root.left,sum-root.val,false)+tmppath(root.right,sum-root.val,false);
			}
		}
}
