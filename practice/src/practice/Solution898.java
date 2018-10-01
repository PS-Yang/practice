package practice;

import java.util.HashSet;

public class Solution898 {
	public int subarrayBitwiseORs(int[] A) {
		if(A.length==0)
			return 0;
		HashSet<Integer> ans=new HashSet<>();
		HashSet<Integer> tmp=new HashSet<>();
		
        for(int a:A)
        {
        	tmp.add(a);
        	HashSet<Integer> cur=new HashSet<>();
        	for(int b:tmp)
        	{
        		cur.add(a|b);
        	}
        	ans.addAll(cur);
        	tmp=cur;	
        }
		
		return ans.size();
    }
}
