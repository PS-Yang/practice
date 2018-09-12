package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39 {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) 
	{
        List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(candidates);  // sort the array int[].
		List<Integer> temp = new ArrayList<>();
		dfs(ans,temp,candidates,0,target);
		return ans;
	}
	private void dfs(List<List<Integer>> ans,List<Integer> tmp,int[] num,int current,int remain)
	{
		if(remain==0)
			ans.add(new ArrayList<Integer>(tmp));
		else
		{
			for(int i=current;i<num.length;i++) //從current開始
			{
				if(remain<num[i]) 
					break;
				tmp.add(num[i]); //put num[i] into array
		        dfs(ans,tmp, num, i,remain-num[i]);//call 
		        tmp.remove(tmp.size()-1);
			}
					
		}
	}
}
