package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution257 {
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        if(root!=null)
        	BTS(root,"",ans);
        return ans;
    }
	public void BTS(TreeNode root,String path,List<String> ans){
		if(root.left==null && root.right==null)
			ans.add(path+root.val);
		if(root.left != null) 
			BTS(root.left, path + root.val + "->", ans);
	    if(root.right != null) 
	    	BTS(root.right, path + root.val + "->", ans);
		
	}
}
