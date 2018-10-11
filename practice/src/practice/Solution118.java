package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans= new ArrayList<List<Integer>>();
		List<Integer> prev=new ArrayList<>();
		for(int i=1;i<=numRows;i++)
		{
			List<Integer> tmp=new ArrayList<>();
			if(i==1)
				tmp.add(1);
			else 
			{
				tmp.add(1);
				for(int b=1;b<prev.size();b++)
					tmp.add(prev.get(b)+prev.get(b-1));
				tmp.add(1);
			}
			ans.add(tmp);
			prev=tmp;
		}
		return ans;
    }
}
