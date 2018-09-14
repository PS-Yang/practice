package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
	public List<String> generateParenthesis(int n) {
		List<String> ans= new ArrayList<>();
		generate(ans,0,0,"",n);
		return ans;
    }
	private void generate(List<String> ans,int left,int right,String str,int size){
		if(left<right)
			return;
		if (left==right && size==right)
		{
			ans.add(str);
			return;
		}
		if(left<size) //左括號還沒超過長度時
			generate(ans,left+1,right,str+"(",size);
		if(right<left) //右括號小於左括號
			generate(ans,left,right+1,str+")",size);
	}
}
