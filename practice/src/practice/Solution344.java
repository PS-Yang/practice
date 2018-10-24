package practice;

public class Solution344 {
	//sol1
	public String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
    }
//	//sol2
//	public String reverseString(String s) {
//		if(s==null || s.length()==0)
//			return "";
//		StringBuilder ans=new StringBuilder();
//		for(int i=s.length()-1;i>=0;i--)
//			ans.append(s.charAt(i));
//		return ans.toString();
//    }
}
