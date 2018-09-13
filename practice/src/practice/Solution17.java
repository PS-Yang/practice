package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution17 {
	 public List<String> letterCombinations(String digits) {
		 List<String> ans=new ArrayList<>();
		 String map[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		 for(int i=0;i<digits.length();i++)
		 {
			 int t=digits.charAt(i)-'2';
			 if(t<0 || t>9)
				 return new ArrayList<>();
			 List<String> temp=new ArrayList<>();
			 temp.addAll(ans);
			 ans.clear();
			 for(int j=0;j<map[t].length();j++)  //abc or def or ghi...
			 {
				 if(i==0)
					 ans.add(map[t].substring(j,j+1));
				 else
				 {
					 for(int k=0;k<temp.size();k++)
						 ans.add(temp.get(k)+map[t].substring(j,j+1));
				 }
			 }
		 }
		 return ans;   
	 }
}
