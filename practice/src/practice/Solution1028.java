package practice;

import java.util.Stack;

public class Solution1028 {
	public TreeNode recoverFromPreorder(String S) {
        int lev,val;
        Stack<TreeNode> stack=new Stack<>();
		for (int i = 0; i < S.length();) 
		{
			
			for(lev=0;S.charAt(i)=='-';i++) 
				lev++;
			for(val=0;i<S.length() && S.charAt(i)!='-';i++) 
				val=val*10+(S.charAt(i)-'0');
			TreeNode cur=new TreeNode(val);
			while(stack.size()>lev)
				stack.pop();
			if(!stack.isEmpty())
			{
				if(stack.peek().left==null)
					stack.peek().left=cur;
				else 
					stack.peek().right=cur;
			}
			stack.push(cur);
		}
		TreeNode ans=new TreeNode(0);;
		while (!stack.isEmpty()) 
			ans=stack.pop();
		return ans;
    }
}
