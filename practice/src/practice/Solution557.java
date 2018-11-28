package practice;

public class Solution557 {
	
	//sol2 fixed form 1.
	public String reverseWords(String s) {
		StringBuilder ans=new StringBuilder();
        String S[]=s.split(" ");
        for(String str:S)
        	ans.append(new StringBuffer(str).reverse().toString()+" ");
//        	ans.append(new StringBuilder().append(str).reverse().append(" "));
        return ans.toString().trim();
    }
	//sol1 
//	public String reverseWords(String s) {
//		StringBuilder ans=new StringBuilder();
//        String S[]=s.split(" ");
//        for(String str:S)
//        {
//        	StringBuilder tmp=new StringBuilder();
//        	tmp.append(str).reverse().append(" ");
//        	ans.append(tmp);
//        }
////        return ans.replace(s.length(), s.length()+1, "").toString();
//        return ans.toString().trim();
//    }	

}
