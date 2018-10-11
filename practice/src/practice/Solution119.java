package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> ans=new ArrayList<>();
		if(rowIndex<0)
			return ans;
        for(int i=0;i<=rowIndex;i++)
        {
        	ans.add(0,1);
        	for(int j=1;j<ans.size()-1;j++)
        		ans.set(j, ans.get(j)+ans.get(j+1));
        }
		return ans;
    }
}
