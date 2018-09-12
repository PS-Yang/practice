package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution412 {
	 public List<String> fizzBuzz(int n) {
		 List<String> ans=new ArrayList<>();
		 for(int i=1;i<=n;i++)
		 {	 
			 if(i%15==0) 
				 ans.add("FizzBuzz");
			 else if(i%3==0)
				 ans.add("Fizz");
			 else if(i%5==0)
				 ans.add("Buzz");
			 else
				 ans.add(Integer.toString(i));	 
		 }
		 return ans;
	 }
//	 public List<String> fizzBuzz(int n) {
//		 List<String> ans=new ArrayList<>();
//		 for(int i=1;i<=n;i++)
//		 {	 
//			 StringBuilder str=new StringBuilder ();
//			 if(i%3==0) 
//				 str.append("Fizz");
//			 if(i%5==0)
//				 str.append("Buzz");
//			 if(str.length()>0)
//				 ans.add(str.toString());
//			 else
//				 ans.add(Integer.toString(i));	 
//		 }
//		 return ans;
//	 }
}
