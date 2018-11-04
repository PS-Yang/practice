package practice;

public class Solution415 {
	//sol3
	public String addStrings(String num1, String num2) {
		StringBuilder ans=new StringBuilder();
		int i=num1.length()-1;
		int j=num2.length()-1;
		int carry=0;
        while(i>=0 || j>=0)
        {
        	int a= i>=0 ? num1.charAt(i)-'0' : 0;
        	int b= j>=0 ? num2.charAt(j)-'0' : 0;
        	ans.append((a+b+carry)%10);
        	carry=(a+b+carry)/10;
        	i--;
        	j--;
        }
        if(carry==1)
        	ans.append(1);
        return ans.reverse().toString();
    }
	
//	//sol 2
//		public String addStrings(String num1, String num2) {
//			String ans="";
//			int i=num1.length()-1;
//			int j=num2.length()-1;
//			int carry=0;
//	        while(i>=0 || j>=0)
//	        {
//	        	int a= i>=0 ? num1.charAt(i)-'0' : 0;
//	        	int b= j>=0 ? num2.charAt(j)-'0' : 0;
//	        	ans=(a+b+carry)%10+ans;
//	        	carry=(a+b+carry)/10;
//	        	i--;
//	        	j--;
//	        }
//	        if(carry==1)
//	        	ans="1"+ans;
//	        return ans;
//	    }
	
//	//sol 1
//	public String addStrings(String num1, String num2) {
//		String ans="";
//		int i=num1.length()-1;
//		int j=num2.length()-1;
//		int carry=0;
//        while(i>=0 && j>=0)
//        {
//        	int a=num1.charAt(i)-'0';
//        	int b=num2.charAt(j)-'0';
//        	ans=(a+b+carry)%10+ans;
//        	if(a+b+carry>9)
//        		carry=1;
//        	else
//        		carry=0;
//        	i--;
//        	j--;
//        }
//        while(i>=0)
//        {
//        	int a=num1.charAt(i)-'0';
//        	ans=(a+carry)%10+ans;
//        	if(a+carry>9)
//        		carry=1;
//        	else
//        		carry=0;
//        	i--;
//        }
//        while(j>=0)
//        {
//        	int b=num2.charAt(j)-'0';
//        	ans=(b+carry)%10+ans;
//        	if(b+carry>9)
//        		carry=1;
//        	else
//        		carry=0;
//        	j--;
//        }
//        if(carry==1)
//        	ans="1"+ans;
//        return ans;
//    }
}
